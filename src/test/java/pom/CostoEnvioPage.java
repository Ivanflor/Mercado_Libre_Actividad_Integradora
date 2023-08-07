package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CostoEnvioPage extends base{
    public CostoEnvioPage(WebDriver driver) {
        super(driver);
    }
    By lblEnvioGratis = By.xpath("//p[@class = 'ui-pdp-color--GREEN ui-pdp-family--REGULAR ui-pdp-media__title']");

    public boolean EnvioGratis(){
        if(isDisplayed(lblEnvioGratis)){
            System.out.println("Envio Gratis");
            return true;
        }else{
            System.out.println("Producto no encontrado");
            return false;
        }

    }
}
