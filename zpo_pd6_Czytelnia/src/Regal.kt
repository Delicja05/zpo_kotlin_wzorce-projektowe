class Regal {

    var zbiorPolek =  mutableMapOf<Int, Polka>()

    fun setMap(zbiorPolek: MutableMap<Int, Polka>){
        this.zbiorPolek = zbiorPolek
    }

    fun getPolka(index: Int): Polka? {
        if(!zbiorPolek.containsKey(index)) {
            throw RegalException(" Taka polka nie istnieje ")
        }

        return zbiorPolek.get(index)
    }

}

class RegalBuilder() {

    constructor(init: RegalBuilder.() -> Unit) : this() {
        init()
    }

    private var zbiorPolek =  mutableMapOf<Int, Polka>()

    fun add(polka: Polka){
        zbiorPolek.put(zbiorPolek.size+1, polka)
    }

    fun toRegal(): Regal{
        Czytelnia.regal.setMap(zbiorPolek)

        return Czytelnia.regal
    }
}

class RegalException(wiadomosc:String): Exception(wiadomosc)