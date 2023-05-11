package com.automation.testcases;

import com.automation.categories.RegressionTest;
import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LoginTest extends BaseTest{
    @Test
    @Category(SmokeTest.class)
    public void verifyUserCanLogin(){

        System.out.println("Verify login successful");
    }
    @Test
    public void verifyUserCanResentPassword(){

        System.out.println("Verify user can resent password");
    }
    @Test
    public void verifyUserCannotLoginWithInvalidCredentials(){
        System.out.println("Verify login unsuccessful for invalid credentials");
    }

}
