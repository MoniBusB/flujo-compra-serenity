Feature: Flujo de compra en OpenCart

  Scenario: Compra como invitado con dos productos
    Given el usuario está en la página principal
    When agrega dos productos al carrito
    And visualiza el carrito
    And procede al checkout como invitado
    And completa los datos de compra
    Then debe ver el mensaje "Your order has been placed!"