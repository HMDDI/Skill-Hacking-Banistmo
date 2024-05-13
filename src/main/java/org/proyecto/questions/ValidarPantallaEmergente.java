package org.proyecto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static org.proyecto.userinterface.PaginaProveedores.aviso_convocatoria;

public class ValidarPantallaEmergente implements Question<String> {
    public static ValidarPantallaEmergente PantallaEmergente() {
        return new ValidarPantallaEmergente();
    }

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(aviso_convocatoria).answeredBy(actor).toString();
    }
}