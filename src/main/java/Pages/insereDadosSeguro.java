package Pages;

import core.DriverManager;
import org.openqa.selenium.By;

public class insereDadosSeguro extends DriverManager {
        public By txtName = By.xpath("//*[@id=\"firstname\"]");

        public void selecionoDados(){
            navegador.findElement(txtName).sendKeys();
        }

    }
