package pe.edu.upc.selenium.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pe.edu.upc.selenium.MyWebDriver;

public class RegisterAsPostulantSpedDef {

    public static WebDriver webDriver;

    public RegisterAsPostulantSpedDef() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("el postulante ingresa a la aplicación.")
    public void elPostulanteIngresaALaAplicación1() {
        webDriver.get("https://jo-bag.netlify.app/");

    }

    @When("presiona la opción de registrarse afiliando sus datos personales, correo, número de celular y una contraseña.")
    public void presionaLaOpciónDeRegistrarseAfiliandoSusDatosPersonalesCorreoNúmeroDeCelularYUnaContraseña() {
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[2]")).click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-choose-postulant-or-employer/div[2]/mat-card[1]/div/button")).click();

        webDriver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Peter");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Castle");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("77232323");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("999999999");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("Soltero");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("petercastle@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("castillo");
        webDriver.findElement(By.xpath("/html/body/app-root/app-postulant-new/div[2]/div/form[7]/input")).click();

    }

    @And("se logea en la aplicación")
    public void seLogeaEnLaAplicación(){
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys("petercastle@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).sendKeys("castillo");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @Then("ingresa al home de la aplicación")
    public void ingresaAlHomeDeLaAplicación() {

    }

    @Given("el postulante entra a la aplicación.")
    public void elPostulanteEntraALaAplicación() {
    }

    @When("presiona la opción de registrarse y no llena adecuadamente los datos.")
    public void presionaLaOpciónDeRegistrarseYNoLlenaAdecuadamenteLosDatos() {
    }

    @Then("el proceso de registro no se realiza porque debe digitar datos válidos.")
    public void elProcesoDeRegistroNoSeRealizaPorqueDebeDigitarDatosVálidos() {
    }

    @Given("el postulante ingresa a la aplicación")
    public void elPostulanteIngresaALaAplicación2() {
    }

    @When("presiona sobre la opción de registrarse y deja campos vacíos")
    public void presionaSobreLaOpciónDeRegistrarseYDejaCamposVacíos() {
    }
}
