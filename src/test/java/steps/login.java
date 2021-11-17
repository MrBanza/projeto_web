package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class login {

    private WebDriver driver;

    @Given("^usuario deseja logar-se em automationpractice\\.com$")
    public void usuarioDesejaLogarSeEmAutomationpracticeCom() {
        System.setProperty("webdriver.chrome.driver", "drivers/Chrome-chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

        driver.get("http://automationpractice.com/index.php");
    }

    @When("^navego para o menu de login$")
    public void navegoParaOMenuDeLogin() {
        //Encontrando elemento de Sign In por CssSector por nao existir ID para o elemento
        driver.findElement(By.cssSelector("body.index.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.nav:nth-child(2) div.container div.row nav:nth-child(1) div.header_user_info:nth-child(1) > a.login")).click();
        //assertThat(driver.findElement(By.xpath("//h1[contains(text(),'Authentication')]")).getText(), is("AUTHENTICATION"));
    }

    @And("preencho os campos com {string} e {string}")
    public void preenchoOsCamposComE(String usuario, String senha) {
        driver.findElement(By.cssSelector("#email")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("weverson.virgens92@gmail.com");
        driver.findElement(By.cssSelector("#passwd")).click();
        driver.findElement(By.cssSelector("#passwd")).sendKeys("imb123");
        driver.findElement(By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.row div.col-xs-12.col-sm-6:nth-child(2) form.box div.form_content.clearfix p.submit:nth-child(4) button.button.btn.btn-default.button-medium > span:nth-child(1)")).click();
    }

    @Then("^finalizo o login de cliente$")
    public void finalizoOLoginDeCliente() throws IOException{
        //assertThat(driver.findElement(By.cssSelector(".info-account")).getText(), is("Welcome to your account. Here you can manage all of your personal information and orders."));
        imprimirEvidencia();
        driver.close();
    }

    public void imprimirEvidencia() throws IOException {
        File printFinal = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(printFinal, new File("target/evidencia.png"));
    }
}