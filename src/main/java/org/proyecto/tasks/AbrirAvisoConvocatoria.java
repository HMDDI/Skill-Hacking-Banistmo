package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static org.proyecto.userinterface.PaginaProveedores.*;


public class AbrirAvisoConvocatoria implements Task {

    public static AbrirAvisoConvocatoria AbrirAviso (){
        return Tasks.instrumented(AbrirAvisoConvocatoria.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(btn_conoce_mas),
                Click.on(btn_conoce_mas)
        );

    }
}
