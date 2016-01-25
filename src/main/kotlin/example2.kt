package tutorial.example2

import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import java.util.*

interface DictionaryService {
    fun checkWord(word: String): Boolean
}

class DictionaryBundleActivator: BundleActivator {
    override fun stop(context: BundleContext?) {
        val props = Hashtable(hashMapOf("Language" to "English"))
        val name = DictionaryService::class.java.name
        context?.registerService(name, DictionaryServiceImpl(), props)
    }

    override fun start(context: BundleContext?) {
        println("Good bye my friend!.")
    }
}

private class DictionaryServiceImpl: DictionaryService {
    private val words = "welcome to the osgi tutorial".split(" ")
    override fun checkWord(word: String): Boolean {
        val item = word.toUpperCase()
        return item in words;
    }
}