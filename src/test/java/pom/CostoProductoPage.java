package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CostoProductoPage extends base{
    public CostoProductoPage(WebDriver driver) {
        super(driver);
    }
    //buscador de mercado libre
    By txtBuscadorML = By.xpath("//input[@id='cb1-edit']");
    By btnSubmit = By.xpath("//button[@type='submit']");
    //busqueda de producto especifico 1000 cubrebocas tricapa termosellado plisado tapabocas
    By clickProdcutoCubrebocas = By.xpath("//img[@src='https://http2.mlstatic.com/D_NQ_NP_672753-MLM69370826845_052023-V.webp']");
    //verificacion que estoy dentro de mi producto buscado
    By txt1000Cubrebocas = By.xpath("//h1[contains(text(),'1000 Cubrebocas Tricapa Termosellado Plisado Tapab')]");
    By lblcosto = By.xpath("//span[normalize-space()='539']");
    // definiciones

    public void txtBuscador(){
        type("1000 cubrebocas tricapa termosellado plisado tapabocas", txtBuscadorML);
    }
    public void clickBtnSubmit() throws InterruptedException {
        Thread.sleep(2000);
        click(btnSubmit);
    }
    public void clickPoducto() throws InterruptedException {
        Thread.sleep(2000);
        click(clickProdcutoCubrebocas);
    }
    public boolean VerificarProductoBuscado()
        {
            if(isDisplayed(txt1000Cubrebocas)){
                System.out.println("Producto cubre bocas encontrado");
                return true;
            }else{
                System.out.println("Producto no encontrado");
                return false;
            }

    }
    public String VerificacionCosto(){
        isDisplayed(lblcosto);
        String result = getText(lblcosto);
        return result;

    }


}
