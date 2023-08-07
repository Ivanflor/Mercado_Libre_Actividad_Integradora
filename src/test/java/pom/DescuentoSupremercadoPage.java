package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DescuentoSupremercadoPage extends base{
    public DescuentoSupremercadoPage(WebDriver driver) {
        super(driver);
    }

    By btnDescuento = By.xpath("//span[normalize-space()='Desde 50% OFF']");
    By btnOfertas = By.xpath("//img[@alt='ofertas']");
    By lblDescuento = By.xpath("//div[@class='andes-tag__label']");

    public void clickOfertasSupermercado() throws InterruptedException {
        Thread.sleep(2000);
        click(btnOfertas);
    }

    public void clickDescuento() throws InterruptedException {
        Thread.sleep(2000);
        click(btnDescuento);
    }
    public Boolean EtiquetaDescuento(){
        if(isDisplayed(lblDescuento)){
            System.out.println("Productos filtrados por el 50% de descuento");
            return true;
        } else {
            System.out.println("Elemento no encontrado");
            return false;
        }
    }
}
