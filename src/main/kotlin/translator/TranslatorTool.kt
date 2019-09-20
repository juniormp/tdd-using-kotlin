package translator

class TranslatorTool {

    private val dictionary = mutableMapOf<String, String>()

    fun isEmpty() : Boolean {
        return dictionary.isEmpty();
    }

    fun addWord(word: String, translation: String) {
        if(dictionary.containsKey(word)){
           dictionary[word] = dictionary[word] + ", " + translation
        } else {
            dictionary[word] = translation
        }
    }

    fun translateWord(word: String): String? {
        if(dictionary[word] == null)
            throw Exception("Word do not exist in dictionary!")

        return dictionary[word]
    }


}