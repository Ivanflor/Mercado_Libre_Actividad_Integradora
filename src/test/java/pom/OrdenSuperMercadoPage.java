package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrdenSuperMercadoPage extends base{
    public OrdenSuperMercadoPage(WebDriver driver) {
        super(driver);
    }
    By lblRelevancia = By.xpath("//div[@class='ui-search-view-options__group']");

    public boolean ordenMenorPrecio(){
        if(isDisplayed(lblRelevancia)){
            System.out.println("Ordenado por relevancia");
            return true;
        } else {
            System.out.println("Elemento no encontrado");
            return false;
        }
    }

}
