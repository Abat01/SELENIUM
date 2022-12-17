package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("web driver.chrome.driver","src/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.de/");
        System.out.println("Sayfa Bashligi : "+ driver.getTitle());
        // Icinde bulunan sayfanin basligini string olarak getirir
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());

        //System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle()); //bize o windowa ait Hash degerini verir. Biz bu hash degerlerini bir string'e atayip pencereler arasi gechish yapabiliriz.
    }
}
