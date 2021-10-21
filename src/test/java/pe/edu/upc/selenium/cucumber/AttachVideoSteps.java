package pe.edu.upc.selenium.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pe.edu.upc.selenium.MyWebDriver;

public class AttachVideoSteps {
    public static WebDriver webDriver;
    public AttachVideoSteps(){webDriver = MyWebDriver.getWebDriver();
    }
    @Given("el postulante quiere adjuntar un video")
    public void elPostulanteQuiereAdjuntarUnVideo() {
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.get("https://jo-bag.netlify.app/");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("eldum@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("123");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login-register/div/form/button[1]")).click();
    }

    @When("encuentra la opción adjuntar video")
    public void encuentraLaOpciónAdjuntarVideo() {
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-search-jobs/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/div[2]/div[2]/app-jobs-list/div/div[2]/ul/li[6]/div[1]/h2")));
        a.click();
        WebElement b = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-job-information/app-main-nav-postulant/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/button")));
        b.click();
        webDriver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-postulation-step-one/div/button[2]")).click();
        WebElement c = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-postulation-step-two/app-uploudfiles/ng-picker-overlay/div/button")));
        c.click();


        /*WebElement d = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"picker-overlay" +
                "-1634798136387\"]/div/div[1]/div[1]/div[1]/div/div[2]")));
        Actions builder = new Actions(webDriver);
        builder.moveToElement(d).build().perform();*/
        Actions builder = new Actions(webDriver);
        WebElement element = webDriver.findElement(By.linkText("Link (URL)"));
        builder.moveToElement(element).click().build().perform();
    }

    @Then("el postulante selecciona esa opción puede adjuntar el enlace del vídeo.")
    public void elPostulanteSeleccionaEsaOpciónPuedeAdjuntarElEnlaceDelVídeo() {
        webDriver.findElement(By.xpath("//*[@id=\"picker-overlay-1634798585995\"]/div/div/div[1]/div[2]/div[2]/div" +
                "/div/form/input")).sendKeys("https://www.youtube.com");
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"picker-overlay" +
                "-1634798585995\"]/div/div/div[1]/div[2]/div[2]/div/div/form/button")));
        e.click();

    }

    @When("encuentra la opción adjuntar video, selecciona la opción e ingresa el enlace del video con formato incorrecto")
    public void encuentraLaOpciónAdjuntarVideoSeleccionaLaOpciónEIngresaElEnlaceDelVideoConFormatoIncorrecto() {
    }

    @Then("se muestra un mensaje de error indicando que el enlace tiene formato inválido")
    public void seMuestraUnMensajeDeErrorIndicandoQueElEnlaceTieneFormatoInválido() {
    }

    @When("encuentra la opción adjuntar video, selecciona la opción e ingresa el enlace del video alojado en un servidor distinto a YouTube")
    public void encuentraLaOpciónAdjuntarVideoSeleccionaLaOpciónEIngresaElEnlaceDelVideoAlojadoEnUnServidorDistintoAYouTube() {
    }

    @Then("se muestra un mensaje de error indicando que solo está permitido los enlaces de video de YouTube")
    public void seMuestraUnMensajeDeErrorIndicandoQueSoloEstáPermitidoLosEnlacesDeVideoDeYouTube() {
    }
}
