fun main() {
    var s = "1234"
    println(s.let{(s.length==4 || s.length == 6) && s.all{it in ('0'..'9')}})
}