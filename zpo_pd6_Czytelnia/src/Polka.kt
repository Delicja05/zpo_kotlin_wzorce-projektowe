class Polka(val ileStron: Int) {

    var zbiorKsiazek =  mutableMapOf<Int, Book>()
    var strony: Int = 0

    fun wezKsiazke(): Book? {
        if(zbiorKsiazek.isEmpty()) {
            throw PolkaException(" Polka jest pusta! ")
        }

        var k: Book? = zbiorKsiazek.get(zbiorKsiazek.size)
        zbiorKsiazek.remove(zbiorKsiazek.size)

        return k

    }

    fun wezKsiazke(index: Int): Book? {
        if(!zbiorKsiazek.containsKey(index)) {
            throw PolkaException(" niedozwolony indeks książki ")
        }

        val k: Book? = zbiorKsiazek.get(index)

        //przesunac wszystko
        for(i in index..zbiorKsiazek.size){
            zbiorKsiazek.get(i+1)?.let { zbiorKsiazek.put(i, it) }
        }
        zbiorKsiazek.remove(zbiorKsiazek.size)

        return k
    }

    fun polozKsiazke(k: Book){
        if(strony + k.stron > ileStron) {
            throw PolkaException(" Półka jest pełna! ")
        }

        zbiorKsiazek.put(zbiorKsiazek.size+1,k)
        strony = strony + k.stron
    }

    fun polozKsiazke(index: Int, k: Book){
        if(strony + k.stron > ileStron) {
            throw PolkaException(" Półka jest pełna! ")
        }

        var usunieta: Book? = zbiorKsiazek.get(index)
        zbiorKsiazek.put(index,k)

        //przesunąc wszystko
        for(i in zbiorKsiazek.size downTo index+1 step 1){
            zbiorKsiazek.get(i)?.let { zbiorKsiazek.put(i+1, it) }
        }

        usunieta?.let { zbiorKsiazek.put(index+1, it) }
        strony = strony + k.stron

    }

    override fun toString(): String {

//        for(ksiazka in zbiorKsiazek)
//            println("| $ksiazka")

        return "Ksiazki na polce: $zbiorKsiazek"
    }
}

class PolkaException(wiadomosc:String): Exception(wiadomosc)