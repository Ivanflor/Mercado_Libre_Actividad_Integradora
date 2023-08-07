package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FiltrosCalzadoPage extends base{
    public FiltrosCalzadoPage(WebDriver driver) {
        super(driver);
    }
    By btnModa = By.xpath("//a[@href='https://www.mercadolibre.com.mx/c/ropa-bolsas-y-calzado#nav-header']");
    By btnCalzado = By.xpath("//img[@src='https://http2.mlstatic.com/D_Q_NP_706704-MLA54187896180_032023-F00.jpg-G.webp']");
    By btnPrecio = By.xpath("//span[contains(text(),'Hasta $ 550')]");
    By btnHubicacion = By.xpath("//span[contains(text(),'Estado De México')]");
    By lblPrecio = By.xpath("//div[contains(text(),'Hasta $ 550')]");
    By lblHubucacion = By.xpath("//div[contains(text(),'Estado De México')]");

    public void clickModa(){
        click(btnModa);
    }
    public void clickClazdo(){
        click(btnCalzado);
    }
    public void clickPrecio(){
        click(btnPrecio);
    }
    public void clickHubicacion(){
        click(btnHubicacion);
    }
    public String Precio(){
        isDisplayed(lblPrecio);
        String result = getText(lblPrecio);
        return result;
    }
    public String Hubicacion(){
        isDisplayed(lblHubucacion);
        String result = getText(lblHubucacion);
        return result;
    }
}
