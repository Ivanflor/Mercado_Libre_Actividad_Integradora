package Runer;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/features/Mult_Metod_Pago.feature",
                "src/main/resources/features/CostoProducto.feature",
                "src/main/resources/features/EnvioGratis.feature",
                "src/main/resources/features/RecomendacionesIphone.feature",
                "src/main/resources/features/TrabajaConNosotros.feature",
                "src/main/resources/features/ApartadosOfertas.feature",
                "src/main/resources/features/FiltrosCalzado.feature",
                "src/main/resources/features/FiltrosSuperMercado.feature",
                "src/main/resources/features/50PorcientoSuperMercado.feature",
                "src/main/resources/features/OrdenarProductosSuperMercado.feature",
                },
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/cucumber/report.html"} // Opciones de reportes, puedes ajustar según tus necesidades
)
public class run extends AbstractTestNGCucumberTests {


}

