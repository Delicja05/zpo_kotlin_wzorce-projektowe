class Book() : wyswietl{

    var autor: String = "Zwykly"
        get() = field
        set(value) {
            field = value
        }

    var tytul: String = "Zeszyt"
        get() = field
        set(value) {
            field = value
        }

    var stron: Int = 15
        get() = field
        set(value) {
            field = value
        }

    constructor(autor: String, tytul: String, stron: Int) : this() {
        this.autor = autor
        this.tytul = tytul
        this.stron = stron
    }

    override fun toString(): String {
        return " | $autor | $tytul | $stron | "
    }
}