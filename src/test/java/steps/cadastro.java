package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class cadastro {

    private WebDriver driver;

    @Given("usuario deseja cadastrar-se em automationpractice.com")
    public void usuarioDesejaCadastrarSeEmAutomationpracticeCom() {
        System.setProperty("webdriver.chrome.driver", "drivers/Chrome-chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

        driver.get("http://automationpractice.com/index.php");
    }

    @When("navegar para o menu de login")
    public void navegarParaOMenuDeLogin() {
        //Encontrando elemento de Sign In por CssSector por nao existir ID para o elemento
        driver.findElement(By.cssSelector("body.index.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.nav:nth-child(2) div.container div.row nav:nth-child(1) div.header_user_info:nth-child(1) > a.login")).click();
    }

    @And("adiciono endereco de email")
    public void adicionoEnderecoDeEmail() {
        driver.findElement(By.cssSelector("#email_create")).click();
        driver.findElement(By.cssSelector("#email_create")).sendKeys("rocawas749@healteas.com");
    }

    @And("clico em create an account")
    public void clicoEmCreateAnAccount() {
        driver.findElement(By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.row div.col-xs-12.col-sm-6:nth-child(1) form.box div.form_content.clearfix div.submit:nth-child(4) button.btn.btn-default.button.button-medium.exclusive:nth-child(2) > span:nth-child(1)")).click();
    }

    @And("redirecionado a tela de cadastro")
    public void redirecionadoATelaDeCadastro() throws IOException{
        imprimirEvidencia();
    }

    @And("preencho os campos necessarios")
    public void preenchoOsCamposNecessarios() {
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Clark");

        driver.findElement(By.id("customer_lastname")).click();
        driver.findElement(By.id("customer_lastname")).sendKeys("Kent");

        driver.findElement(By.cssSelector("#passwd")).click();
        driver.findElement(By.cssSelector("#passwd")).sendKeys("imb123");

        driver.findElement(By.cssSelector("#firstname")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Clark");

        driver.findElement(By.cssSelector("#lastname")).click();
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Kent");

        driver.findElement(By.cssSelector("#address1")).click();
        driver.findElement(By.cssSelector("#address1")).sendKeys("St. Rua n 2");

        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).sendKeys("SmallVille");

        driver.findElement(By.id("id_state")).click();

        WebElement estado = driver.findElement(By.id("id_state"));
        estado.findElement(By.xpath("//option[. = 'Arkansas']")).click();

        driver.findElement(By.id("postcode")).click();
        driver.findElement(By.id("postcode")).sendKeys("00000");

        driver.findElement(By.id("phone_mobile")).click();
        driver.findElement(By.id("phone_mobile")).sendKeys("5511998877534");

        driver.findElement(By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div:nth-child(1) form.std.box div.submit.clearfix:nth-child(4) button.btn.btn-default.button.button-medium:nth-child(4) > span:nth-child(1)")).click();

    }

    @Then("novo usuario cadastrado para logar na pagina")
    public void novoUsuarioCadastradoParaLogarNaPagina() throws IOException{
        imprimirEvidenciaFinal();
    }

    public void imprimirEvidencia() throws IOException {
        File printFinal = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(printFinal, new File("target/evidencia.png"));
    }

    public void imprimirEvidenciaFinal() throws IOException {
        File printFinal = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(printFinal, new File("target/evidencia2.png"));
    }
}
