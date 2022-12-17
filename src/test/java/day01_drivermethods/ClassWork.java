package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork {
    /* Class Work:
    Yeni bir package olusturalim : day01
    Yeni bir class olusturalim : C03_GetMethods
    Amazon sayfasina gidelim. https://www.amazon.com/
    Sayfa basligini(title) yazdirin
    Sayfa basliginin “Amazon” icerdigini test edin
    Sayfa adresini(url) yazdirin
    Sayfa url’inin “amazon” icerdigini test edin.
    Sayfa handle degerini yazdirin
    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
    Sayfayi kapatin.

     */
    public static void main(String[] args) {
        System.setProperty("web driver.chrome.driver","src/resources/driver/chromedriver");
        WebDriver driver =new ChromeDriver();
        //    Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://de.aliexpress.com/");
        //    Sayfa basligini(title) yazdirin
        System.out.println("Sayfa bashligi : " +driver.getTitle());
        //    Sayfa basliginin “Aliexpress” icerdigini test edin

        String actualTitle = driver.getTitle();

        if (actualTitle.contains("aliexpress")){

            System.out.println("Title testi PASSED");

        }else System.out.println("Title testi FAILED");


        //    Sayfa adresini(url) yazdirin

        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());


        //    Sayfa url’inin “amazon” icerdigini test edin.
        String actually = driver.getCurrentUrl();

        //    Sayfa handle degerini yazdirin

        System.out.println("Window Handle Değeri : "+driver.getWindowHandle());

        //    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin

        String sayfaKodlari = driver.getPageSource();
        if(sayfaKodlari.contains("Gateway")){
            System.out.println("Source Code Testi PASSED");
        }else System.out.println("Source Code Testi FAILED");

        //    Sayfayi kapatin.

        driver.close();


    }

        }
