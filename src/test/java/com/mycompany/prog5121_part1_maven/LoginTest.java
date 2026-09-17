package com.mycompany.prog5121_part1_maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    // 1. Username correctly formatted
    @Test
    public void testUsernameCorrectlyFormatted() {
        Login login = new Login();
        login.setusername("kyl_1");

        assertTrue(login.checkusername());
    }

    // 2. Username incorrectly formatted
    @Test
    public void testUsernameIncorrectlyFormatted() {
        Login login = new Login();
        login.setusername("kyle!!!!!!!");

        assertFalse(login.checkusername());
    }

    // 3. Password meets complexity requirements
    @Test
    public void testPasswordMeetsComplexity() {
        Login login = new Login();
        login.setPassword("Ch&&sec@ke99!");

        assertTrue(login.checkpasswordcomplexity());
    }

    // 4. Password does not meet complexity requirements
    @Test
    public void testPasswordDoesNotMeetComplexity() {
        Login login = new Login();
        login.setPassword("password");

        assertFalse(login.checkpasswordcomplexity());
    }

    // 5. Cell phone correctly formatted
    @Test
    public void testCellPhoneCorrectlyFormatted() {
        Login login = new Login();
        login.setcellphone("+27838968976");

        assertTrue(login.checkCellPhoneNumber());
    }

    // 6. Cell phone incorrectly formatted
    @Test
    public void testCellPhoneIncorrectlyFormatted() {
        Login login = new Login();
        login.setcellphone("08966553");

        assertFalse(login.checkCellPhoneNumber());
    }

    // 7. Login successful
    @Test
    public void testLoginSuccessful() {
        Login login = new Login();

        login.setusername("kyl_1");
        login.setPassword("Ch&&sec@ke99!");
        login.setfirstName("Lesego");
        login.setlastname("Mokaba");

        login.setLoginUsername("kyl_1");
        login.setLoginPassword("Ch&&sec@ke99!");

        assertTrue(login.loginUser());
    }

    // 8. Login failed
    @Test
    public void testLoginFailed() {
        Login login = new Login();

        login.setusername("kyl_1");
        login.setPassword("Ch&&sec@ke99!");

        login.setLoginUsername("wrong");
        login.setLoginPassword("wrong");

        assertFalse(login.loginUser());
    }

    // 9. Username correctly formatted - Boolean test
    @Test
    public void testUsernameCorrectlyFormattedBoolean() {
        Login login = new Login();
        login.setusername("kyl_1");

        assertTrue(login.checkusername());
    }

    // 10. Username incorrectly formatted - Boolean test
    @Test
    public void testUsernameIncorrectlyFormattedBoolean() {
        Login login = new Login();
        login.setusername("kyle!!!!!!!");

        assertFalse(login.checkusername());
    }

    // 11. Password meets complexity - Boolean test
    @Test
    public void testPasswordMeetsComplexityBoolean() {
        Login login = new Login();
        login.setPassword("Ch&&sec@ke99!");

        assertTrue(login.checkpasswordcomplexity());
    }

    // 12. Password does not meet complexity - Boolean test
    @Test
    public void testPasswordDoesNotMeetComplexityBoolean() {
        Login login = new Login();
        login.setPassword("password");

        assertFalse(login.checkpasswordcomplexity());
    }

    // 13. Cell phone correctly formatted - Boolean test
    @Test
    public void testCellPhoneCorrectlyFormattedBoolean() {
        Login login = new Login();
        login.setcellphone("+27838968976");

        assertTrue(login.checkCellPhoneNumber());
    }

    // 14. Cell phone incorrectly formatted - Boolean test
    @Test
    public void testCellPhoneIncorrectlyFormattedBoolean() {
        Login login = new Login();
        login.setcellphone("08966553");

        assertFalse(login.checkCellPhoneNumber());
    }
}