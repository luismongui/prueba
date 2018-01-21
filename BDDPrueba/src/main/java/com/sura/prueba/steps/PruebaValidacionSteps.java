package com.sura.prueba.steps;

import com.sura.prueba.pages.PruebaValidacionPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;


public class PruebaValidacionSteps extends ScenarioSteps {
   @Page
   PruebaValidacionPages pruebaValidacionPages;

    public PruebaValidacionSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void accesoUrl(String contexto) {
        pruebaValidacionPages.accesoUrl( contexto);
    }
    @Step
    public void ingresoDatoLogin(ExamplesTable datos) {
        pruebaValidacionPages.ingresoDatoLogin(datos);
    }
    @Step
    public void validacion(String dato) {
        pruebaValidacionPages.validacionLogin(dato);
    }
    @Step
    public void datosNavegacion(ExamplesTable datos) {
        pruebaValidacionPages.datosNavegacion(datos);
    }
    @Step
    public void validacionCantidad(ExamplesTable datos) {
        pruebaValidacionPages.validacionCantidad(datos);
    }
}
