package tests;

import Pages.DadosVeiculoPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsTest {
    @Test
    public void entrarSite(){
        DadosVeiculoPage dadosVeiculoPage = new DadosVeiculoPage();
        dadosVeiculoPage.selecionoDados();
    }
}
