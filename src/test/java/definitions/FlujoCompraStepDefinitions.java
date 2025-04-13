package definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ConfirmacionOrden;
import tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class FlujoCompraStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario");
    }

    @Given("el usuario está en la página principal")
    public void el_usuario_esta_en_la_pagina_principal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirNavegador.enPagina());
    }

    @When("agrega dos productos al carrito")
    public void agrega_dos_productos_al_carrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductos.alCarrito());
    }

    @When("visualiza el carrito")
    public void visualiza_el_carrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(VisualizarCarrito.ahora());
    }

    @When("procede al checkout como invitado")
    public void procede_al_checkout_como_invitado() {
        OnStage.theActorInTheSpotlight().attemptsTo(CheckoutInvitado.desdeCarrito());
    }

    @When("completa los datos de compra")
    public void completa_los_datos_de_compra() {
        OnStage.theActorInTheSpotlight().attemptsTo(CompletarDatosInvitado.conInformacion());
    }

    @Then("debe ver el mensaje {string}")
    public void debe_ver_el_mensaje(String mensaje) {
        OnStage.theActorInTheSpotlight().should(seeThat(ConfirmacionOrden.mensaje(), containsString(mensaje)));
    }
}