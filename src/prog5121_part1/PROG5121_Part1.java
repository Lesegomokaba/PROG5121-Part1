/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog5121_part1;

import java.util.Scanner;

public class PROG5121_Part1 {
// Main class controls the execution of the registration and login process.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
System.out.println("Enter your first name:");
        String firstName = input.nextLine();

        System.out.println("Enter your last name:");
        String lastname = input.nextLine();
        
        Login login = new Login();
        login.setfirstName(firstName);
        login.setlastname(lastname);
        
        
        System.out.println("Enter your username:");
String username = input.nextLine();

login.setusername(username);


System.out.println("Enter your password:");
String password = input.nextLine();

login.setPassword(password);

System.out.println("Enter your cellphone number:");
String cellphone = input.nextLine();

login.setcellphone(cellphone);


String registrationMessage = login.registerUser();

System.out.println(registrationMessage);

System.out.println("Enter your username to login:");
String loginUsername = input.nextLine();

System.out.println("Enter your password to login:");
String loginPassword = input.nextLine();

login.setLoginUsername(loginUsername);
login.setLoginPassword(loginPassword);

boolean loginResult = login.loginUser();
System.out.println(login.returnLoginStatus());


    }
   
}
