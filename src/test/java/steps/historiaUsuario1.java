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

public class historiaUsuario1 {

    private WebDriver driver;

    @Given(": usuario esteja logado no portal")
    public void usuarioEstejaLogadoNoPortal() {
        System.setProperty("webdriver.chrome.driver", "drivers/Chrome-chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.cssSelector("body.index.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.nav:nth-child(2) div.container div.row nav:nth-child(1) div.header_user_info:nth-child(1) > a.login")).click();

        driver.findElement(By.cssSelector("#email")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("rocawas749@healteas.com");
        driver.findElement(By.cssSelector("#passwd")).click();
        driver.findElement(By.cssSelector("#passwd")).sendKeys("imb123");
        driver.findElement(By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.row div.col-xs-12.col-sm-6:nth-child(2) form.box div.form_content.clearfix p.submit:nth-child(4) button.button.btn.btn-default.button-medium > span:nth-child(1)")).click();
    }

    @When(": usuario escolhe por Printed Chiffon Dress na cor verde e tamanho M")
    public void usuarioEscolhePorPrintedChiffonDressNaCorVerdeETamanhoM() {
        // Pesquisa pelo produto
        driver.findElement(By.id("search_query_top")).click();
        driver.findElement(By.id("search_query_top")).sendKeys("Printed Chiffon Dress");
        driver.findElement(By.name("submit_search")).click();

        //Seleciona o produto
        driver.findElement(By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 ul.product_list.grid.row:nth-child(3) li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line:nth-child(1) div.product-container div.right-block h5:nth-child(1) > a.product-name")).click();

        //Saleciona o tamanho Medio e a cor verde para o pedido
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[4]/div/div/div/div[4]/form/div/div[2]/div/fieldset[1]/div/div/select/option[2]")).click();
        driver.findElement(By.cssSelector("#color_15")).click();

        //Adiciona ao carrinho
        driver.findElement(By.cssSelector("body.product.product-7.product-printed-chiffon-dress.category-11.category-summer-dresses.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(4) div.center_column.col-xs-12.col-sm-12 div.primary_block.row:nth-child(1) div.pb-right-column.col-xs-12.col-sm-4.col-md-3 div.box-info-product div.box-cart-bottom div:nth-child(1) p.buttons_bottom_block.no-print button.exclusive > span:nth-child(1)")).click();

        //Seleciona a opcao para continuar comprando
        driver.findElement(By.cssSelector("body.product.product-7.product-printed-chiffon-dress.category-11.category-summer-dresses.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div.clearfix div.layer_cart_cart.col-xs-12.col-md-6 div.button-container:nth-child(5) span.continue.btn.btn-default.button.exclusive-medium > span:nth-child(1)")).click();
    }

    @And(": Faded Short Sleeve T-shirts na cor azul")
    public void fadedShortSleeveTShirtsNaCorAzul() {
        //Inicio da pagina
        driver.findElement(By.className("account")).click();

        // Pesquisa pelo produto
        driver.findElement(By.id("search_query_top")).click();
        driver.findElement(By.id("search_query_top")).sendKeys("Faded Short Sleeve T-shirts");
        driver.findElement(By.name("submit_search")).click();

        //Selecionar o produto
        driver.findElement(By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 ul.product_list.grid.row:nth-child(3) li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line div.product-container div.right-block h5:nth-child(1) > a.product-name")).click();

        //Seleciona a cor especifica para o resultado da busca
        driver.findElement(By.cssSelector("#color_14")).click();

        //Adiciona ao carrinho
        driver.findElement(By.cssSelector("body.product.product-1.product-faded-short-sleeve-tshirts.category-5.category-tshirts.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.primary_block.row:nth-child(1) div.pb-right-column.col-xs-12.col-sm-4.col-md-3 div.box-info-product div.box-cart-bottom div:nth-child(1) p.buttons_bottom_block.no-print button.exclusive > span:nth-child(1)")).click();

        //Seleciona a opcao para continuar comprando
        driver.findElement(By.cssSelector("body.product.product-1.product-faded-short-sleeve-tshirts.category-5.category-tshirts.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div.clearfix div.layer_cart_cart.col-xs-12.col-md-6 div.button-container:nth-child(5) span.continue.btn.btn-default.button.exclusive-medium > span:nth-child(1)")).click();
    }

    @And(": Blouse na quantidade dois")
    public void blouseNaQuantidade() {
        //Inicio da pagina
        driver.findElement(By.className("account")).click();

        // Pesquisa pelo produto
        driver.findElement(By.id("search_query_top")).click();
        driver.findElement(By.id("search_query_top")).sendKeys("Blouse");
        driver.findElement(By.name("submit_search")).click();

        //Seleciona o produto
        driver.findElement(By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 ul.product_list.grid.row:nth-child(3) li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line div.product-container div.right-block h5:nth-child(1) > a.product-name")).click();

        //Botao + para adicionar mais produtos
        driver.findElement(By.cssSelector("body.product.product-2.product-blouse.category-7.category-blouses.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.primary_block.row:nth-child(1) div.pb-right-column.col-xs-12.col-sm-4.col-md-3 div.box-info-product div.product_attributes.clearfix p:nth-child(1) a.btn.btn-default.button-plus.product_quantity_up:nth-child(4) > span:nth-child(1)")).click();

        //Adiciona ao carrinho
        driver.findElement(By.cssSelector("body.product.product-2.product-blouse.category-7.category-blouses.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.primary_block.row:nth-child(1) div.pb-right-column.col-xs-12.col-sm-4.col-md-3 div.box-info-product div.box-cart-bottom div:nth-child(1) p.buttons_bottom_block.no-print button.exclusive > span:nth-child(1)")).click();

        //Seleciona a opcao para continuar comprando
        driver.findElement(By.cssSelector("body.product.product-2.product-blouse.category-7.category-blouses.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div.clearfix div.layer_cart_cart.col-xs-12.col-md-6 div.button-container:nth-child(5) span.continue.btn.btn-default.button.exclusive-medium > span:nth-child(1)")).click();
    }

    @And(": Printed Dress")
    public void printedDress() {
        //Inicio da pagina
        driver.findElement(By.className("account")).click();

        // Pesquisa pelo produto
        driver.findElement(By.id("search_query_top")).click();
        driver.findElement(By.id("search_query_top")).sendKeys("Printed Dress");
        driver.findElement(By.name("submit_search")).click();

        //Seleciona o produto
        driver.findElement(By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 ul.product_list.grid.row:nth-child(3) li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-item-of-tablet-line:nth-child(2) div.product-container div.right-block h5:nth-child(1) > a.product-name")).click();

        //Adiciona ao carrinho
        driver.findElement(By.cssSelector("body.product.product-4.product-printed-dress.category-10.category-evening-dresses.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(4) div.center_column.col-xs-12.col-sm-12 div.primary_block.row:nth-child(1) div.pb-right-column.col-xs-12.col-sm-4.col-md-3 div.box-info-product div.box-cart-bottom div:nth-child(1) p.buttons_bottom_block.no-print button.exclusive > span:nth-child(1)")).click();
    }

    @Then(": produtos sao selecionados para compra")
    public void produtosSaoSelecionadosParaCompra() throws IOException{
        //Fazer checkout para concluir a compra
        driver.findElement(By.cssSelector("body.product.product-4.product-printed-dress.category-10.category-evening-dresses.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div.clearfix div.layer_cart_cart.col-xs-12.col-md-6 div.button-container:nth-child(5) a.btn.btn-default.button.button-medium > span:nth-child(1)")).click();

        driver.findElement(By.cssSelector("body.order.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 p.cart_navigation.clearfix:nth-child(8) a.button.btn.btn-default.standard-checkout.button-medium > span:nth-child(1)")).click();

        driver.findElement(By.cssSelector("body.order.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 form:nth-child(3) p.cart_navigation.clearfix button.button.btn.btn-default.button-medium:nth-child(4) > span:nth-child(1)")).click();

        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.cssSelector("body.order.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div:nth-child(1) form:nth-child(3) p.cart_navigation.clearfix button.button.btn.btn-default.standard-checkout.button-medium:nth-child(4) > span:nth-child(1)")).click();

        driver.findElement(By.cssSelector("body.order.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.paiement_block div:nth-child(3) div.row:nth-child(1) div.col-xs-12.col-md-6 p.payment_module > a.bankwire")).click();

        driver.findElement(By.cssSelector("body.module-bankwire-payment.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 form:nth-child(3) p.cart_navigation.clearfix button.button.btn.btn-default.button-medium > span:nth-child(1)")).click();

        imprimirEvidencia();
    }

    public void imprimirEvidencia() throws IOException {
        File evidence = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(evidence, new File("target/evidenceUser.png"));
    }
}
