
package com.mycompany.userapp;
public class UserApp {
    private String userId;
    private String email;

    public UserApp(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public void updateEmail(String newEmail) { this.email = newEmail; }
    public static void main(String[] args) {
        System.out.println("da thanh cong");
    }
}
