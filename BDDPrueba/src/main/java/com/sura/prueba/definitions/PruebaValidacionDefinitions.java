package com.sura.prueba.definitions;


import com.sura.prueba.steps.PruebaValidacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class PruebaValidacionDefinitions {
@Steps
PruebaValidacionSteps pruebaValidacionSteps;

    @Given("acceder a la url: $ambiente")
    public void accesoUrl(String $ambiente) {
        pruebaValidacionSteps.accesoUrl($ambiente);
    }

    @When("se ingresa el usuario y password: $datos")
    public void ingresarUsuario(ExamplesTable datos) {
        pruebaValidacionSteps.ingresoDatoLogin(datos);
    }
    @Then("el sistema presenta un mensaje de error: $datos")
    public void validacion(String datos) {
        pruebaValidacionSteps.validacion(datos);
    }
    @When("seleccionar opcion de navegacion: $datos")
    public void navegacion(ExamplesTable datos) {
        pruebaValidacionSteps.datosNavegacion(datos);
    }
    @Then("validacion cantidad de opciones: $dato")
    public void validacionCantidad(ExamplesTable datos) {
        pruebaValidacionSteps.validacionCantidad(datos);
    }
}
