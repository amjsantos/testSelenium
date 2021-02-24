package Pages;

import core.DriverManager;
import org.openqa.selenium.By;


public class DadosVeiculoPage extends DriverManager {
    public By cbbMake = By.xpath("//*[@id=\"make\"]/option[6]");
    public By cbbModel = By.xpath("//*[@id=\"model\"]/option[3]");
    public By btnNext = By.xpath("//*[@id=\"nextenterinsurantdata\"]");

    public void selecionoDados(){
        Start();
        navegador.findElement(cbbMake).click();
        navegador.findElement(cbbModel).click();
        scrollDown(btnNext);
        navegador.findElement(btnNext).click();
    }


}
