package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePage {

    WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.google.com");
    }

    public void search(String keyword) {
        driver.findElement(By.name("q")).sendKeys(keyword + Keys.ENTER);
    }
}