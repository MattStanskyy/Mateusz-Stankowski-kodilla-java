package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_AGREE_BUTTON = "//div[contains(@class, \"_9o-r\")]/button[2]";
    public static final String XPATH_SIGNUP_BUTTON = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_DAY_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement agreeButton = driver.findElement(By.xpath(XPATH_AGREE_BUTTON));
        agreeButton.click();

        WebElement signUpButton = driver.findElement(By.xpath(XPATH_SIGNUP_BUTTON));
        signUpButton.click();

        Thread.sleep(2000);

        WebElement daySelect = driver.findElement(By.xpath(XPATH_DAY_SELECT));
        Select selectDayBoard = new Select(daySelect);
        selectDayBoard.selectByIndex(16);

        WebElement monthSelect = driver.findElement(By.xpath(XPATH_MONTH_SELECT));
        Select selectMonthBoard = new Select(monthSelect);
        selectMonthBoard.selectByIndex(5);

        WebElement yearSelect = driver.findElement(By.xpath(XPATH_YEAR_SELECT));
        Select selectYearBoard = new Select(yearSelect);
        selectYearBoard.selectByValue("1995");
    }
}
