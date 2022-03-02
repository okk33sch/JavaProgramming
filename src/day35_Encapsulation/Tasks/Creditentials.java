package day35_Encapsulation.Tasks;

public class Creditentials {
    private String username, password;

    public Creditentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isStrongPassWord(String password){
        boolean isStrongPassWord = false;

        boolean hasOneLetter = false;
        boolean hasSpecialCharacter = false;
        boolean hasOneDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            //(Character.isLetter(each))? (hasOneLetter = true) :(Character.isDigit(each))? (hasOneDigit = true) : (hasSpecialCharacter = true);


            if(Character.isLetter(each)){
                hasOneLetter = true;
            }else if(Character.isLetter(each)){
                hasOneLetter = true;
            }else{
                hasSpecialCharacter = true;
            }
        }

        if (hasOneLetter == true && hasOneDigit == true && hasSpecialCharacter == true && password.length() > 8 && !password.contains(" ")){
            isStrongPassWord = true;
        }
        return isStrongPassWord;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!isStrongPassWord(password)) {
            System.err.println("Password is not strong");
            return;
        }else {
            this.password = password;
        }
    }

    public String toString() {
        return "Creditentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
