fun main(args: Array<String>) {

    val b0 = Book()
    val b = Book("Adam Mickiewicz", "Pan Tadeusz", 830)
    val b2 = Book("Adam Mickiewicz", "Dziady", 130)
    val bb = NormalCover(b)
    val bb2 = SolidCover(b2)
    val bbb2 = DecorativeCover(bb2)
    val bb0 = NormalCover(b0)

    println(bb0)
    println(bb)
    println(bbb2)
}