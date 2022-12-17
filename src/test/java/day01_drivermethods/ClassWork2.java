package day01_drivermethods;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClassWork2 {
    public static void main(String[] args) {
        System.setProperty("web driver.chrome.driver","src/resources/driver/chromedriver");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Bu method sayfadaki her bir web element icin
        // max. bekleme suresini belirler

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://medium.com/");
        String actualTitle =driver.getTitle();
        if (actualTitle.contains("Medium")){
            System.out.println("Title Testi PASSED : ");
        }else System.out.println("Title Testi FAILED : ");
        System.out.println("Dogru BAshlik : "+ actualTitle);


        //Sayfa URL’inin “medium” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("Medium")) {
            System.out.println("URL testi PASSED");
        } else System.out.println("URL testi FAİLED" + actualUrl);
        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

        //https://www.walmart.com/ sayfasina gidin.
        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        String actualWalmartTitle = driver.getTitle();
        String expectedWalmartTitle = "walmart.com";
        if(actualWalmartTitle.contains(expectedWalmartTitle)){
            System.out.println("Title testi PASSED");
        } else System.out.println("Title testi FAİLED");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.


        //Tekrar “medium” sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();


        //Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
        driver.close();
    }
}
