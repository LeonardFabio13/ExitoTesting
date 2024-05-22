package com.bdd.web.stepdefinitions;

import com.bdd.web.steps.ExitoTestingSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;

public class ExitoTestingStepdefs {
    ExitoTestingSteps exitoTestingSteps = new ExitoTestingSteps();

    @Dado("que entro a la pagina de Exito")
    public void que_entro_a_la_pagina_de_Exito(){
        exitoTestingSteps.que_entro_a_la_pagina_de_Exito();
    }
    @Cuando("hago click en el botn de menu")
    public void hagoClickEnElBotnDeMenu() {
        exitoTestingSteps.hagoClickEnElBotnDeMenu();
    }

    @Y("seleciono la categoria dormitorio")
    public void selecionoLaCategoriaDormitorio() {
        exitoTestingSteps.selecionoLaCategoriaDormitorio();
    }

    @Y("seleciono la sub-categoria Cabecera")
    public void selecionoLaSubCategoriaCabecera() {
        exitoTestingSteps.selecionoLaSubCategoriaCabecera();
    }

    @Y("^seleciono el producto \"([^\"]*)\"$")
    public void selecionoElProducto(String productoOne) {
        Assert.assertEquals(exitoTestingSteps.validoProducto(productoOne),productoOne);
    }

    @Y("agrego al carrito dos unidades")
    public void loAgregoAlCarrito() throws InterruptedException {
        exitoTestingSteps.loAgregoAlCarrito();
    }

    @Y("vuelvo a seleccionar otro porducto que es {string}")
    public void vuelvoASeleccionOtroPorductoQueEs(String productoTwo) {
        Assert.assertEquals(exitoTestingSteps.validoProducto(productoTwo),productoTwo);
    }

    @Y("agrego al carrito cinco unidades")
    public void agregoAlCarritoCincoUnidades() throws InterruptedException {
        exitoTestingSteps. agregoAlCarritoCincoUnidades();
    }

    @Y("vuelvo a seleccionar el tercer porducto que se {string}")
    public void vuelvoASeleccionarElTercerPorductoQueSe(String productoThre) {
        Assert.assertEquals(exitoTestingSteps.validoProducto(productoThre),productoThre);
    }

    @Y("agrego al carrito nueve unidades")
    public void agregoAlCarritoNueveUnidades() throws InterruptedException {
        exitoTestingSteps.agregoAlCarritoNueveUnidades();
    }

    @Y("vuelvo a seleccionar el cuarto porducto que se {string}")
    public void vuelvoASeleccionarElCuartoPorductoQueSe(String productoFour) {
        Assert.assertEquals(exitoTestingSteps.validoProducto(productoFour),productoFour);
    }

    @Y("agrego al carrito tres unidades")
    public void agregoAlCarritoUnidades() throws InterruptedException {
        exitoTestingSteps.agregoAlCarritoUnidades();
    }

    @Y("vuelvo a seleccionar el quinto porducto que se {string}")
    public void vuelvoASeleccionarElQuintoPorductoQueSe(String productoFive) {
        Assert.assertEquals(exitoTestingSteps.validoProducto(productoFive),productoFive);
    }

    @Y("agrego al carrito cuatro unidades")
    public void agregoAlCarritoCuatroUnidades() throws InterruptedException {
        exitoTestingSteps.agregoAlCarritoCuatroUnidades();
    }

    @Entonces("hago clicl en el carrito para ver todo mis producto")
    public void hagoCliclEnElCarritoParaVerTodoMisProducto() {
        exitoTestingSteps.hagoCliclEnElCarritoParaVerTodoMisProducto();
    }

    @Y("al pagar por todos mis productos me sale un {string}")
    public void miTotalAPagarPorTodosMisProductos(String precio) {
        Assert.assertEquals(exitoTestingSteps.miTotalAPagarPorTodosMisProductos(),precio);
    }
}
