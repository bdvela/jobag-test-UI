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

public class CreateProfesionalProfileEmployeeSteps {

    public static WebDriver webDriver;

    public CreateProfesionalProfileEmployeeSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }


    @Given("el empleador desea ingresar los datos de la empresa")
    public void elEmpleadorDeseaIngresarLosDatosDeLaEmpresa() {
        webDriver.get("https://jo-bag.netlify.app/");

    }

    @When("entra al perfil de la empresa o al registrarse")
    public void entraAlPerfilDeLaEmpresaOAlRegistrarse() {
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("John@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("john");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();

    }

    @Then("el empleador puede colocar en los campos, la información de la empresa")
    public void elEmpleadorPuedeColocarEnLosCamposLaInformaciónDeLaEmpresa() {
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

    @When("entra al perfil de la empresa o en el momento del registro, llena los datos con datos inválidos")
    public void entraAlPerfilDeLaEmpresaOEnElMomentoDelRegistroLlenaLosDatosConDatosInválidos() {
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
        webDriver.findElement(By.xpath("/html/body/app-root/app-modify-company-profile/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/button")).click();
    }

    @Then("se muestra un mensaje de error indicando que los datos ingresados son inválidos")
    public void seMuestraUnMensajeDeErrorIndicandoQueLosDatosIngresadosSonInválidos() {
    }

    @Given("el empleador quiere ingresar los datos de la empresa")
    public void elEmpleadorQuiereIngresarLosDatosDeLaEmpresa() {
        webDriver.get("https://jo-bag.netlify.app/");
    }

    @When("entra al perfil de la empresa o en el momento del registro, llena los datos, pero de manera incompleta")
    public void entraAlPerfilDeLaEmpresaOEnElMomentoDelRegistroLlenaLosDatosPeroDeManeraIncompleta() {
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
        webDriver.findElement(By.xpath("/html/body/app-root/app-modify-company-profile/app-main-nav-employeer/mat-sidenav-container/mat-sidenav-content/div[2]/button")).click();
    }

    @Then("Se muestra un mensaje de error indicando que no se puede dejar campos vacíos")
    public void seMuestraUnMensajeDeErrorIndicandoQueNoSePuedeDejarCamposVacíos() {
    }
}
