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

public class CreateProfesionalProfileSteps {

    public static WebDriver webDriver;


    public CreateProfesionalProfileSteps() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("el postulante quiere crear su perfil profesional")
    public void elPostulanteQuiereCrearSuPerfilProfesional() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("petercastle@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("peter");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @When("está registrado, se muestra la opción de crear perfil profesional.")
    public void estáRegistradoSeMuestraLaOpciónDeCrearPerfilProfesional() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-search-jobs/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[1]")));
        e.click();

    }

    @Then("selecciona esa opción y comienza a responder ciertas preguntas, además de añadir información adicional sobre el postulante como cualidades propias del postulante para el trabajo.")
    public void seleccionaEsaOpciónYComienzaAResponderCiertasPreguntasAdemásDeAñadirInformaciónAdicionalSobreElPostulanteComoCualidadesPropiasDelPostulanteParaElTrabajo() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-search-jobs/app-main-nav-postulant/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[4]/div")));
        e.click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-my-account-postulant/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/div[2]/div[1]/button")).click();
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-3\"]")));
        a.sendKeys("Ingeniero de Software");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("Desarrollo de software");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("https://youtube.com");
        webDriver.findElement(By.xpath("/html/body/app-root/app-modify-professional-profile/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/div[2]/button")).click();
    }


    @Given("el postulante quiere modificar\\/editar su perfil profesional.")
    public void elPostulanteQuiereModificarEditarSuPerfilProfesional() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("petercastle@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("peter");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @When("está creado su perfil profesional, se muestra la opción de “Editar perfil”.")
    public void estáCreadoSuPerfilProfesionalSeMuestraLaOpciónDeEditarPerfil() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-search-jobs/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[1]")));
        e.click();
    }

    @Then("selecciona esa opción y comienza a editar las preguntas, además de modificar la información añadida anteriormente.")
    public void seleccionaEsaOpciónYComienzaAEditarLasPreguntasAdemásDeModificarLaInformaciónAñadidaAnteriormente() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-search-jobs/app-main-nav-postulant/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[4]/div")));
        e.click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-my-account-postulant/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/div[2]/div[1]/button")).click();
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-3\"]")));
        a.sendKeys("Ingeniero de Sistemas");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("Desarrollo de software");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("https://youtube.com");
        webDriver.findElement(By.xpath("/html/body/app-root/app-modify-professional-profile/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/div[2]/button")).click();
    }

    @Given("el postulante quiere modificar su perfil profesional")
    public void elPostulanteQuiereModificarSuPerfilProfesional() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("petercastle@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("peter");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @When("presione sobre la opción Editar perfil, modifique los datos que requiera, pero de manera incorrecta")
    public void presioneSobreLaOpciónEditarPerfilModifiqueLosDatosQueRequieraPeroDeManeraIncorrecta() {
        WebDriverWait wait = new WebDriverWait(webDriver, 9);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-search-jobs/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[1]")));
        e.click();

        WebElement i = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-search-jobs/app-main-nav-postulant/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[4]/div")));
        i.click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-my-account-postulant/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/div[2]/div[1]/button")).click();
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-3\"]")));
        a.sendKeys("123");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("123");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("youtube.com");
        }

    @Then("se mostrará un mensaje de error indicando que no se pudo guardar los cambios")
    public void seMostraráUnMensajeDeErrorIndicandoQueNoSePudoGuardarLosCambios() {
    }
}
