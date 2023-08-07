package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class MetodosPagoPage extends base{

    public MetodosPagoPage(WebDriver driver) {
        super(driver);
    }

    //texto para verificar que estemos dentre de la pagina de mercado libre
    By imgmercadoLibre = By.xpath("//a[contains(text(),'Mercado Libre')]");
    //boton para cerrar cookies
    By btnCookies = By.xpath("//button[contains(text(),'Aceptar cookies')]");
    //btn para visualizar todos los metodos de pago
    By btncomoPagar = By.xpath("//a[normalize-space()='Cómo pagar con Mercado Pago']");
    //textos de  los diferentes metodos de pago como comprobacion
    By imgtarjetaCreditoDebito = By.xpath("//img[@alt='Tarjeta de crédito o débito']");

    By imgmercadoPago = By.xpath("//img[@alt='O con saldo de tu cuenta de Mercado Pago']");

    public boolean validarImgMercadoLibre(){
        if(isDisplayed(imgmercadoLibre)){
            System.out.println("Estas dentro de la pagina de Mercado Libre");
            return true;
        } else {
            System.out.println("Pagina no encontrada");
            return false;
        }
    }
    public void clickCookies() throws InterruptedException {
        Thread.sleep(2000);
        click(btnCookies);
    }

    public void clickComoPagar() throws InterruptedException {
        Thread.sleep(2000);
        click(btncomoPagar);

    }

    public boolean validarTarjetaCreditoDebito () {
        if(isDisplayed(imgtarjetaCreditoDebito)){
            System.out.println("Metodo de pago por tarjetas de credito o debito en la pagina");
            return true;
        } else {
            System.out.println("Elemento no encontrado");
            return false;
        }
    }

    public boolean validarMercadoPago () {
        if(isDisplayed(imgmercadoPago)){
            System.out.println("Metodo de pago por Mercado Pago");
            return true;
        } else {
            System.out.println("Elemento no encontrado");
            return false;
        }
    }


}
