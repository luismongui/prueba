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
    protected static final String A_NOMBRE_SURAMERICANA = "A nombre de Suramericana";
    protected static final String AUTOS = "Autos";
    protected static final String AHORROS = "Ahorros";
    protected static final String LARRY = "Larry Gamney";
    protected static final String ALLEN = "Allen Robertson";
    protected static final String BOD = "BOD PEND DIACO";
    protected static final String CAUSA = "causa";
    protected static final String COLOR = "color";
    protected static final String RESUMEN = "Resumen";
    protected static final String RESERVAANTERIOR = "reservaAnterior";
    protected static final String DEDUCIBLEFIJO = "deducibleFijo";
    protected static final String DEDUCIBLEVLE = "deducibleVble";
    protected static final String NUEVARESERVA = "nuevaReserva";
    protected static final String CAUSA_SINIESTRO = "causaSiniestro";
    protected static final String CATEGORECUP = "categoRecup";
    protected static final String CATEGORECOST = "categoriaCosto";
    protected static final String COLUMNA_1 = "]/td[1]";
    protected static final String COLUMNA_2 = "]/td[2]";
    protected static final String COLUMNA_3 = "]/td[3]";
    protected static final String COLUMNA_4 = "]/td[4]";
    protected static final String COLUMNA_5 = "]/td[5]";
    protected static final String COLUMNA_6 = "]/td[6]";
    protected static final String COLUMNA_7 = "]/td[7]";
    protected static final String COLUMNA_8 = "]/td[8]";
    protected static final String CULPABILIDAD = "culpabilidad";
    protected static final String CIUDAD = "Bosconia";
    protected static final String CUIDADMEDELLIN = "Medellin";
    protected static final String DEMANDANTE = "demandante";
    protected static final String DEPARTAMENTO_BUSQUEDA = "Antioquia";
    protected static final String DEPARTAMENTO = "Cesar";
    protected static final String COMPLEJIDAD = "Vehículo - complejidad media";
    protected static final String DIGITO_VERIFICACION = "digitoVerificacion";
    protected static final String EXPOSICION = "Exposiciones";
    protected static final String FECHA = "fecha";
    protected static final String FECHA_SALVAMENTO = "07/09/2016";
    protected static final String FECHA_FACTURA = "16/01/2017";
    protected static final String FACTURA = "123456";
    protected static final String FECHA_SALIDA = "fechaSalida";
    protected static final String FECHA_DENUNCIO = "fechaDenuncio";
    protected static final String FECHA_VENTA = "fechaVenta";
    protected static final String HORA_DESDE = "horaDesde";
    protected static final String HORA_HASTA = "horaHasta";
    protected static final String INCIDENTE_FUE = "incidenteFue";
    protected static final String INSPECCIONDENUNCIO = "inspeccionDenuncio";
    protected static final String MARCA = "marca";
    protected static final String MODALIDAD = "modalidad";
    protected static final String INTERVINO = "Nacional";
    protected static final String MODELO = "modelo";
    protected static final String NOMBRE_AUTOR_REPORTE = "nombreAutorReporte";
    protected static final String MODELO_DESDE = "modeloDesde";
    protected static final String MODELO_HASTA = "modeloHasta";
    protected static final String LINEA_RESERVA = "lineareserva";
    protected static final String NIF = "nif";
    protected static final String NOMBRE_TALLER = "nombreTaller";
    protected static final String NOMBRE_CASO = "nombreCaso";
    protected static final String NUMERO_DOCUMENTO = "numeroDocumento";
    protected static final String PLACA = "placa";
    protected static final String PORCENTAJE = "IVA 0% e ICM 0%";
    protected static final String NUMERO_PLACA = "numeroPlaca";
    protected static final String CONTEXTO = "url";
    protected static final String ORIGEN_SINIESTRO = "origenSiniestro";
    protected static final String PLAN = "plan";
    protected static final String PRODUCTO = "producto";
    protected static final String TIPO_DOCUMENTO = "tipoDocumento";
    protected static final String CEDULA_CIUDANIA = "CEDULA DE CIUDADANIA";
    protected static final String TIPO_SERVICIO = "tipoDeServicio";
    protected static final String TIPO_VEHICULO = "tipoVehiculo";
    protected static final String TIPO_COSTO = "tipoCosto";
    protected static final String SALVAMENTO = "Salvamento";
    protected static final String VALOR_SALVAMENTO = "$90.000 (COP)";
    protected static final String VALOR_PRETENCION = "valorPretencion";
    protected static final String VENTA_EMPLEADO = "Venta Empleado";
    protected static final String TIPO_DEMANDANTE = "tipoDemandante";
    protected static final String TEXTO_DESCRIPCION = "Prueba automatizada con SERENITY bdD ";
    protected static final String FECHA_RECLAMACION = "13/12/2017";
    protected static final String RELACION_ASEGURADO = "Él mismo";
    protected static final String CORREO_ELECTRONICO = "orreoprueba@yahoo.es";
    protected static final String TRANSITO_MEDELLIN = "Transito de Medellin";
    protected static final int VALUE_800 = 800;
    protected static final int VALUE_600 = 600;
    protected static final int VALUE_8000 = 8000;
    protected static final int VALUE_500 = 500;
    protected static final int VALUE_50 = 50;
    protected static final int VALUE_5 = 5;
    protected static final int VALUE_4000 = 4000;
    protected static final int VALUE_300 = 300;
    protected static final int VALUE_30 = 30;
    protected static final int VALUE_3 = 3;
    protected static final int VALUE_2000 = 2000;
    protected static final int VALUE_200 = 200;
    protected static final int VALUE_20 = 20;
    protected static final int VALUE_1500 = 1500;
    protected static final int VALUE_15 = 15;
    protected static final int VALUE_1000 = 1000;
    protected static final int VALUE_100 = 100;
    protected static final int VALUE_10 = 10;
    protected static final int VALUE_0 = 0;
    protected static final int VALUE_1 = 1;
    protected static final int VALUE_2 = 2;
    protected static final int VALUE_4 = 4;
    protected static final int VALUE_6 = 6;
    protected static final int VALUE_7 = 7;
    protected static final int VALUE_8 = 8;
    protected static final int VALUE_9 = 9;
    /*metodos lambda*/
    int posicion = 0;
    List<WebElement>  listatabla;
    @FindBy(xpath = ".//*[@id='ActivityPatterns:ActivityPatternsScreen:ActivityPatternsLV-body']")
    List<WebElement> pathElemento;
        @FindBy(xpath = ".//*[@id='FNOLWizard:GeneralPropertyWizardStepSet:NewClaimWizard_MainContactsScreen" +
            ":NewClaimPeopleDV:ContactEFTLV_tb:Add-btnInnerEl']")
    private WebElementFacade btnAgregar;
    @FindBy(xpath = "//td[3]/div")
    private WebElementFacade txtNombreBanco;
    @FindBy(xpath = "//div[4]/table/tbody/tr/td[2]/input")
    private WebElementFacade txtNombreBanco1;
    @FindBy(name = "BankAccountType")
    private WebElementFacade txtTipoCuenta;
    @FindBy(xpath = ".//input[@name='BankAccountNumber']")
    private WebElementFacade txtNumeroCuenta1;
    @FindBy(xpath = "//div[7]/table/tbody/tr/td[2]/input")
    private WebElementFacade txtNumeroDeEnrutamiento1;
    @FindBy(xpath = ".//td[7]/div/table/tbody/tr/td/input")
    private WebElementFacade rdoBtnPrincipalSi;
    @FindBy(xpath = ".//*[@id='Claim:ClaimMenuActions-btnInnerEl']")
    public WebElementFacade mnuAcciones;
    @FindBy(xpath = ".//*[@id='ClaimSummary:ClaimSummaryScreen:ttlBar']")
    private WebElementFacade lblResumen;
    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen" +
            ":LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:Address_Picker" +
            "-inputEl']")
    private WebElementFacade lugarReclamacion;
    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade paisReclamacion;
    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade departamentoReclamacion;
    @FindBy(xpath = ".//*/input[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:Sura_Colombian_City-inputEl']")
    private WebElementFacade cuidadReclamacion;
    @FindBy(xpath = ".//*[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade direccionReclamacion;
    @FindBy(xpath = ".//*[@id=':tabs-menu-trigger-btnIconEl']")
    protected WebElementFacade menuHamburguesa;


    public GrandPage(WebDriver driver) {
        super(driver);
    }


    protected void deployMenu(WebElementFacade menu) {
        waitFor(menu).shouldBePresent();
        waitAndClick(menu,3);
        waitUntil(VALUE_1000);
        acciones.moveToElement(menu);
        waitUntil(VALUE_1000);
        acciones.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitUntil(VALUE_1000);
    }
    public void lugarDeReclamcion() {
        esperaProceso(VALUE_50,lugarReclamacion);
        esperaProceso(VALUE_50,paisReclamacion);
        waitAndClick(paisReclamacion,2);
        ingresarDato(paisReclamacion,"Colombia");
        paisReclamacion.sendKeys(Keys.TAB);
        esperaProceso(VALUE_50,departamentoReclamacion);
        ingresarDato(departamentoReclamacion,"Antioquia");
        departamentoReclamacion.sendKeys(Keys.TAB);
        esperaProceso(VALUE_50,cuidadReclamacion);
        ingresarDato(cuidadReclamacion,"Medellin");
        cuidadReclamacion.sendKeys(Keys.TAB);
        esperaProceso(VALUE_50,direccionReclamacion);
        ingresarDato(direccionReclamacion,"Calle falsa 123-456");
        direccionReclamacion.sendKeys(Keys.TAB);
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
    public void waitClick(WebElementFacade facade) {
        withTimeoutOf(VALUE_15, TimeUnit.SECONDS).waitFor(facade).shouldBeEnabled();
    }
    public void esperaVisible(WebElementFacade elemento) {
        waitFor(ExpectedConditions.visibilityOf(elemento));
    }
    protected void esperaProceso(int tiempoEspera,WebElementFacade elemento) {
        boolean enProceso = true;
        int verificaciones = (int) (tiempoEspera / 30000);
        while (enProceso && verificaciones-- > 0) {
            waitABit(30000);
            enProceso = elemento.isVisible();
        }
    }


    public void selectItem(WebElementFacade element, String option) {
        waitUntil(VALUE_100);
        waitFor(element).click();
        waitUntil(VALUE_300);
        element.clear();
        waitUntil(VALUE_200);
        element.sendKeys(option);
        element.sendKeys(Keys.ENTER);
        waitForComboValue(element, option);
    }

    public void compararElemento(String mensaje, WebElementFacade element, String dato) {
        waitUntil(VALUE_1500);
        MatcherAssert.assertThat(mensaje, element.getText().contains(dato));
    }

    public void waitForComboValue(WebElementFacade element, String value) {
        waitUntil(VALUE_600);
        withTimeoutOf(VALUE_20, TimeUnit.SECONDS).waitFor(ExpectedConditions.textToBePresentInElementValue
                (element, value));
        waitUntil(VALUE_300);
    }

    public String cedulaRandom() {
        int cedula = (int) Math.floor(Math.random() * (10000000 - 99999999) + 99999999);
        return Integer.toString(cedula);
    }

    public List<WebElementFacade> getLista(String locator) {
        return withTimeoutOf(VALUE_20, TimeUnit.SECONDS).findAll(locator);
    }

    public WebElementFacade getElementos(String locator) {
        return withTimeoutOf(VALUE_20, TimeUnit.SECONDS).find(locator);
    }

    public void seleccionarProducto(ExamplesTable datosReclamacion) {
        Map<String, String> datoReclamacion = datosReclamacion.getRow(VALUE_0);
        List<WebElementFacade> descripcionProductos = getLista("" +
                ".//*[@id='FNOLWizard:FNOLWizard_PickPolicyRiskUnitsScreen:PolicySummaryPropertyLV-body']//td[3]");
        List<WebElementFacade> botones = getLista("" +
                ".//*[@id='FNOLWizard:FNOLWizard_PickPolicyRiskUnitsScreen:PolicySummaryPropertyLV-body']//td[1]");
        int i = VALUE_0;
        if (!descripcionProductos.isEmpty()) {
            for (WebElementFacade descripcion : descripcionProductos) {
                if (datoReclamacion.get("nombreProducto").equals(descripcion.getText())) {
                    botones.get(i).click();
                }
                i++;
            }
        }
    }

    public void buscarNumClicTabla(ExamplesTable datosExpo) {
        Map<String, String> datoExpo1 = datosExpo.getRow(0);
        String pathelemento = ".//*[@id='ClaimExposures:ClaimExposuresScreen:ExposuresLV-body']/*/table/tbody/tr";
        List<WebElementFacade> tablaexposiciones = getLista(pathelemento);
        int tamanoexposiciones = tablaexposiciones.size();
        for (int i = 1; i <= tamanoexposiciones; i++) {
            WebElementFacade camposCober = getElementos(pathelemento + "[" + i + COLUMNA_4);
            camposCober.click();
            WebElementFacade camposdemanda = getElementos(pathelemento + "[" + i + COLUMNA_6);
            WebElementFacade camposCheck = getElementos(pathelemento + "[" + i + COLUMNA_1);
            WebElementFacade camposTipoExpo = getElementos(pathelemento + "[" + i + COLUMNA_3);

            if (camposTipoExpo.getText().equals(datoExpo1.get("tipoExpo")) &&
                    (camposCober.getText().equals(datoExpo1.get("cobertura"))) &&
                    (camposdemanda.getText().equals(datoExpo1.get("demandante")))) {
                camposCheck.click();
                waitUntil(VALUE_1000);
                WebElementFacade tipo = getElementos("" +
                        ".//*[@id='ClaimExposures:ClaimExposuresScreen:ExposuresLV:" + (i - 1) + ":Type']");
                tipo.click();
                waitUntil(VALUE_1000);
                break;
            }
        }
    }

    public void ingresarDato(WebElementFacade elemento, String dato) {
        do {
            waitFor(elemento);
            elemento.clear();
            esperaPredicate(elemento,VALUE_600);
            waitUntil(VALUE_600);
            waitFor(elemento).shouldContainText("");
            elemento.sendKeys(dato);
        } while (!elemento.getValue().equals(dato));
    }

    public WebElementFacade getElemento(String locator) {
        return withTimeoutOf(VALUE_10, TimeUnit.MILLISECONDS).find(locator);
    }


    public void clicObjeto(WebElementFacade objeto) {
        objeto.isPresent();
        objeto.waitUntilClickable().click();
    }

    public boolean validarObjetoClikeableServidor(String pathElemento, int maximoEjecuciones) {
        WebElementFacade elemento;
        boolean ejecuto = false;
        int ejecuciones = 0;
        while (!ejecuto && ejecuciones < maximoEjecuciones) {
            this.waitUntil(VALUE_500);
            elemento = this.getElemento(pathElemento);
            this.clicObjeto(elemento);
            ejecuto = true;
            ejecuciones = ejecuciones + 1;
        }
        return ejecuto;
    }

    protected void esperaElemento(final WebElementFacade element) {
        withTimeoutOf(VALUE_20, TimeUnit.SECONDS).waitFor(element).shouldBeVisible();
        withTimeoutOf(VALUE_20, TimeUnit.SECONDS).waitFor(element).shouldBePresent();
    }

    public void arribaEnter() {
        acciones.sendKeys(Keys.ARROW_UP).build().perform();
        acciones.sendKeys(Keys.ENTER).build().perform();
    }

    public void esperaClickea(WebElementFacade elemento) {
        boolean ejecuto = false;
        int maximoEjecuciones = 50;
        int ejecuciones = 0;
        while (ejecuciones < maximoEjecuciones && !ejecuto) {
            this.waitUntil(VALUE_1000);
            this.clicObjeto(elemento);
            ejecuto = true;
            ejecuciones = ejecuciones + 1;
        }
        if (!ejecuto) {
            MatcherAssert.assertThat("No se pudo dar click a botón", false);
        }
    }


    public void radioCheck(String texto, WebElementFacade elementSi, WebElementFacade elementNo) {
        if ("Sí".equals(texto)) {
            waitAndClick(elementSi,2);
        } else {
            waitAndClick(elementNo,2);
        }
    }

    public boolean validarResultadoTabla(String pathtabla, String verficarDato, int nrocolumna) {
        boolean encontrada = false;
        int cantidad = consultarNumeroElementosTabla(pathtabla);
        getTextoColumnas(pathElemento);
        for (int i = 1; i <= cantidad; i++) {
            if (consultarTextoCeldaTabla(pathtabla, i, nrocolumna).equals(verficarDato)) {
                encontrada = true;
                break;
            }
        }
        return encontrada;
    }

    public boolean validarResultadoFilaTabla(String pathtabla, String verficarDato) {
        boolean encontrada = false;
        int cantidad = consultarNumeroElementosTabla(pathtabla);
        for (int i = 1; i <= cantidad; i++) {
            WebElementFacade elemento = getElemento(pathtabla + "[" + i + "]");
            if (elemento.containsText(verficarDato)) {
                encontrada = true;
                break;
            }
        }
        return encontrada;
    }

    public int consultarNumeroElementosTabla(String pathTabla) {
        List<WebElementFacade> lista = this.getLista(pathTabla);
        return lista.size();
    }
    public List<String> getTextoColumnas(List path) {
        listatabla = path;
        return listatabla.stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());
    }

    public String consultarTextoCeldaTabla(String path, int indiceFila, int indiceColumna) {
        WebElementFacade elemento = getElemento(path + "[" + indiceFila + "]" + "/td[" + indiceColumna + "]");
        return elemento.getText();
    }


    public void escribirCampoTextoTabla(String path, int indiceColumna, WebElementFacade campo, String dato) {
        List<WebElementFacade> tablaexposiciones = getLista(path);
        int tamanoexposiciones = tablaexposiciones.size();
        for (int i = 1; i <= tamanoexposiciones; i++) {
            waitUntil(VALUE_100);
            WebElementFacade posiciontexto = getElementos(path + "[" + i + "]/td[" + indiceColumna + "]");
            waitFor(posiciontexto).click();
            campo.clear();
            campo.sendKeys(dato);
            campo.sendKeys(Keys.ENTER);
            waitUntil(VALUE_100);
            break;
        }
    }

    public void escribirComboTextoTabla(String path, int indiceColumna, WebElementFacade campo, String dato) {
        List<WebElementFacade> tablaexposiciones = getLista(path);
        int tamanoexposiciones = tablaexposiciones.size();
        for (int i = 1; i <= tamanoexposiciones; i++) {
            WebElementFacade posicioncombo = getElementos(path + "[" + i + "]/td[" + indiceColumna + "]");
            waitUntil(VALUE_200);
            posicioncombo.click();
            waitUntil(VALUE_200);
            campo.clear();
            campo.sendKeys(dato);
            campo.sendKeys(Keys.ENTER);
            waitUntil(VALUE_300);
            break;
        }
    }

    public void llenarDatosFraude(String path, int columna) {
        List<WebElementFacade> tablaexposiciones = getLista(path);
        int tamanoexposiciones = tablaexposiciones.size();
        if (columna == 1) {
            int campo = 17;
            int valor;
            for (int i = 1; i <= tamanoexposiciones; i++) {
                if (i == 7)
                    valor = 17;
                else {
                    valor = campo + i + 1;
                    campo++;
                }
                WebElementFacade radiob = getElementos(path + "/td[" + columna + "]//input[@inputvalue='QuestionChoice:" + valor + "']");
                waitFor(radiob).click();
                waitUntil(VALUE_200);
            }

        } else {
            int campo = 18;
            int valor;
            for (int i = 1; i <= tamanoexposiciones; i++) {
                if (i == 7)
                    valor = 18;
                else {
                    valor = campo + i + 1;
                    campo++;
                }
                WebElementFacade radiob = getElementos(path + "/td[" + columna + "]/input[@inputvalue='QuestionChoice:" + valor + "']");
                waitUntil(VALUE_100);
                waitAndClick(radiob,2);
            }
        }
    }

    protected void waitElementeUntilVisible(WebElementFacade element, int seconds) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), seconds);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
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

    protected void waitAndClick(WebElementFacade element, int loops){
        int i = 0;
        while(i < loops){
            try{
                element.waitUntilClickable().click();
                i = loops + 1;
            }catch (Exception e){
                LOGGER.info("Error: " + e);
                i++;
            }
        }
    }

    protected void seleccionarEnMenu(WebElementFacade botonEnBarra, WebElementFacade botonOcultoEnMenu){
        if(botonEnBarra.isVisible()){
            waitAndClick(botonEnBarra,3);
        } else {
            waitAndClick(menuHamburguesa,3);
            waitAndClick(botonOcultoEnMenu,3);
        }
    }

    private static class IntegerBooleanFunction implements Function<Integer, Boolean> {
        @Override
        public Boolean apply(Integer i) {
            return false;
        }
    }

}
