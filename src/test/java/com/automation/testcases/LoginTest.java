package com.automation.testcases;

import com.automation.categories.RegressionTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LoginTest extends BaseTest{
    @Test
    @Category(RegressionTest.class)
    public void verifyUserCanLogin(){

        System.out.println("Verify login successful");
    }
    @Test
    @Category(RegressionTest.class)
    public void verifyUserCanResentPassword(){

        System.out.println("Verify user can resent password");
    }
    @Test
    @Category(RegressionTest.class)
    public void verifyUserCannotLoginWithInvalidCredentials(){
        System.out.println("Verify login unsuccessful for invalid credentials");
    }

}
