package translator

import org.junit.Test
import kotlin.test.*

class TranslatorToolTest {

    @Test
    fun `It checks if translator is empty`(){
        val translator = TranslatorTool();

        val isEmpty = translator.isEmpty()

        assertTrue(isEmpty)
    }

    @Test
    fun `It adds one word into dictionary with translation`(){
        val translator = TranslatorTool();

        translator.addWord("bom", "good")
        val isEmpty = translator.isEmpty()

        assertFalse(isEmpty)
    }

    @Test
    fun `It translates one word`(){
        val translator = TranslatorTool();

        translator.addWord("bom", "good")
        val translated = translator.translateWord("bom")

        assertEquals("good", translated)
    }

    @Test
    fun `It throws an exception if word do not exist in dictionary`(){
        val translator = TranslatorTool();

        translator.addWord("bom", "good")

        assertFailsWith(Exception::class, "Word do not exist in dictionary!"){
            translator.translateWord("mau")
        }
    }

    @Test
    fun `It translate one word with all possibilities`(){
        val translator = TranslatorTool();

        translator.addWord("bom", "good")
        translator.addWord("bom", "nice")
        val translated = translator.translateWord("bom")

        assertEquals("good, nice", translated)
    }
}