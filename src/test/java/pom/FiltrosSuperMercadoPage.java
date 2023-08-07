package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FiltrosSuperMercadoPage extends base{
    public FiltrosSuperMercadoPage(WebDriver driver) {
        super(driver);
    }
    By btnSuperMercado = By.xpath("//a[normalize-space()='Supermercado']");
    By lblCategorias = By.xpath("//h2[normalize-space()='NUESTRAS CATEGORÍAS']");
    By lblOfertas = By.xpath("//h3[normalize-space()='ofertas']");
    By lblCuidadoPersonal = By.xpath("//h3[normalize-space()='cuidado personal']");
    By lblBelleza = By.xpath("//h3[normalize-space()='Belleza']");
    By lblBebidas = By.xpath("//h3[normalize-space()='Bebidas']");

    public void clickSuperMercado() throws InterruptedException {
        Thread.sleep(2000);


        click(btnSuperMercado);
    }
    public String CategoriasSuperMercado(){
        isDisplayed(lblCategorias);
        String result = getText(lblCategorias);
        return result;
    }
    public String Ofertas(){
        isDisplayed(lblOfertas);
        String result = getText(lblOfertas);
        return result;
    }

    public String CuidadoPersonal(){
        isDisplayed(lblCuidadoPersonal);
        String result = getText(lblCuidadoPersonal);
        return result;
    }
    public String Belleza(){
        isDisplayed(lblBelleza);
        String result = getText(lblBelleza);
        return result;
    }
    public String Bebidas(){
        isDisplayed(lblBebidas);
        String result = getText(lblBebidas);
        return result;
    }
}
