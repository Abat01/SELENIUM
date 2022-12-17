package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver","src/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        // go to ""Shein" url web page
        driver.get("https://de.shein.com/");


        // write url sizes and location
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //in web page must maximize
        System.out.println("Sayfanin konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari = " + driver.manage().window().getSize());

        //url must fullscreen
        Thread.sleep(3000);
        driver.manage().window().fullscreen();


        //Do url page fullscreen location and sizes
        System.out.println("Sayfanin konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari = " + driver.manage().window().getSize());



        //Close the page
        driver.close();
    }
}
