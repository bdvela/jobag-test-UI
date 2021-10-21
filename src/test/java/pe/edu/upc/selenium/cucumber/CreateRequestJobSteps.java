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

public class CreateRequestJobSteps {
    public static WebDriver webDriver;
    public CreateRequestJobSteps(){ webDriver = MyWebDriver.getWebDriver();
    }
    @Given("el postulante desea postular a puestos de trabajo")
    public void elPostulanteDeseaPostularAPuestosDeTrabajo() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("eldum@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("123");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @When("postula a estos puestos aparece un mensaje de confirmación en la app")
    public void postulaAEstosPuestosApareceUnMensajeDeConfirmaciónEnLaApp() {
        WebDriverWait wait = new WebDriverWait(webDriver,9);
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app" +
                "-search-jobs/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/div[2]/div[2]/app-jobs-list/div/div[2]/ul/li[5]/div[1]/h2")));
        a.click();
        WebElement b = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-job" +
                "-information/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/button/span[1]")));
        b.click();
        webDriver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-postulation-step-one/div/button[2]")).click();
        WebElement c = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-postulation-step-two/button[2]")));
        c.click();
        WebElement d = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/span[1]")));
        d.click();
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-postulation-step-tree/button[2]")));
        e.click();
    }

    @Then("Ha postulado exitosamente.")
    public void haPostuladoExitosamente() {
        WebDriverWait wait = new WebDriverWait(webDriver,9);
        WebElement f = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-dialog-0\"]/app-dialog-postulation-send-successfully/div[2]/button")));
        f.click();
        //*[@id="mat-dialog-0"]/app-dialog-postulation-send-successfully/div[2]/button
    }

    @Given("el postulante desea postular a diversos puestos de trabajo")
    public void elPostulanteDeseaPostularADiversosPuestosDeTrabajo() {
    }

    @When("postula se notificará el número de trabajos postulados actualmente")
    public void postulaSeNotificaráElNúmeroDeTrabajosPostuladosActualmente() {
    }

    @Then("Aparecerá un mensaje de confirmación en la app.")
    public void apareceráUnMensajeDeConfirmaciónEnLaApp() {
    }

    @When("Intenta postular por segunda vez a un mismo trabajo")
    public void intentaPostularPorSegundaVezAUnMismoTrabajo() {
    }

    @Then("se mostrará un mensaje de error indicando que no es posible postular más de una vez al mismo trabajo.")
    public void seMostraráUnMensajeDeErrorIndicandoQueNoEsPosiblePostularMásDeUnaVezAlMismoTrabajo() {
    }
}
