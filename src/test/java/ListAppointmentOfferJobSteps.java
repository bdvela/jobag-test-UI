import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pe.edu.upc.selenium.MyWebDriver;

public class ListAppointmentOfferJobSteps {

    public static WebDriver webDriver;

    public ListAppointmentOfferJobSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("el empleador quiere ver las solicitudes")
    public void elEmpleadorQuiereVerLasSolicitudes() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("John@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("john");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();

    }

    @When("ingresa a la información de cada anuncio")
    public void ingresaALaInformaciónDeCadaAnuncio() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/div[2]/div/div[1]")));
        e.click();
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myad-information/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div/div[2]/div[2]/button")));
        a.click();
        WebElement i = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/div[1]/div[1]")));
        i.click();
    }

    @Then("el empleador visualiza las solicitudes de trabajo.")
    public void elEmpleadorVisualizaLasSolicitudesDeTrabajo() {
    }

    @Given("el empleador desea filtrar las solicitudes de los postulantes menores de {int} años")
    public void elEmpleadorDeseaFiltrarLasSolicitudesDeLosPostulantesMenoresDeAños(int arg0) {
    }

    @When("ingrese a la información del anuncio y en la función de filtro llene la especificación de la edad")
    public void ingreseALaInformaciónDelAnuncioYEnLaFunciónDeFiltroLleneLaEspecificaciónDeLaEdad() {
    }

    @Then("visualizará las solicitudes que cumplan con la especificación ingresada.")
    public void visualizaráLasSolicitudesQueCumplanConLaEspecificaciónIngresada() {
    }

    @Given("el empleador desea preseleccionar a unos cuantos postulantes para luego evaluarlos con mayor precisión")
    public void elEmpleadorDeseaPreseleccionarAUnosCuantosPostulantesParaLuegoEvaluarlosConMayorPrecisión() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("John@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("john");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();

    }

    @When("este visualizando la solicitud del postulante en cuestión y presione en la opción de preselección")
    public void esteVisualizandoLaSolicitudDelPostulanteEnCuestiónYPresioneEnLaOpciónDePreselección() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/div[2]/div/div[1]")));
        e.click();
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myad-information/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div/div[2]/div[2]/button")));
        a.click();
        WebElement i = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/div[1]/div[1]")));
        i.click();
        WebElement o = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/span[1]")));
        o.click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-selectpostulants/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div/button")).click();
    }

    @Then("la solicitud del postulante será guardada en el apartado de preselección")
    public void laSolicitudDelPostulanteSeráGuardadaEnElApartadoDePreselección() {

    }
}
