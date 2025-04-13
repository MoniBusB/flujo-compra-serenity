package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VisualizarCarrito implements Task {

    public static VisualizarCarrito ahora() {
        return instrumented(VisualizarCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(HomePage.BOTON_CARRITO, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(HomePage.BOTON_CARRITO)
        );
    }
}