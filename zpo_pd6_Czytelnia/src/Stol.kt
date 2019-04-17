class Stol(val M: Int?) {

    var stos: MutableList<Book> = mutableListOf()

    fun polozKsiazkeStol(k: Book) {
        if(stos.size == this.M) {
            throw StolException(" Stol jest pelny! ")
        }
        stos.add(k)
    }

    fun wezKsiazkeStol(): Book? {
        val ksiazka = stos.lastOrNull()

        if (stos.isEmpty()){
            throw StolException(" Stol jest pusty! ")
        }

        return stos.removeAt(stos.size -1)


    }

    override fun toString(): String {
        return "Ksiazki na stole: $stos"
    }
}

class StolException(wiadomosc:String): Exception(wiadomosc)