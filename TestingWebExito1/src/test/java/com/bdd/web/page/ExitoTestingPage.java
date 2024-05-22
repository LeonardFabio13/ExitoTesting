package com.bdd.web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExitoTestingPage {
    WebDriver driver;

    public ExitoTestingPage(WebDriver driver) {
        this.driver = driver;
    }

    //XPATH
    By menuDesplegable = By.xpath("//*[@id=\"__next\"]/header/section/div/div[1]/button/div");
    By categoria = By.xpath("//*[@id=\"__next\"]/header/aside/ul/section[2]/div/li[6]/div");
    By subCategoria = By.xpath("//*[@id=\"column-2\"]/li[1]/ul/li[1]/a");
    //--------
    String producto1 = "//a[text()='respuesta']";//Captura el nombre de los productos

    By agregarCarrito = By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[1]/article/section/div[2]/div[2]/button");
    By sumatoriaProducto = By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[1]/article/section/div[2]/div[2]/div/button[2]");
    //----
    By agregarCarrito2 = By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[2]/article/section/div[2]/div[2]/button");
    By sumatoriaProducto2 = By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[2]/article/section/div[2]/div[2]/div/button[2]");
    //----
    By agregarCarrito3 = By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[7]/article/section/div[2]/div[2]/button");
    By sumatoriaProducto3 = By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[7]/article/section/div[2]/div[2]/div/button[2]");
    //----
    By agregarCarrito4 = By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[8]/article/section/div[2]/div[2]/button");
    By sumatoriaProducto4 = By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[8]/article/section/div[2]/div[2]/div/button[2]");
    //----
    By agregarCarrito5 = By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[5]/article/section/div[2]/div[2]/button");
    By sumatoriaProducto5 = By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[5]/article/section/div[2]/div[2]/div/button[2]");
    //----
    By carritoCompra = By.xpath("//*[@id=\"__next\"]/header/section/div/div[2]/div[2]/button/span");
    By precioTotal = By.xpath("//span[contains(text(), '7.471.150')]");


    //METODO WEB ELEMENT
    public WebElement getMenu() {
        return driver.findElement(menuDesplegable);
    }

    public WebElement getCategoria() {
        return driver.findElement(categoria);
    }

    public WebElement getSubCategoria() {
        return driver.findElement(subCategoria);
    }

    //------
    public String validoProducto1(String productoOne) {
        String respuestaNueva = producto1.replace("respuesta", productoOne);
        WebElement validar = driver.findElement(By.xpath(respuestaNueva));
        return validar.getText();
    }

    public WebElement getAgregarCarrito() {
        return driver.findElement(agregarCarrito);
    }

    public WebElement SumatoriaProducto() {
        return driver.findElement(sumatoriaProducto);
    }

    //------

    public WebElement getAgregarCarritoTwo() {
        return driver.findElement(agregarCarrito2);
    }

    public WebElement getSumatoriaProducto2() {
        return driver.findElement(sumatoriaProducto2);
    }

    //------
    public WebElement getAgregarCarritoThree() {
        return driver.findElement(agregarCarrito3);
    }

    public WebElement getSumatoriaProducto3() {
        return driver.findElement(sumatoriaProducto3);
    }

    public WebElement getAgregarCarritoFour() {
        return driver.findElement(agregarCarrito4);
    }

    public WebElement getSumatoriaProducto4() {
        return driver.findElement(sumatoriaProducto4);
    }

    public WebElement getAgregarCarritoFive() {
        return driver.findElement(agregarCarrito5);
    }

    public WebElement getSumatoriaProducto5() {
        return driver.findElement(sumatoriaProducto5);
    }

    public WebElement getCarritoDeCompras() {
        return driver.findElement(carritoCompra);
    }

    public String getPrecioTotal() {
        return driver.findElement(precioTotal).getText();
    }
}
