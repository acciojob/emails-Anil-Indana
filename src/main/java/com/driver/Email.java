package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(oldPassword.equals(this.password)){
            if(isValid(newPassword)){
                this.password = newPassword;
            }
        }
    }
    public boolean isValid(String newPassword){
        if(newPassword.length() < 8) return  false;
        boolean upperCase = false,lowerCase = false,digit = false,special = false;
        if(newPassword.length() >= 8) {
            for (int i = 0; i < newPassword.length(); i++) {
                char c = newPassword.charAt(i);
                if (c <= 'z' && c >= 'a') lowerCase = true;
                else if (c <= 'Z' && c >= 'A') upperCase = true;
                else if (c <= '9' && c >= '0') digit = true;
                else special = true;
            }
        }
        if(upperCase && lowerCase && digit && special) return true;
        return false;
    }
}
