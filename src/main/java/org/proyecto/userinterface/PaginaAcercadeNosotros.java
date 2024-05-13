package org.proyecto.userinterface;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class PaginaAcercadeNosotros extends PageObject {
    public static final By btn_info_corporativa = By.xpath("//a[@href='#'and contains(text(),'Información Corporativa')]");
    public static final By btn_proveedores = By.xpath("//a[@href='/wps/portal/banistmo/acerca-de/informacion-corporativa/proveedores']");

}
