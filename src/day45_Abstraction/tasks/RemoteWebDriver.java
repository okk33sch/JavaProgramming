package day45_Abstraction.tasks;

public class RemoteWebDriver implements WebDriver, TakeScreenShot, JavaScriptExecuter{
    private final String browserName;

    public RemoteWebDriver(String browserName) {
        if (browserName.isBlank() || browserName.isEmpty()){
            throw new RuntimeException("Invalid browser name: "+browserName);
        }
        this.browserName = browserName;
    }

    @Override
    public void executeScript(String script) {
        System.out.println("Executing \"" + script + "\" script on" + browserName + " browser");
    }

    @Override
    public void findElements(String locator) {
        System.out.println(browserName + " driver locating multiple elements by " + locator);
    }

    @Override
    public void findElement(String locator) {
        System.out.println(browserName + " driver locating an element by " + locator);
    }

    @Override
    public void takeScreenShot() {
        System.out.println("Taking screenshot on: " + browserName + " browser");
    }

    @Override
    public void get(String url) {
        System.out.println("Getting the "+ url +" on " + browserName + " browser");
    }

    @Override
    public void close() {
        System.out.println("Closing the tab on " + browserName + " browser");
    }

    @Override
    public void quit() {
        System.out.println("Quiting the " + browserName + " browser");
    }

    @Override
    public void getTitle() {
        System.out.println(browserName + "driver is getting the title");
    }

    @Override
    public String toString() {
        return "Opening "+ browserName +"browserName" + '\'' +
                '}';
    }
}
