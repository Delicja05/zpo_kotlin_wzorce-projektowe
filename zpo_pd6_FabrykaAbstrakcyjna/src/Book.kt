open class Book{
    open val autor: String
        get() {
            return autor
        }

    open val tytul: String
        get() {
            return tytul
        }

    open val stron: Int
        get() {
            return stron
        }
    open val gatunek: String
        get() {
            return gatunek
        }

    override fun toString(): String {
        return " | $autor | $tytul | $stron | $gatunek | "
    }
}