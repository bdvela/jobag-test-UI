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

public class CreateAdvertJobSteps {

    public static WebDriver webDriver;

    public CreateAdvertJobSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }


    @Given("el empleador desea publicar una propuesta de trabajo")
    public void elEmpleadorDeseaPublicarUnaPropuestaDeTrabajo() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("John@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("john");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @When("presiona en la opción publicar, la seleccione y luego ponga su propuesta")
    public void presionaEnLaOpciónPublicarLaSeleccioneYLuegoPongaSuPropuesta() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[1]")));
        e.click();
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[2]/div")));
        a.click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Analista de sistemas");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Técnico");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("Te encargarás de desarrollo de aplicaciones");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("20102021");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("20102022");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("1500");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("Av. Wonderland 142");
        webDriver.findElement(By.xpath("/html/body/app-root/app-job-offer-new-component/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/div/form[8]/button")).click();
    }

    @Then("en el perfil del empleador se muestra la propuesta de trabajo hecha por este.")
    public void enElPerfilDelEmpleadorSeMuestraLaPropuestaDeTrabajoHechaPorEste() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement i = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-dialog-0\"]/app-dialog-job-new/div[2]/button")));
        i.click();
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-job-offer-new-component/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[1]")));
        e.click();
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-job-offer-new-component/app-main-nav-employeer/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[1]/div")));
        a.click();
    }

    @Given("el empleador desea editar la información de alguna propuesta de trabajo que ya haya subido")
    public void elEmpleadorDeseaEditarLaInformaciónDeAlgunaPropuestaDeTrabajoQueYaHayaSubido() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("John@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("john");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @When("presione el botón de editar en su propuesta de trabajo")
    public void presioneElBotónDeEditarEnSuPropuestaDeTrabajo() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement i = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/div[2]/div/div[2]")));
        i.click();
        WebElement o = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myad-information/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div/div[2]/div[2]/button")));
        o.click();
        WebElement u= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/div[3]/div[1]")));
        u.click();
    }

    @Then("cambiará los datos respectivos y se actualizará la información.")
    public void cambiaráLosDatosRespectivosYSeActualizaráLaInformación() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-2\"]")));
        a.sendKeys("jr nowhere 789");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Analista Programador de Sistemas");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("Desarrollador");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("Te encargarás del desarrollo y mantenimiento de las bases de datos utilizando PostgreSQL");
        webDriver.findElement(By.xpath("/html/body/app-root/app-myad-information/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div/div[2]/div[1]/button")).click();
    }

    @Given("el empleador dejo incompleto los datos de la propuesta de trabajo")
    public void elEmpleadorDejoIncompletoLosDatosDeLaPropuestaDeTrabajo() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("John@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("john");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[1]")));
        e.click();
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[2]/div")));
        a.click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Analista de sistemas");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Técnico");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("Te encargarás de desarrollo de aplicaciones");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("1500");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("Av. Wonderland 142");

    }

    @When("se disponga a publicar el puesto de trabajo")
    public void seDispongaAPublicarElPuestoDeTrabajo() {

    }

    @Then("le saldrá un mensaje de error indicando que los datos están incompletos.")
    public void leSaldráUnMensajeDeErrorIndicandoQueLosDatosEstánIncompletos() {
    }
}
