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

public class CreateInterviewJobSteps {
    public static WebDriver webDriver;

    public CreateInterviewJobSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }
    @Given("el empleador quiere programar una entrevista.")
    public void elEmpleadorQuiereProgramarUnaEntrevista() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("John@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("john");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/div[2]/div/div[1]")));
        e.click();
    }

    @When("entra a la sección de un anuncio “Crear una nueva entrevista” debe ingresar una fecha y asigna postulantes.")
    public void entraALaSecciónDeUnAnuncioCrearUnaNuevaEntrevistaDebeIngresarUnaFechaYAsignaPostulantes() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myad-information/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div/div[2]/div[2]/button")));
        e.click();
        WebElement A = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/div[2]/div[1]")));
        A.click();
        WebElement i = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-2\"]")));
        i.sendKeys("25102021");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("25102021");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("https://zoom.us/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-checkbox-2\"]/label/span[1]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-checkbox-3\"]/label/span[1]")).click();

    }

    @Then("el empleador genera una nueva entrevista.")
    public void elEmpleadorGeneraUnaNuevaEntrevista() {
        webDriver.findElement(By.xpath("/html/body/app-root/app-new-interview/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/div/div/ul/button")).click();
    }

    @Given("el empleador desea cambiar la fecha y\\/o hora de alguna entrevista creada")
    public void elEmpleadorDeseaCambiarLaFechaYOHoraDeAlgunaEntrevistaCreada() {
    }

    @When("entre a la información de la entrevista y le de click a modificar")
    public void entreALaInformaciónDeLaEntrevistaYLeDeClickAModificar() {
    }

    @Then("se le abrirá un formulario para que el empleador ingrese los nuevos datos para la entrevista.")
    public void seLeAbriráUnFormularioParaQueElEmpleadorIngreseLosNuevosDatosParaLaEntrevista() {
    }

    @Given("el empleador quiere visualizar sus entrevistas en el calendario de su celular")
    public void elEmpleadorQuiereVisualizarSusEntrevistasEnElCalendarioDeSuCelular() {
    }

    @When("entre a su perfil y active la opción de conectar con calendario")
    public void entreASuPerfilYActiveLaOpciónDeConectarConCalendario() {
    }

    @Then("visualizará todas sus entrevistas programadas en el calendario del celular.")
    public void visualizaráTodasSusEntrevistasProgramadasEnElCalendarioDelCelular() {
    }
}
