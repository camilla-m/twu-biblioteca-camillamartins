package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LoginTest {

    Login correctLogin = new Login("123-4567", "biblio123", "Peter", "logan@thoughtworks.com",
            "96613215");
    Login incorrectLogin = new Login("123-4507", "biblio123", "Name", "email", "35261726");

    @Test
    public void shouldLogin() {
        assertEquals(true, Login.loginUser(correctLogin));
    }

    @Test
    public void shouldNotLogin() {
        assertEquals(false, Login.loginUser(incorrectLogin));
    }

    @Test
    public void shouldConvertLoginCorrectly() {
        assertEquals(correctLogin.username, Login.convertUsernameToLogin("123-4567", "biblio123").username);
    }

    @Test
    public void shouldConvertLoginIncorrectly() {
        assertEquals(null, Login.convertUsernameToLogin("123-4569", "biblio123"));
    }

    @Test
    public void shouldReturnPersonalInfos() {
        assertEquals("Name: " + correctLogin.name + " / Email: " + correctLogin.email + " / Phone: " + correctLogin.phone,
                Login.convertLoginInfosToString(correctLogin));
    }
}
