package pe.edu.upc.selenium.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pe.edu.upc.selenium.MyWebDriver;

public class registerasEmployeeSteps {

    public static WebDriver webDriver;

    public registerasEmployeeSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("el empleador ingresa a la aplicación.")
    public void elEmpleadorIngresaALaAplicación() {
        webDriver.get("https://jo-bag.netlify.app/");
    }

    @When("presiona la opción de registrarse afiliando datos de la empresa, RUC y una contraseña.")
    public void presionaLaOpciónDeRegistrarseAfiliandoDatosDeLaEmpresaRUCYUnaContraseña() {
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[2]")).click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-choose-postulant-or-employer/div[2]/mat-card[2]/div/button")).click();

        webDriver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("John");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Doe");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("73112234");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("987777676");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("casado");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("John@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("john");
        webDriver.findElement(By.xpath("/html/body/app-root/app-employeer-new/div[2]/div/form[7]/input")).click();

    }

    @Then("se le notifica por mensaje de texto que el registro se realizó correctamente.")
    public void seLeNotificaPorMensajeDeTextoQueElRegistroSeRealizóCorrectamente() {
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys("John@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).sendKeys("john");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @Given("el empleador entra en la aplicación.")
    public void elEmpleadorEntraEnLaAplicación() {
        webDriver.get("https://jo-bag.netlify.app/");
    }

    @When("presiona la opción de registrarse y no llena adecuadamente los datos.")
    public void presionaLaOpciónDeRegistrarseYNoLlenaAdecuadamenteLosDatos() {
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[2]")).click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-choose-postulant-or-employer/div[2]/mat-card[2]/div/button")).click();

        webDriver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("John");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Doe");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("numero_dni");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("numero_telefono");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("casado");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("Johngmail");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("john");

    }

    @Then("El proceso de registro no se realiza porque debe digitar datos válidos.")
    public void elProcesoDeRegistroNoSeRealizaPorqueDebeDigitarDatosVálidos() {
        webDriver.get("https://jo-bag.netlify.app/");
    }

    @Given("El empleador entra a la aplicación")
    public void elEmpleadorEntraALaAplicación() {
        webDriver.get("https://jo-bag.netlify.app/");
    }

    @When("presiona sobre la opción de registrarse y deja campos vacíos")
    public void presionaSobreLaOpciónDeRegistrarseYDejaCamposVacíos() {
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[2]")).click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-choose-postulant-or-employer/div[2]/mat-card[2]/div/button")).click();
    }

    @Then("se muestra un mensaje de error indicando que no se puede dejar campos vacíos")
    public void seMuestraUnMensajeDeErrorIndicandoQueNoSePuedeDejarCamposVacíos() {
        webDriver.get("http://jo-bag.netlify.app");
    }
}
