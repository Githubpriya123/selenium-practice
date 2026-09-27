package com.priyanka.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
 public static void main(String[] args) {
    WebDriver d= new ChromeDriver();
 d.get("https://demoqa.com/automation-practice-form");

d.findElement(By.id("firstName")).sendKeys("Priyanka");

}
}
