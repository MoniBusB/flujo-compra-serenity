package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target PRIMER_PRODUCTO = Target.the("Primer producto")
        .located(By.cssSelector(".product-layout:nth-of-type(1) button[onclick^='cart.add']"));

    public static final Target SEGUNDO_PRODUCTO = Target.the("Segundo producto")
        .located(By.cssSelector(".product-layout:nth-of-type(2) button[onclick^='cart.add']"));

    public static final Target BOTON_CARRITO = Target.the("Botón del carrito")
        .located(By.id("cart-total"));
}