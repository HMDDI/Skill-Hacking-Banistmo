package org.proyecto.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class PaginaBanistmo extends PageObject {
    public static final By btn_acercade = By.xpath("//a[@href='/wps/portal/banistmo/acerca-de']");
    public static final By btn_aceptar_cookies = By.id("btn-aceptar-cookies");

}
