package pe.edu.upc.selenium.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pe.edu.upc.selenium.MyWebDriver;

public class CreatePostulantJob {


    public static WebDriver webDriver;

    public CreatePostulantJob() {
        webDriver = MyWebDriver.getWebDriver();
    }


    @Given("el postulante desea postular a puestos de trabajo.")
    public void elPostulanteDeseaPostularAPuestosDeTrabajo() {
    }

    @When("postula a estos puestos aparece un mensaje de confirmación en la app.")
    public void postulaAEstosPuestosApareceUnMensajeDeConfirmaciónEnLaApp() {
    }

    @Then("ha postulado exitosamente.")
    public void haPostuladoExitosamente() {
    }

    @Given("el postulante desea postular a diversos puestos de trabajos")
    public void elPostulanteDeseaPostularADiversosPuestosDeTrabajos() {
    }

    @When("postula se notificará el número de trabajos postulados actualmente.")
    public void postulaSeNotificaráElNúmeroDeTrabajosPostuladosActualmente() {
    }

    @Then("aparecerá un mensaje de confirmación en la app.")
    public void apareceráUnMensajeDeConfirmaciónEnLaApp() {
    }

    @Given("el postulante postula a puestos de trabajo")
    public void elPostulantePostulaAPuestosDeTrabajo() {
    }

    @When("intenta postular por segunda vez a un mismo trabajo")
    public void intentaPostularPorSegundaVezAUnMismoTrabajo() {
    }

    @Then("se mostrará un mensaje de error indicando que no es posible postular más de una vez al mismo trabajo")
    public void seMostraráUnMensajeDeErrorIndicandoQueNoEsPosiblePostularMásDeUnaVezAlMismoTrabajo() {
    }
}
