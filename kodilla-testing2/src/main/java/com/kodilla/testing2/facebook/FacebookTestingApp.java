package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_AGREEBUTTON = "//div[contains(@class, \"_9o-r\")]/button[2]";
    public static final String XPATH_SIGNUPBUTTON = "//div[contains(@class, \"_6ltg\")]/a";
//    public static final String XPATH_DAY_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_DAY_SELECT = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement agreeButton = driver.findElement(By.xpath(XPATH_AGREEBUTTON));
        agreeButton.click();

        WebElement signUpButton = driver.findElement(By.xpath(XPATH_SIGNUPBUTTON));
        signUpButton.click();

//        while (!driver.findElement(By.xpath(XPATH_DAY_SELECT)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_DAY_SELECT));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(15);
    }
}
