package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApartadosOfertasPage extends base{
    public ApartadosOfertasPage(WebDriver driver) {
        super(driver);
    }
    By btnOfertas = By.xpath("//a[@href='https://www.mercadolibre.com.mx/ofertas#nav-header']");
    By imgTodasOfertas = By.xpath("//img[@src='https://http2.mlstatic.com/storage/splinter-admin/o:f_webp,q_auto:best/1583341146061-todas-las-ofertas@3x.png']");
    By lblofertasRelampago = By.xpath("//p[normalize-space()='Ofertas relámpago']");

    By lblLiquidacion = By.xpath("//p[normalize-space()='Liquidación']");

    public void clickOfertas() throws InterruptedException {
        Thread.sleep(2000);
        click(btnOfertas);
    }
    public boolean PaginaOfertas(){
        if(isDisplayed(imgTodasOfertas)){
            System.out.println("Estas en el apartado de Ofertas");
            return true;
        } else {
            System.out.println("Elemento no encontrado");
            return false;
        }
    }
    public String OfertasRelampago() {
        isDisplayed(lblofertasRelampago);
        String result = getText(lblofertasRelampago);
        return result;

    }

    public String Ofertas()  {
        isDisplayed(lblLiquidacion);
        String result = getText(lblLiquidacion);
        return result;
    }

}
