package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.proyecto.userinterface.PaginaBanistmo.*;
import static org.proyecto.userinterface.PaginaAcercadeNosotros.*;


public class IrSeccionProveedores implements Task {
    public static IrSeccionProveedores IrProveedores(){

        return Tasks.instrumented(IrSeccionProveedores.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(btn_aceptar_cookies, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(btn_aceptar_cookies),
                Click.on(btn_acercade),
                Click.on(btn_info_corporativa),
                Click.on(btn_proveedores)
        );

    }
}
