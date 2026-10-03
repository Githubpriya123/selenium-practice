package com.priyanka.practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Test1 {
 public static void main(String[] args) {
    WebDriver d= new ChromeDriver();

    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Page load timeout
        d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
 d.get("https://demoqa.com/automation-practice-form");

d.findElement(By.id("firstName")).sendKeys("Priyanka");
d.findElement(By.id("lastName")).sendKeys("Pradhan");
d.findElement(By.xpath("//input[@type='radio' and @value='Female']")).click();
d.findElement(By.id("userNumber")).sendKeys("8249770802");
d.findElement(By.id("dateOfBirthInput")).sendKeys("12 September 2026");
d.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.ENTER);
WebElement e= d.findElement(By.cssSelector("input[id^='subjectsInput']"));
e.click();
e.sendKeys("Maths");
d.findElement(By.cssSelector("input[id^='subjectsInput']")).sendKeys(Keys.ENTER);



d.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();


WebElement upload = d.findElement(By.id("uploadPicture"));

upload.sendKeys("C:/Users/DELL/Downloads/Needs Attention.png");
d.findElement(By.id("currentAddress")).sendKeys("Siri Lotus live in appartment");

d.findElement(By.id("react-select-3-input")).click();

d.findElement(By.xpath("//div[text()='NCR']")).click();
// 
d.findElement(By.id("react-select-4-input")).click();
d.findElement(By.xpath("//div[text()='Delhi']")).click();
d.findElement(By.id("submit")).click();
d.findElement(By.id("closeLargeModal")).click();


}
}
