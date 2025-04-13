package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProductos implements Task {

    public static AgregarProductos alCarrito() {
        return instrumented(AgregarProductos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(HomePage.PRIMER_PRODUCTO),
            Click.on(HomePage.SEGUNDO_PRODUCTO)
        );
    }
}