/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package prog5121_part1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leseg
 */
public class LoginTest {    
    Login login = new Login();
    public LoginTest() {
    }
    @BeforeClass
public static void setUpClass() {
}

@AfterClass
public static void tearDownClass() {
}

@Before
public void setUp() {
}

@After
public void tearDown() {
}
  
    
 @Test
public void testLoginFailed() {
    login.setusername("kyl_1");
    login.setPassword("Ch&&sec@ke99!");
    login.setLoginUsername("wrong_user");
    login.setLoginPassword("wrong_password");

    assertFalse(login.loginUser());
}

@Test public void testCheckUserNameCorrect() { login.setusername("kyl_1"); assertTrue(login.checkusername()); } @Test public void testCheckUserNameIncorrect() { login.setusername("kyle!!!!!!!"); assertFalse(login.checkusername()); } @Test public void testCheckPasswordComplexityCorrect() { login.setPassword("Ch&&sec@ke99!"); assertTrue(login.checkpasswordcomplexity()); } @Test public void testCheckPasswordComplexityIncorrect() { login.setPassword("password"); assertFalse(login.checkpasswordcomplexity()); } @Test public void testCheckCellPhoneNumberCorrect() { login.setcellphone("+27838968976"); assertTrue(login.checkCellPhoneNumber()); } @Test public void testCheckCellPhoneNumberIncorrect() { login.setcellphone("08966553"); assertFalse(login.checkCellPhoneNumber()); } @Test public void testLoginSuccessful() { login.setusername("kyl_1"); login.setPassword("Ch&&sec@ke99!"); login.setLoginUsername("kyl_1"); login.setLoginPassword("Ch&&sec@ke99!"); assertTrue(login.loginuser()); }
}