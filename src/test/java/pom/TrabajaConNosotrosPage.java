package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrabajaConNosotrosPage extends base{
    public TrabajaConNosotrosPage(WebDriver driver) {
        super(driver);
    }
    By btnTrabaja = By.xpath("//a[@href='https://careers-meli.mercadolibre.com/?utm_campaign=site-mlm&utm_source=mercadolibre&utm_medium=mercadolibre']");
    By lblVerOpurtunidades = By.xpath("//span[contains(text(),'Ver oportunidades')]");

    public void clickTrabaja(){
        click(btnTrabaja);
    }
    public boolean VerOportunidades(){
        if(isDisplayed(lblVerOpurtunidades)){
            System.out.println("Estas en el apartado traba con nosotros");
            return true;
        }else{
            System.out.println("Elemento no encontrado");
            return false;
        }

    }
}
