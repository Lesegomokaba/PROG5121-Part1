/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Leseg
 *//*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121_part1_maven;

/**
 *
 * @author Leseg
 */
public class Login {
    // Login class handles user registration, validation, and authentication.
    private String username;
    private String password;
    private String cellphone;
    private String firstName;
    private String lastname;
    private String loginUsername;
    private String loginPassword;
    private String loginStatus;
    
    
    public boolean checkusername(){
        return username.contains("_") && username.length() <= 5;
        
    }
    
    public void setusername(String username) {
        this.username = username;
     }
    
 public boolean checkpasswordcomplexity() {
    return password.length() >= 8
            && password.matches(".*[A-Z].*")
            && password.matches(".*[0-9].*")
            && password.matches(".*[^a-zA-Z0-9].*");
}
 public void setPassword(String password) {
    this.password = password;
}
     public void setcellphone (String cellphone) {
    this.cellphone = cellphone;
}
     public boolean checkCellPhoneNumber() {
    return cellphone.matches("^\\+27[0-9]{9}$");
}
   public void setfirstName(String firstName) {
    this.firstName = firstName;
} 
   public void setlastname(String lastname) {
    this.lastname = lastname;
   }
   
  public String registerUser() {
    if (!checkusername()) {
        return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
    }

    if (!checkpasswordcomplexity()) {
        return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
    }

    if (!checkCellPhoneNumber()) {
        return "Cell phone number incorrectly formatted or does not contain international code.";
    }

    return "Username successfully captured.";
}
  
  public boolean loginuser() {
      return username.equals(username)&& password.equals(password);
  }
  
  
  
  public void setLoginUsername(String loginUsername) {
    this.loginUsername = loginUsername;
}
  
  public void setLoginPassword(String loginPassword) {
    this.loginPassword = loginPassword;
}
  
   public String returnLoginStatus() {
       return loginStatus;

     }
   
     public boolean loginUser() {
    if (username.equals(loginUsername) && password.equals(loginPassword)) {
        loginStatus = "Welcome " + firstName + ", " + lastname + " it is great to see you again.";
        return true;
    } else {
        loginStatus = "Username or password incorrect, please try again.";
        return false;
    }
}
  
  public static void main(String[] args) {
       Login login = new Login();
        login.setusername("kyl_1");
         login.setfirstName("Lesego");
    login.setlastname("Mokaba");
    
         System.out.println(login.checkusername());
          login.setPassword("Password1!");
          
           System.out.println(login.checkpasswordcomplexity());
            login.setcellphone("+27821234567");
             System.out.println(login.checkCellPhoneNumber());
             
             System.out.println(login.registerUser());
             
              login.setLoginUsername("kyl_1");
    login.setLoginPassword("Password1!");
    
    
    System.out.println(login.loginUser());
System.out.println(login.returnLoginStatus());

}
  
  
 }




    