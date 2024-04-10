fun main() {
    val item = Item("book",123)
    println(item.name)
}

class Item(
    val name : String,
    val price : Int
)