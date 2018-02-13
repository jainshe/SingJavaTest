//package practice;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.util.List;
//
///**
// * @author shefali.jain
// */
//public class Selenium {
//
//
//    public static void main(String args[]){
//        System.setProperty("webdriver.gecko.driver", "/Users/shefali.jain/personal/work/olacare/switchProjects/driver/geckodriver");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://www.amazon.in/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=moto");
//
//            List<WebElement> links = driver.findElements(By.partialLinkText("Moto"));
//        for(int i=0;i<links.size();i++)
//            System.out.println(links.get(i).getText());
//
//        for(int i=0;i<links.size();i++){
//            links.get(i).click();
//
//            //driver.navigate().back();
//
//
//
//        }
//    }
//}
