fun main(args: Array<String>) {

    try {

        val w = Wydawnictwo.getWydawnictwo("Adam Mickiewicz")
        val k = w.createBook("Dziady", 130)
        println(k)


        val w1 = Wydawnictwo.getWydawnictwo("Blazej Przygodzki")
        val k1 = w1.createBook("Dziennik samobojcow", 200)
        println(k1)

        val w2 = Wydawnictwo.getWydawnictwo("Stefan Zeromski")
        val k2 = w2.createBook("Syzyfowe Prace", 190)
        println(k2)
    }
    catch (e: IllegalArgumentException ) {println("Dla podanego autora nie istnieje wydawictwo: $e")}

}