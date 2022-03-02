function triggerKeyboardEvent(el, keyCode, type)
{
    var eventObj = document.createEventObject ?
        document.createEventObject() : document.createEvent("Events");

    if(eventObj.initEvent){
        eventObj.initEvent(type, true, true);
    }

    eventObj.keyCode = keyCode;
    eventObj.which = keyCode;

    el.dispatchEvent ? el.dispatchEvent(eventObj) : el.fireEvent("onkeydown", eventObj);

}
$=$$
parent_elem = $('table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(1) > td > div > div')
text_content = parent_elem[3].textContent
content = text_content.split('');
words = text_content.split(' ');

function press_key(i) {
    input = $('table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(2) > td > input')[0]
    input.focus();
    input.value += content[i];
    triggerKeyboardEvent(input, input.value.charCodeAt(0), "keydown")
    input.click()
    triggerKeyboardEvent(input, input.value.charCodeAt(0), "keypress")
    triggerKeyboardEvent(input, input.value.charCodeAt(0), "keyup")
}

function run(i, cb) {
    if (i >= (content.length - 1)) {
        cb();
        return
    }
    press_key(i);
    setTimeout(function() {run(i+1, cb)}, 50 * Math.random());
}

function watch_wpm() {
    current_wpm = parseInt(parent_elem[2].textContent.split(' ')[0])
    console.log(current_wpm)
    if(current_wpm > 99) {
        setTimeout(watch_wpm, 700)
    } else {
        console.log('pressing last key')
        press_key(content.length - 1, function() {})
    }
}
run(0, watch_wpm);