package shop

import org.junit.Test
import kotlin.test.assertEquals

class ShoppingCartTest {

    @Test
    fun `It gets the total amount from shopping cart`(){
        val shoppingCart = ShoppingCart()
        val product = Product("T-shirt", 50.00)
        val product2 = Product("Bandana", 50.00)

        shoppingCart.addProduct(product)
        shoppingCart.addProduct(product2)
        var totalAmount = shoppingCart.totalAmount

        assertEquals(100.00, totalAmount)
    }
}