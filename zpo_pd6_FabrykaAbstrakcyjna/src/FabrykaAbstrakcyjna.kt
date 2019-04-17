class Poemat(override val autor: String, override val tytul: String, override val stron: Int, override val gatunek: String) : Book()
class PowiescHistoryczna(override val autor: String, override val tytul: String, override val stron: Int, override val gatunek: String) : Book()
class ThillerMedyczny(override val autor: String, override val tytul: String, override val stron: Int, override val gatunek: String) : Book()

abstract class Wydawnictwo {
    abstract fun createBook(tytul: String, stron: Int): Book

    companion object {
        fun getWydawnictwo(autor: String): Wydawnictwo = when (autor){
                "Adam Mickiewicz", "Juliusz Slowacki" -> WydawnictwoPoematow(autor, "Poemat")
                "Henryk Sienkiewicz", "Stefan Zeromski"  -> WydawnictwoPowiesciHistorycznych(autor, "Powiesc Historyczna")
                "Tess Gerritsen", "Blazej Przygodzki" -> WydawnictwoThillerow(autor, "Thiller Medyczny")
                else               -> throw IllegalArgumentException()

        }
    }
}

class WydawnictwoPoematow(private val autor: String, private val gatunek: String) : Wydawnictwo() {
    override fun createBook(tytul: String, stron: Int): Poemat = Poemat(autor, tytul, stron, gatunek)
}

class WydawnictwoPowiesciHistorycznych(private val autor: String, private val gatunek: String) : Wydawnictwo() {
    override fun createBook(tytul: String, stron: Int): PowiescHistoryczna = PowiescHistoryczna(autor, tytul, stron, gatunek)
}

class WydawnictwoThillerow(private val autor: String, private val gatunek: String) : Wydawnictwo() {
    override fun createBook(tytul: String, stron: Int): ThillerMedyczny = ThillerMedyczny(autor, tytul, stron, gatunek)
}