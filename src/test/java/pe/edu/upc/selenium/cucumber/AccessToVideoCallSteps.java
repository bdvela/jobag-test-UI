package pe.edu.upc.selenium.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pe.edu.upc.selenium.MyWebDriver;

public class AccessToVideoCallSteps {
    public static WebDriver webDriver;
    public AccessToVideoCallSteps(){ webDriver = MyWebDriver.getWebDriver(); }
    @Given("el postulante desea ingresar a una entrevista para el puesto de trabajo")
    public void elPostulanteDeseaIngresarAUnaEntrevistaParaElPuestoDeTrabajo() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("eldum@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("123");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @When("da clic en el botón de “acceder a la videollamada”.")
    public void daClicEnElBotónDeAccederALaVideollamada() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-search-jobs/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[1]/span[1]/mat-icon")));
        a.click();
        WebElement b = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app" +
                "-search-jobs/app-main-nav-postulant/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[3]/div")));
        b.click();

    }

    @Then("entra a la videollamada exitosamente.")
    public void entraALaVideollamadaExitosamente() {
    }

    @Then("la url a la que se dirige no existe")
    public void laUrlALaQueSeDirigeNoExiste() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement c = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-interview-postulant-all/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/div/div[1]/ul/li/div/div[2]/button")));
        c.click();
    }

    @Then("se muestra un mensaje de que el link no ha sido configurado")
    public void seMuestraUnMensajeDeQueElLinkNoHaSidoConfigurado() {
    }
}
