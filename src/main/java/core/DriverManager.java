package core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {
    public WebDriver navegador;
    public void Start(){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("http://sampleapp.tricentis.com/101/app.php");

    }
    public void scrollDown(By element){
        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("arguments[0].scrollIntoView();", getElement (element));
    }

    public WebElement getElement(By by) {
        return new WebDriverWait(navegador, 3).until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
