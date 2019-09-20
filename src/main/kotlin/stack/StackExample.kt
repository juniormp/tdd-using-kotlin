package stack

import java.util.*
import javax.lang.model.util.Elements

class StackExample(var elements: MutableList<String>) {

     fun stackElement(element : String){
         elements.add(element)
     }

    fun getTopElement(): String {
        return elements[elements.size-1]
    }

    fun unstackElement() : String{
        if (elements.isEmpty())
            throw Exception("Stack is empty!")

        val element = getTopElement()
        elements.remove(element)

        return element
    }
}