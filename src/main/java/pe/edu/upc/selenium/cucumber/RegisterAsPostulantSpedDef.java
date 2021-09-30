package pe.edu.upc.selenium.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pe.edu.upc.selenium.MyWebDriver;

public class RegisterAsPostulantSpedDef {

    public static WebDriver webDriver;

    public RegisterAsPostulantSpedDef() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("el postulante ingresa a la aplicación.")
    public void elPostulanteIngresaALaAplicación1() {

    }

    @When("presiona la opción de registrarse afiliando sus datos personales, correo, número de celular y una contraseña.")
    public void presionaLaOpciónDeRegistrarseAfiliandoSusDatosPersonalesCorreoNúmeroDeCelularYUnaContraseña() {
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[2]")).click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-choose-postulant-or-employer/div[2]/mat-card[1]/div/button")).click();

        webDriver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Keiko");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Fujimori");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("73112234");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("987777676");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("casado");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("keiko@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("keiko");
        webDriver.findElement(By.xpath("/html/body/app-root/app-postulant-new/div[2]/div/form[7]/input")).click();

    }

    @And("se logea en la aplicación")
    public void seLogeaEnLaAplicación(){
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys("keiko@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).sendKeys("keiko");

    }

    @Then("ingresa al home de la aplicación")
    public void ingresaAlHomeDeLaAplicación() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")));
        e.click();

    }

    @Given("el postulante entra a la aplicación.")
    public void elPostulanteEntraALaAplicación() {
        webDriver.get("http://jo-bag.netlify.app");
    }

    @When("presiona la opción de registrarse y no llena  los datos.")
    public void presionaLaOpciónDeRegistrarseYNoLlenaAdecuadamenteLosDatos() {
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[2]")).click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-choose-postulant-or-employer/div[2]/mat-card[1]/div/button")).click();

        webDriver.findElement(By.xpath("/html/body/app-root/app-postulant-new/div[2]/div/form[7]/input")).click();
    }

    @Then("vuelve a la pantalla de login porque proceso de registro no se realiza.")
    public void elProcesoDeRegistroNoSeRealizaPorqueDebeDigitarDatosVálidos() {

    }
    @And("ingresa su informacion e intenta logearse")
    public void ingresaSuInformacionEIntentaLogearse(){
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys("usuariox@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).sendKeys("usuariox");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @Then("le sale un mensaje de error porque sus credenciales no son validas")
    public void leSaleUnMensajeDeErrorPorqueSusCredencialesNoSonValidas() {
        webDriver.get("http://jo-bag.netlify.app");

    }

    @Given("el postulante ingresa a la aplicación")
    public void elPostulanteIngresaALaAplicación2() {

    }

    @When("presiona sobre la opción de registrarse y no llena adecuadamente los datos")
    public void presionaSobreLaOpciónDeRegistrarseYDejaCamposVacíos() {

    }
    @Then("el proceso de registro no se realiza porque debe digitar datos válidos.")
    public void elProcesoDeRegistroNoSeRealizaPorqueDebeDigitarDatosValidos(){

    }
}
