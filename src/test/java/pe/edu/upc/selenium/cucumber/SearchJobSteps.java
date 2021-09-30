package pe.edu.upc.selenium.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pe.edu.upc.selenium.MyWebDriver;

public class SearchJobSteps {

    public static WebDriver webDriver;

    public SearchJobSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("el postulante desea buscar puestos de trabajo.")
    public void elPostulanteDeseaBuscarPuestosDeTrabajo() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("petercastle@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("castillo");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @When("busca estos puestos, le aparecen unas recomendaciones dependiendo de su perfil.")
    public void buscaEstosPuestosLeAparecenUnasRecomendacionesDependiendoDeSuPerfil() {

    }

    @Then("encuentra con facilidad estas propuestas.")
    public void encuentraConFacilidadEstasPropuestas() {

    }

    @Given("el postulante busca puestos de trabajo.")
    public void elPostulanteBuscaPuestosDeTrabajo() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("petercastle@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("castillo");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @When("no encuentra lo que está buscando.")
    public void noEncuentraLoQueEstáBuscando() {

    }

    @Then("revisa su perfil de usuario sobre los datos que puso o envía un correo de ayuda.")
    public void revisaSuPerfilDeUsuarioSobreLosDatosQuePusoOEnvíaUnCorreoDeAyuda() {
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-search-jobs/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[1]")));
        e.click();
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-search-jobs/app-main-nav-postulant/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[4]")));
        a.click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-my-account-postulant/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/div[2]/div[1]/button")).click();

    }

    @Given("el postulante  quiere buscar puestos de trabajo")
    public void elPostulanteQuiereBuscarPuestosDeTrabajo() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("petercastle@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("castillo");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @When("busca según sus criterios")
    public void buscaSegúnSusCriterios() {
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-2\"]")));
        e.sendKeys("Ingeniero");
        webDriver.findElement(By.xpath("/html/body/app-root/app-search-jobs/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/div[2]/div[2]/app-jobs-list/div/div[1]/form/button")).click();
    }

    @Then("se muestra una o varias ofertas de trabajo")
    public void seMuestraUnaOVariasOfertasDeTrabajo() {

    }

}
