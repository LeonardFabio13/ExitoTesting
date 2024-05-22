package com.bdd.web.steps;


import com.bdd.web.page.ExitoTestingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExitoTestingSteps {
    WebDriver driver;
    // Espera explícita hasta que el botón se pueda hacer clic (considerar el tiempo de espera y el manejo de excepciones)
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    ExitoTestingPage exitoTestingPage() {
        return new ExitoTestingPage(driver);
    }

    public void que_entro_a_la_pagina_de_Exito() {
        System.setProperty("webdriver.chrome.driver", "drivers/win/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.exito.com/");
        driver.manage().window().maximize();
    }

    public void hagoClickEnElBotnDeMenu() {
        exitoTestingPage().getMenu().click();
    }

    public void selecionoLaCategoriaDormitorio() {
        exitoTestingPage().getCategoria().click();
    }

    public void selecionoLaSubCategoriaCabecera() {
        exitoTestingPage().getSubCategoria().click();
    }

    //Valido los nombres del de los productos
    public String validoProducto(String productoOne) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return exitoTestingPage().validoProducto1(productoOne);
    }

    public void loAgregoAlCarrito() throws InterruptedException {
        WebElement agregarCarritoButton = exitoTestingPage().getAgregarCarrito();
        wait.until(ExpectedConditions.elementToBeClickable(agregarCarritoButton)).click();
        // Espera explícita hasta que el selector de cantidad sea visible (opcional)
        wait.until(ExpectedConditions.visibilityOf(exitoTestingPage().SumatoriaProducto()));
        // Haz clic en el botón del selector de cantidad 2 veces
        for (int i = 0; i < 1; i++) {
            exitoTestingPage().SumatoriaProducto().click();
        }
        Thread.sleep(2000); // Pausa opcional entre clics para mayor estabilidad
    }

    public void agregoAlCarritoCincoUnidades() throws InterruptedException {
        WebElement agregarCarritoButton = exitoTestingPage().getAgregarCarritoTwo();
        wait.until(ExpectedConditions.elementToBeClickable(agregarCarritoButton)).click();
        // Espera explícita hasta que el selector de cantidad sea visible (opcional)
        wait.until(ExpectedConditions.visibilityOf(exitoTestingPage().getSumatoriaProducto2()));
        for (int i = 0; i < 4; i++) {
            WebElement agregarCarritoButtonMas = exitoTestingPage().getSumatoriaProducto2();
            wait.until(ExpectedConditions.elementToBeClickable(agregarCarritoButtonMas)).click();
        }
        Thread.sleep(2000); // Pausa opcional entre clics para mayor estabilidad
    }

    public void agregoAlCarritoNueveUnidades() throws InterruptedException {
        WebElement agregarCarritoButton = exitoTestingPage().getAgregarCarritoThree();
        wait.until(ExpectedConditions.elementToBeClickable(agregarCarritoButton)).click();
        // Espera explícita hasta que el selector de cantidad sea visible (opcional)
        wait.until(ExpectedConditions.visibilityOf(exitoTestingPage().getAgregarCarritoThree()));
        for (int i = 0; i < 8; i++) {
            WebElement agregarCarritoButtonMas = exitoTestingPage().getSumatoriaProducto3();
            wait.until(ExpectedConditions.elementToBeClickable(agregarCarritoButtonMas)).click();
        }
        Thread.sleep(2000); // Pausa opcional entre clics para mayor estabilidad
    }

    public void agregoAlCarritoUnidades() throws InterruptedException {
        WebElement agregarCarritoButton = exitoTestingPage().getAgregarCarritoFour();
        wait.until(ExpectedConditions.elementToBeClickable(agregarCarritoButton)).click();
        // Espera explícita hasta que el selector de cantidad sea visible (opcional)
        wait.until(ExpectedConditions.visibilityOf(exitoTestingPage().getAgregarCarritoFour()));
        for (int i = 0; i < 2; i++) {
            WebElement agregarCarritoButtonMas = exitoTestingPage().getSumatoriaProducto4();
            wait.until(ExpectedConditions.elementToBeClickable(agregarCarritoButtonMas)).click();
        }
        Thread.sleep(2000); // Pausa opcional entre clics para mayor estabilidad
    }

    public void agregoAlCarritoCuatroUnidades() throws InterruptedException {
        WebElement agregarCarritoButton = exitoTestingPage().getAgregarCarritoFive();
        wait.until(ExpectedConditions.elementToBeClickable(agregarCarritoButton)).click();
        // Espera explícita hasta que el selector de cantidad sea visible (opcional)
        wait.until(ExpectedConditions.visibilityOf(exitoTestingPage().getAgregarCarritoFive()));
        for (int i = 0; i < 3; i++) {
            WebElement agregarCarritoButtonMas = exitoTestingPage().getSumatoriaProducto5();
            wait.until(ExpectedConditions.elementToBeClickable(agregarCarritoButtonMas)).click();
        }
        Thread.sleep(2000); // Pausa opcional entre clics para mayor estabilidad
    }

    public void hagoCliclEnElCarritoParaVerTodoMisProducto() {
        exitoTestingPage().getCarritoDeCompras().click();
    }

    public String miTotalAPagarPorTodosMisProductos() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(exitoTestingPage().getPrecioTotal());
        return exitoTestingPage().getPrecioTotal();
    }
}
