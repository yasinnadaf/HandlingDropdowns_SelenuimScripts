package com.test;

import com.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FaceBookTest extends BaseClass {
    @BeforeTest
    public void init(){
        initialization();
    }

    @Test
    public void createAccTest(){
        WebElement btn = driver.findElement(By.linkText("Create new account"));
        btn.click();
        driver.findElement(By.name("firstname")).sendKeys("ashar");
        driver.findElement(By.name("lastname")).sendKeys("nadaf");
        driver.findElement(By.name("reg_passwd__")).sendKeys("AA@1212");

        WebElement day = driver.findElement(By.name("day"));
        Select slctByValue = new Select(day);
        slctByValue.selectByValue("3");

        WebElement month = driver.findElement(By.name("month"));
        Select slctByIndex = new Select(month);
        slctByIndex.selectByIndex(5);

        WebElement year = driver.findElement(By.name("year"));
        Select  slctByVisibleTxt = new Select(year);
        slctByVisibleTxt.selectByVisibleText("2000");

        driver.findElement(By.name("websubmit")).click();
    }

    @AfterTest
    public void closeWindow(){
        close();
    }

}
