package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecomendacionesIphonePage extends base{
    public RecomendacionesIphonePage(WebDriver driver) {
        super(driver);
    }
    //buscador de mercado libre
    By txtBuscadorML = By.xpath("//input[@id='cb1-edit']");
    By btnSubmit = By.xpath("//button[@type='submit']");
    //busqueda de producto especifico iphone
    By btnIphone = By.xpath("//img[@src='https://http2.mlstatic.com/D_NQ_NP_902815-MLU69495829197_052023-V.webp']");
    By clickHomeML = By.xpath("//a[contains(text(),'Mercado Libre')]");
    //verificacion que estoy dentro de mi producto buscado
    By txtIphone14 = By.xpath("//h1[@class='ui-pdp-title']");
    By lblUltimaVisita = By.xpath("//h2[contains(text(),'Basado en tu última visita')]");
    // definiciones

    public void txtBuscadoML(){
        type("Iphone",txtBuscadorML);
    }
    public void clickBtnSubmit() throws InterruptedException {
        Thread.sleep(2000);
        click(btnSubmit);
    }
    public void clickIpnhone() throws InterruptedException {
        Thread.sleep(2000);
        click(btnIphone);
    }
    public boolean VerificarProductoBuscado()
    {
        if(isDisplayed(txtIphone14)){
            System.out.println("Producto Iphone encontrado");
            return true;
        }else{
            System.out.println("Producto no encontrado");
            return false;
        }

    }
    public void clickHome() throws InterruptedException {
        Thread.sleep(2000);
        click(clickHomeML);}
      public boolean VerificarRecomendacion()
    {
        if(isDisplayed(lblUltimaVisita)){
            System.out.println("Recomendacion recibida");
            return true;
        }else{
            System.out.println("Producto no encontrado");
            return false;
        }

    }
}
