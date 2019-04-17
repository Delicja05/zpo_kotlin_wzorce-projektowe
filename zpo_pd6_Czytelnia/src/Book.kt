class Book(){

    var autor: String = "Zwykly"
    var tytul: String = "Zeszyt"
    var stron: Int = 15

    constructor(autor: String, tytul: String, stron: Int) : this() {
        this.autor = autor
        this.tytul = tytul
        this.stron = stron
    }

    override fun toString(): String {
        return " | $autor | $tytul | $stron | "
    }
}