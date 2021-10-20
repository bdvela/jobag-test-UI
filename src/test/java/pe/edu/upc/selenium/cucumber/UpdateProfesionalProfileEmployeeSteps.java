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

public class UpdateProfesionalProfileEmployeeSteps {

    public static WebDriver webDriver;

    public UpdateProfesionalProfileEmployeeSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("el empleador quiere registrar su empresa.")
    public void elEmpleadorQuiereRegistrarSuEmpresa() {
        webDriver.get("https://jo-bag.netlify.app/");
    }

    @When("entre en la pantalla principal con el rol de “empleador”")
    public void entreEnLaPantallaPrincipalConElRolDeEmpleador() {
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("John@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("john");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @Then("el empleador puede generar una plantilla para empresa a través de una opción en la pantalla.")
    public void elEmpleadorPuedeGenerarUnaPlantillaParaEmpresaATravésDeUnaOpciónEnLaPantalla() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[1]")));
        e.click();
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[4]/div")));
        a.click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-my-account-employeer/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/div/button[2]")).click();
        WebElement i = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-2\"]")));
        i.sendKeys("John&Co");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Compañia de Software");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("logo.png");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("12345678912");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("Av.nowhere 123");
        webDriver.findElement(By.xpath("/html/body/app-root/app-modify-company-profile/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/button")).click();
    }

    @Given("el empleador desea registrar su empresa")
    public void elEmpleadorDeseaRegistrarSuEmpresa() {
        webDriver.get("https://jo-bag.netlify.app/");
    }

    @When("se encuentre en la pantalla principal con el rol de empleador, llena los campos con datos inválidos y envía los datos")
    public void seEncuentreEnLaPantallaPrincipalConElRolDeEmpleadorLlenaLosCamposConDatosInválidosYEnvíaLosDatos() {
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("John@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("john");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();

        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[1]")));
        e.click();
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[4]/div")));
        a.click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-my-account-employeer/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/div/button[2]")).click();
        WebElement i = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-2\"]")));
        i.sendKeys("John&Co");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Compañia de Software");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("logo.pdf");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("numero ruc");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("Av.nowhere 123");

    }

    @Then("se muestra un mensaje de error indicando que los datos son inválidos")
    public void seMuestraUnMensajeDeErrorIndicandoQueLosDatosSonInválidos() {
    }



    @Given("El empleador quiere registrar su empresa")
    public void ElEmpleadorQuiereRegistrarSuEmpresa() {
        webDriver.get("https://jo-bag.netlify.app/");
    }

    @When("se encuentre en la pantalla principal con el rol de “empleador”, no llena todos los campos y envía los datos")
    public void seEncuentreEnLaPantallaPrincipalConElRolDeEmpleadorNoLlenaTodosLosCamposYEnvíaLosDatos() {
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("John@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("john");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[1]")));
        e.click();
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-myads/app-main-nav-employeer/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[4]/div")));
        a.click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-my-account-employeer/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/div/button[2]")).click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-modify-company-profile/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/button")).click();
    }

    @Then("se muestra un mensaje de error indicando que no debe dejar campos vacíos")
    public void seMuestraUnMensajeDeErrorIndicandoQueNoDebeDejarCamposVacíos() {
    }



}
