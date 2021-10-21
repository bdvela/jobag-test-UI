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

public class ConsultPostulantProfileSteps {
    public static WebDriver webDriver;
    public ConsultPostulantProfileSteps(){webDriver = MyWebDriver.getWebDriver();}
    @Given("el empleador quiere ver quienes respondieron a su propuesta de trabajo.")
    public void elEmpleadorQuiereVerQuienesRespondieronASuPropuestaDeTrabajo() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("John@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("john");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @When("ve quienes están interesados, aparece la opción de consultar perfil de usuario")
    public void veQuienesEstánInteresadosApareceLaOpciónDeConsultarPerfilDeUsuario() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app" +
                "-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/div[2]/div/div[7]/div[1]/h2")));
        a.click();
        WebElement b = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myad-information/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div/div[2]/div[2]/button/span[1]")));
        b.click();

    }

    @Then("se visualiza el perfil del postulante solicitado.")
    public void seVisualizaElPerfilDelPostulanteSolicitado() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement c = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/div[1]/div[1]")));
        c.click();
    }

    @Given("el empleador visualiza y se interesa en el perfil de un postulante")
    public void elEmpleadorVisualizaYSeInteresaEnElPerfilDeUnPostulante() {
    }

    @Then("se guardará el perfil del postulante en cuestión.")
    public void seGuardaráElPerfilDelPostulanteEnCuestión() {
    }

    @Given("el empleador desea ver los perfiles de los postulantes que ha guardado")
    public void elEmpleadorDeseaVerLosPerfilesDeLosPostulantesQueHaGuardado() {
    }

    @When("le dé click al apartado de postulantes guardados")
    public void leDéClickAlApartadoDePostulantesGuardados() {
    }

    @Then("se le mostrará una lista de los perfiles que guardo previamente.")
    public void seLeMostraráUnaListaDeLosPerfilesQueGuardoPreviamente() {
    }
}
