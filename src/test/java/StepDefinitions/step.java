package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pom.MetodosPagoPage;
import pom.CostoProductoPage;
import pom.CostoEnvioPage;
import pom.RecomendacionesIphonePage;
import pom.FiltrosCalzadoPage;
import pom.TrabajaConNosotrosPage;
import pom.ApartadosOfertasPage;
import pom.FiltrosSuperMercadoPage;
import pom.DescuentoSupremercadoPage;
import pom.OrdenSuperMercadoPage;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class step {

    //Declarar mi driver
    private WebDriver driver;
    //Invocar las paginas necesarias
    MetodosPagoPage metodosPagoPage;
    CostoProductoPage costoProductoPage;
    CostoEnvioPage costoEnvioPage;
    RecomendacionesIphonePage recomendacionesIphonePage;
    FiltrosCalzadoPage filtrosCalzadoPage;
    TrabajaConNosotrosPage trabajaConNosotrosPage;
    ApartadosOfertasPage apartadosOfertasPage;
    FiltrosSuperMercadoPage filtrosSuperMercadoPage;
    DescuentoSupremercadoPage descuentoSupremercadoPage;
    OrdenSuperMercadoPage ordenMenorPrecio;

    @Given("el usuario ingresa a mercado libre")
    public void el_usuario_ingresa_a_mercado_libre() throws InterruptedException {
        metodosPagoPage = new MetodosPagoPage(driver);
        costoProductoPage = new CostoProductoPage(driver);
        costoEnvioPage = new CostoEnvioPage(driver);
        recomendacionesIphonePage = new RecomendacionesIphonePage(driver);
        filtrosCalzadoPage = new FiltrosCalzadoPage(driver);
        trabajaConNosotrosPage = new TrabajaConNosotrosPage(driver);
        apartadosOfertasPage = new ApartadosOfertasPage(driver);
        filtrosSuperMercadoPage = new FiltrosSuperMercadoPage(driver);
        descuentoSupremercadoPage = new DescuentoSupremercadoPage(driver);
        ordenMenorPrecio = new OrdenSuperMercadoPage(driver);
        driver = metodosPagoPage.chromeDriverConnection();
        metodosPagoPage.visit("https://www.mercadolibre.com.mx/");
        assertTrue(metodosPagoPage.validarImgMercadoLibre());
        metodosPagoPage.clickCookies();
    }
    @When("click en elige como pagar")
    public void click_en_elige_como_pagar() throws InterruptedException {

        metodosPagoPage.clickComoPagar();
    }

    @Then("visualizar tarjetas de credito y debito")
    public void visualizar_tarjetas_de_credito_y_debito() {
        assertTrue(metodosPagoPage.validarTarjetaCreditoDebito());
    }

    @And("visualiza mercado pago")
    public void visualiza_mercado_pago() {
        assertTrue(metodosPagoPage.validarMercadoPago());
    }

    //precio de envio
    @When("usuario realiza la busqueda cubrebocas")
    public void usuarioRealizaLaBusquedaCubrebocas() throws InterruptedException {
        costoProductoPage = new CostoProductoPage(driver);
        costoEnvioPage = new CostoEnvioPage(driver);
        costoProductoPage.txtBuscador();
        costoProductoPage.clickBtnSubmit();
    }

    @When("usuario da click en elemento previo seleccionado")
    public void usuarioDaClickEnPrimerElementoPrevioSeleccionado() throws InterruptedException {
        costoProductoPage = new CostoProductoPage(driver);
        costoEnvioPage = new CostoEnvioPage(driver);
        costoProductoPage.clickPoducto();
        assertTrue(costoProductoPage.VerificarProductoBuscado());
    }

    @Then("usuario visualiza el costo del producto")
    public void usuarioVisualizaElCostoDelProducto() {
        costoProductoPage = new CostoProductoPage(driver);

        assertEquals("539", costoProductoPage.VerificacionCosto());
    }
    //Envio Gratis
    @Then("usuario visualiza envio gratis")
    public void usuarioVisualizaEnvioGratis() {
        costoEnvioPage = new CostoEnvioPage(driver);
        assertTrue(costoEnvioPage.EnvioGratis());
    }
    //Recomendaciones Iphone
    @When("usario realiza la busqueda Iphone")
    public void usarioRealizaLaBusquedaIphone() throws InterruptedException {
        recomendacionesIphonePage = new RecomendacionesIphonePage(driver);
        recomendacionesIphonePage.txtBuscadoML();
        recomendacionesIphonePage.clickBtnSubmit();

    }
    @And("click elemento seleccionado")
    public void clickElementoSeleccionado() throws InterruptedException {
        recomendacionesIphonePage = new RecomendacionesIphonePage(driver);
        recomendacionesIphonePage.clickIpnhone();
        assertTrue(recomendacionesIphonePage.VerificarProductoBuscado());
    }
    @And("click en boton para regresar al inicio")
    public void clickEnBotonParaRegresarAlInicio() throws InterruptedException {
        recomendacionesIphonePage = new RecomendacionesIphonePage(driver);
        recomendacionesIphonePage.clickHome();
    }

    @Then("visualiza un partado con recomendaciones")
    public void visualizaUnPartadoConRecomendaciones() {
        recomendacionesIphonePage = new RecomendacionesIphonePage(driver);
        assertTrue(recomendacionesIphonePage.VerificarRecomendacion());
    }

    //Filtros calzado precio y hubicacion
    @When("click en moda")
    public void clickEnModa() {
        filtrosCalzadoPage = new FiltrosCalzadoPage(driver);
        filtrosCalzadoPage.clickModa();

    }

    @And("click en calzado")
    public void clickEnCalzado() {
        filtrosCalzadoPage = new FiltrosCalzadoPage(driver);
        filtrosCalzadoPage.clickClazdo();
    }

    @And("click en filtros")
    public void clickEnFiltros() {
        filtrosCalzadoPage = new FiltrosCalzadoPage(driver);
        filtrosCalzadoPage.clickPrecio();
        filtrosCalzadoPage.clickHubicacion();
    }

    @Then("visualizar etiquetas de los filtro aplicados")
    public void visualizarEtiquetasDeLosFiltroAplicados() {
        filtrosCalzadoPage = new FiltrosCalzadoPage(driver);
        assertEquals("Hasta $ 550", filtrosCalzadoPage.Precio());
        assertEquals("Estado De México", filtrosCalzadoPage.Hubicacion());

    }
    //Trabaja con nosostros
    @When("click trabaja con nosotros")
    public void clickTrabajaConNosotros() {
        trabajaConNosotrosPage = new TrabajaConNosotrosPage(driver);
        trabajaConNosotrosPage.clickTrabaja();
    }

    @Then("visualiza apartado ver opurtunidades")
    public void visualizaApartadoVerOpurtunidades() {
        trabajaConNosotrosPage = new TrabajaConNosotrosPage(driver);
        assertTrue(trabajaConNosotrosPage.VerOportunidades());
    }
    //apartados en ofertas
    @When("click en ofertas")
    public void clickEnOfertas() throws InterruptedException {
        apartadosOfertasPage = new ApartadosOfertasPage(driver);
        apartadosOfertasPage.clickOfertas();
        assertTrue(apartadosOfertasPage.PaginaOfertas());
    }

    @Then("visualiza apartado de ofertas relampago")
    public void visualizaApartadoDeOfertasRelampago(){
        apartadosOfertasPage = new ApartadosOfertasPage(driver);
        assertEquals("Ofertas relámpago", apartadosOfertasPage.OfertasRelampago());

    }

    @And("visualiza apartado de liquidacion")
    public void visualizaApartadoDeLiquidacion()  {
        apartadosOfertasPage = new ApartadosOfertasPage(driver);
        assertEquals("Liquidación", apartadosOfertasPage.Ofertas());
    }
    //filtros supermercado
    @When("click en supermercado")
    public void clickEnSupermercado() throws InterruptedException {
        filtrosSuperMercadoPage = new FiltrosSuperMercadoPage(driver);
        descuentoSupremercadoPage = new DescuentoSupremercadoPage(driver);
        ordenMenorPrecio = new OrdenSuperMercadoPage(driver);
        filtrosSuperMercadoPage.clickSuperMercado();
        assertEquals("NUESTRAS CATEGORÍAS", filtrosSuperMercadoPage.CategoriasSuperMercado());
    }

    @Then("usuario visualiza ofertas")
    public void usuarioVisualizaOfertas() {
        filtrosSuperMercadoPage = new FiltrosSuperMercadoPage(driver);
        assertEquals("OFERTAS", filtrosSuperMercadoPage.Ofertas());
    }

    @And("usuario visualiza cuidado personal")
    public void usuarioVisualizaCuidadoPersonal() {
        filtrosSuperMercadoPage = new FiltrosSuperMercadoPage(driver);
        assertEquals("CUIDADO PERSONAL", filtrosSuperMercadoPage.CuidadoPersonal());
    }

    @And("usuario visualiza belleza")
    public void usuarioVisualizaBelleza() {
        filtrosSuperMercadoPage = new FiltrosSuperMercadoPage(driver);
        assertEquals("BELLEZA", filtrosSuperMercadoPage.Belleza());
    }

    @And("usuario visualiza bebidas")
    public void usuarioVisualizaBebidas() {
        filtrosSuperMercadoPage = new FiltrosSuperMercadoPage(driver);
        assertEquals("BEBIDAS", filtrosSuperMercadoPage.Bebidas());
    }
    //50% off supermercado
    @And("click ofertas supermercado")
    public void clickOfertasSupermercado() throws InterruptedException {
        descuentoSupremercadoPage = new DescuentoSupremercadoPage(driver);
        ordenMenorPrecio = new OrdenSuperMercadoPage(driver);
        descuentoSupremercadoPage.clickOfertasSupermercado();
    }
    @And("click en {int} off")
    public void clickEnOff(int arg0) throws InterruptedException {
        descuentoSupremercadoPage = new DescuentoSupremercadoPage(driver);
        descuentoSupremercadoPage.clickDescuento();
    }

    @Then("usuario visualiza la etiqueta de {int} off")
    public void usuarioVisualizaLaEtiquetaDeOff(int arg0) {
        descuentoSupremercadoPage = new DescuentoSupremercadoPage(driver);
        assertTrue(descuentoSupremercadoPage.EtiquetaDescuento());
    }
    //orden mayor relevancia


    @Then("visualiza texto ordenados por mayor relevancia")
    public void visualizaTextoOrdenadosPorMayorRelevancia() {
        ordenMenorPrecio = new OrdenSuperMercadoPage(driver);
        assertTrue(ordenMenorPrecio.ordenMenorPrecio());

    }
}
