package stack


import org.junit.Assert.*
import org.junit.Test
import kotlin.test.assertFailsWith

class StackExampleTest {

    @Test
    fun `It checks if stack is empty`(){
        var elements = mutableListOf<String>()
        val stack = StackExample(elements)

        val isEmpty = stack.elements.isEmpty()

        assertTrue(isEmpty)
        assertEquals(0, stack.elements.size)
    }

    @Test
    fun `It checks if stack is not empty`(){
        val elements = mutableListOf<String>()
        val stack = StackExample(elements)
        val element = "first"

        stack.stackElement(element)
        val isEmpty = stack.elements.isEmpty()

        assertFalse(isEmpty)
    }

    @Test
    fun `It stacks one element`(){
        val elements = mutableListOf<String>()
        val stack = StackExample(elements)
        val element = "first"

        stack.stackElement(element)
        val topElement = stack.getTopElement()

        assertEquals(1, stack.elements.size)
        assertEquals(element, topElement)
    }

    @Test
    fun `It unstack one element`(){
        val elements = mutableListOf<String>()
        val stack = StackExample(elements)
        val firstElement = "first"
        val secondElement = "second"

        stack.stackElement(firstElement)
        stack.stackElement(secondElement)
        val unstackedElement = stack.unstackElement()
        val topElement = stack.getTopElement()

        assertEquals(firstElement, topElement)
        assertEquals(secondElement, unstackedElement)
    }

    @Test
    fun `It throws exception when unstacking empty stack`(){
        val elements = mutableListOf<String>()
        val stack = StackExample(elements)

        assertFailsWith(Exception::class, "Stack is empty!") {
            stack.unstackElement()
        }
    }
}
