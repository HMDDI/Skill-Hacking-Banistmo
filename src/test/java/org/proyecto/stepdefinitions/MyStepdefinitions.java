package org.proyecto.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.proyecto.questions.ValidarPantallaEmergente;
import org.proyecto.tasks.AbrirAvisoConvocatoria;
import org.proyecto.tasks.IrPaginaBanistmo;
import org.proyecto.tasks.IrSeccionProveedores;


public class MyStepdefinitions {

    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que un usuario acceda a la pagina de Banistmo")
    public void IralaPaginaBanistmo() {
        OnStage.theActorCalled("actor").wasAbleTo(IrPaginaBanistmo.urlApp());
    }

    @Cuando("se diriga al apartado Acerda de nosotros, ingrese a Infomración Corporativa, Seleccione la opción Proveedores")
    public void IralaSeccionProveedores() { OnStage.theActorInTheSpotlight().attemptsTo(IrSeccionProveedores.IrProveedores()); }

    @Y("haga click en CONOCE MÁS")
    public void AbrirAvisoConvocatoriaFideicomoiso() { OnStage.theActorInTheSpotlight().attemptsTo(AbrirAvisoConvocatoria.AbrirAviso()); }

    @Entonces("se mostrará una ventana emergente con la información del Aviso convocatoria para fideicomosio")
    public void ValidarPantallaEmergente() {
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPantallaEmergente.PantallaEmergente(), Matchers.containsString("Aviso de Convocatoria")));
    }

}
