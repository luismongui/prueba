package com.sura.prueba.pages;

import com.sura.prueba.resources.GrandPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class PruebaValidacionPages extends GrandPage {
    @FindBy(xpath = ".//input[@name='Password']")
    private WebElementFacade txtPassword;
    @FindBy(xpath = ".//div[@class='sect']/label[@for='username']")
    private WebElementFacade txtName;
    @FindBy(xpath = ".//div[@class='validation-summary-errors validation-message error']/span")
    private WebElementFacade msjError;
    @FindBy(xpath = ".//ul[@role='menu']/li[@class='log']/a[@class='login-link']")
    private WebElementFacade menuLogin;
    @FindBy(xpath = ".//div[@class='sect']/a[@role='button']")
    private WebElementFacade btnLoginIn;
    @FindBy(xpath = ".//div//li[@class='cdc-filters-tab cdc-filters-tab--destinations']")
    private WebElementFacade btnsailTo;
    @FindBy(xpath = ".//div//li[@class='cdc-filters-tab cdc-filters-tab--ports']")
    private WebElementFacade btnsailFrom;
    public PruebaValidacionPages(WebDriver driver) {
        super(driver);
    }


    public void accesoUrl(String contexto) {
        waitUntil(2000);
        getDriver().navigate().to(contexto);
        setImplicitTimeout(VALUE_1, TimeUnit.SECONDS);
        resetImplicitTimeout();
    }

    public void ingresoDatoLogin(ExamplesTable datos) {
        Map<String,String> dato =datos.getRow(VALUE_0);
        menuLogin.click();
        txtName.click();
        ingresarDato(txtName,dato.get("usuario"));
        waitUntil(2000);
        ingresarDato(txtPassword,dato.get("password"));
        btnLoginIn.click();
    }
    public void datosNavegacion(ExamplesTable datos) {
        Map<String,String> dato =datos.getRow(VALUE_0);
        btnsailTo.click();
        String sailTopath=".//div[@class='cdc-filter-expandable']/ul[@class='cdc-filter-cols-wrapper']/li/button[contains(text(),'";
        WebElementFacade to = getElementos(sailTopath +dato.get("sailto")+"')]");
        to.click();
        btnsailFrom.click();
        WebElementFacade from = getElementos(sailTopath +dato.get("sailfrom")+"')]");
        from.click();
    }
    public void validacionLogin(String datos) {
        MatcherAssert.assertThat("No se presento el mensaje de error", msjError.getText().contains(datos));

    }
    public void validacionCantidad(ExamplesTable datos) {
        Map<String,String> dato = datos.getRow(0);
        WebElementFacade result = getElementos(".//div[@class='sbsc-container ng-isolate-scope']/span[@class='sbsc-container__result-count ng-binding ng-scope']");
        MatcherAssert.assertThat("No se presento el mensaje de error", result.getText().contains(dato.get("cantidad")));

    }

}
