package RegistrationClass;

public class RegistrationClass {
   private String userName;
    private String Email;
    private String Password;

 public void setUserName(String userName){
        this.userName=userName;
    }
    public void setEmail(String Email){
     this.Email=Email;
    }
    public void setPassword(String Password) {
        this.Password= Password;
    }
    public String getEmail() {
        return Email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return Password;
    }

    public static void main(String[] args) {

        RegistrationClass reg = new RegistrationClass();

        // Set values using the setter methods
        reg.setEmail("user@example.com");
        reg.setUserName("user123");
        reg.setPassword("securePassword");

        // Optional: Print values using getter methods
        System.out.println("Email: " + reg.getEmail());
        System.out.println("Username: " + reg.getUserName());
        System.out.println("Password: " + reg.getPassword());
    }
}
