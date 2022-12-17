import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstSelenium {
    public static void main(String[] args) {

     System.setProperty("web driver.chrome.driver","src/resources/driver/chromedriver");

     WebDriver driver = new ChromeDriver();

     driver.get("https://de.aliexpress.com/?gatewayAdapt=glo2deu");
     /*
     En temel haliyle otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan
webdriver'in yerini gostermemiz gerekir. Bunun icin Java kutuphanesinden System.setProperty()
method'unun icine ilk olarak driver'i yazariz. Ikinci olarak driver'in fiziki yolunu kopyalariz.
      */
    }
}
