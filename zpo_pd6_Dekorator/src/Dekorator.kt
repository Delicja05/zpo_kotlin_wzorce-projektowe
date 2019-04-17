interface wyswietl {
    override fun toString(): String
}

class NormalCover(val ksiazka: wyswietl) : wyswietl by ksiazka {
    override fun toString(): String {
        return " (" + ksiazka.toString() + ") "
    }
}

class SolidCover(val ksiazka: wyswietl) : wyswietl by ksiazka {
    override fun toString(): String {
        return " [" + ksiazka.toString() + "] "
    }
}

class DecorativeCover(val ksiazka: wyswietl) : wyswietl by ksiazka {
    override fun toString(): String {
        return " {" + ksiazka.toString() + "} "
    }
}