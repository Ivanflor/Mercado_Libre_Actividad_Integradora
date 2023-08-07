package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;

public class base {
    //declarar el objeto webdriver
    private WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    //crear el contructor de l aclase base
    public base(WebDriver driver){
        this.driver = driver;
    }

    //creamos la conexion con el navegador/ creamos la instancia con el navegador
    public WebDriver chromeDriverConnection(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rex_r\\IdeaProjects\\Guru69_Exam_Test\\src\\main\\resources\\chromeDrivers\\chromedriver.exe");
        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        return driver;

    }
    //creamos un envoltorio de los comandos de selenium
    public WebElement findElement( By locator){
        return driver.findElement(locator);
    }
    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }
    //clase para obtener el texto de un elemento
    public String getText(WebElement element){
        return element.getText();
    }
    //ahora hacemos una sobre carga del metodo para que reciba por localizador
    public String getText(By locator){
        return driver.findElement(locator).getText();
    }
    //escribir texto
    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }
    //click al elemento por localizador
    public void click(By locator){
        driver.findElement(locator).click();
    }
    //metodo para validar si el localizador se encuentra
    public Boolean isDisplayed(By locator){
        try{
            return driver.findElement(locator).isDisplayed();
    //vamos a capturar la excepcion
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }
    //metodo para ir a una URL
    public void visit(String url){
        driver.get(url);
    }

    public void comboSelection(By locator, String option) {

        WebElement selectElement = driver.findElement(locator);
        Select select = new Select(selectElement);
        select.selectByVisibleText(option);

    }

    public void scrollFoundElement(By locator) {
        WebElement scrollElement = driver.findElement(locator);
        js.executeScript("arguments[0].scrollIntoView();", scrollElement);
    }


}
