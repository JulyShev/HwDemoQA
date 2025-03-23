package com.demoqa.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @Test
    public void newUserRegPositiveTest(){

//    clickRegistrLink
        click(By.cssSelector("[href='/register']"));

//    chooseGender
        click(By.cssSelector("#gender-male"));

//    enterFistName
        type(By.cssSelector("#FirstName"),"Rob");

//    enterLastName
        type(By.cssSelector("#LastName"),"Rubonovich");
//    enterEmail
        type(By.cssSelector("#Email"),"Robby@mail.com");

//    enterPassword
        type(By.cssSelector("#Password"),"QwEr0987#");

//    passwordConfirm
        type(By.cssSelector("#ConfirmPassword"),"QwEr0987#");

//    clickRegisterButton
        click(By.cssSelector("[type='submit']#register-button"));

//    verifyContinueButton
        Assert.assertTrue(isElementPresent(By.cssSelector(".buttons:nth-child(2)")));
    }
}
