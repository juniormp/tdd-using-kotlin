package refactoring

import org.junit.Assert.*
import org.junit.Test

class CustomerTest() {

    @Test
    fun `When customer is senior then discount is 0`() {
        val customer = Customer(true, false, false)

        val discount = customer.calculateDiscount()

        assertEquals(0, discount)
    }

    @Test
    fun `When customer is not senior and already subsidized then discount is 250`() {
        val customer = Customer(false, true, false)

        val discont = customer.calculateDiscount()

        assertEquals(250, discont)
    }

    @Test
    fun `When customer is not senior and already subsidized and part time then discount is 250`() {
        val customer = Customer(false, false, true)

        val discont = customer.calculateDiscount()

        assertEquals(250, discont)
    }

    @Test
    fun `When customer is not senior and already subsidized and not part time then discount is 500`() {
        val customer = Customer(false, false, false)

        val discont = customer.calculateDiscount()

        assertEquals(500, discont)
    }
}