object Czytelnia {
    init {
        println("Init: $this")
    }

    val stol = Stol(3)
    val regal = Regal()
}

fun main(args: Array<String>) {

    val stol = Czytelnia.stol

    try{
        stol.polozKsiazkeStol(Book())
        stol.polozKsiazkeStol(Book("Robin Cook", "Śpiączka", 300))
        stol.polozKsiazkeStol(Book("Juliusz Słowacki", "Kordian", 180))
        //stol.polozKsiazkeStol(Book())

        stol.wezKsiazkeStol()
    }
    catch(se: StolException) {println(se)}
    println(stol)

    println()

    val rb = RegalBuilder()
    rb.add(Polka(10000))
    rb.add(Polka(5000))
    val r = rb.toRegal() //Wlasciwy proces tworzenia obiektu Regal.

    try {
        println(r.getPolka(1))
        println(r.getPolka(2))
        //println(r.getPolka(3))
    }
    catch (re: RegalException) {println(re) }

    println()

    val p = Polka(6000)
    try {

        //p.wezKsiazke()  // PolkaException: Półka jest pusta!

        p.polozKsiazke(Book("Juliusz Słowacki", "Kordian", 180))
        p.polozKsiazke(Book("Robin Cook", "Śpiączka", 300))
        p.polozKsiazke(Book("Adam Mickiewicz", "Pan Tadeusz", 400))

        //p.wezKsiazke(2) // Zdejmuje ksiazke o indeksie 2
        //p.wezKsiazke()  // Zdejmuje ksiazke ostatnia na polce

        for(i in 0..1) // i == 1 --> PolkaException: Półka jest pełna!
        {
            val k = Book("Henryk Sienkiewicz", "Potop", 200)
            p.polozKsiazke(k)
        }

        //p.wezKsiazke(-1) //PolkaException: niedozwolony indeks książki
        //p.wezKsiazke(6)  //PolkaException: Niedozwolony indeks książki (są tylko dwie)

        println(p)
        p.polozKsiazke(2, Book("Juliusz ", "Kordian", 250))

    }
    catch(pe: PolkaException) {println(pe)}
    println(p)

}