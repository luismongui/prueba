package com.sura.prueba.resources;

import com.google.common.base.Function;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;


import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;


public class GrandPage extends PageObject {
    protected final Actions acciones = new Actions(getDriver());
    protected static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger("");
    protected static final int VALUE_0 = 0;
    protected static final int VALUE_1 = 1;


    public GrandPage(WebDriver driver) {
        super(driver);
    }


    public void waitUntil(int millis) {
        Integer i = 0;
        Wait<Integer> wait = new FluentWait<Integer>(i)
                .withTimeout(millis, TimeUnit.MILLISECONDS)
                .pollingEvery(50, TimeUnit.MILLISECONDS)
                .ignoring(StaleElementReferenceException.class);
        try {
            wait.until(new IntegerBooleanFunction());
        } catch (TimeoutException e) {
            LOGGER.info("error" + e);
        }
    }
    public WebElementFacade getElementos(String locator) {
        return withTimeoutOf(20, TimeUnit.SECONDS).find(locator);
    }

    public void ingresarDato(WebElementFacade elemento, String dato) {
        do {
            waitFor(elemento);
            elemento.clear();
            esperaPredicate(elemento,600);
            waitUntil(600);
            waitFor(elemento).shouldContainText("");
            elemento.sendKeys(dato);
        } while (!elemento.getValue().equals(dato));
    }

    public WebElementFacade getElemento(String locator) {
        return withTimeoutOf(15, TimeUnit.MILLISECONDS).find(locator);
    }
    public  void esperaPredicate(WebElement element, int mills) {
        new FluentWait<WebElement>(element)
                .withTimeout(mills, TimeUnit.MILLISECONDS)
                .pollingEvery(1000, TimeUnit.MICROSECONDS)
                .ignoring(NoSuchElementException.class).
                until(new Function<WebElement, Boolean>() {
                    public Boolean apply(WebElement element) {
                        return element.isDisplayed();
                    }
                });

    }
    private static class IntegerBooleanFunction implements Function<Integer, Boolean> {
        @Override
        public Boolean apply(Integer i) {
            return false;
        }
    }

}
