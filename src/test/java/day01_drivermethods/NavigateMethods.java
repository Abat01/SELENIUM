package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver","src/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Shein sayfasina gidelim
        driver.navigate().to("https://de.shein.com/");

        //Getir sayfasina gidelim
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().to("https://de.aliexpress.com/");


        //TEkrar Shein sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();

        //Tekrar medium sayfaya gidelim

        driver.navigate().forward();
        //Son sayfayi refresh yap
        driver.navigate().refresh();

        //Sayfayi close

        driver.close();



    }
}
