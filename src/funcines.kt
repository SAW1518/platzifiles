fun hello():Unit {
    println("Hola a todos")
}

fun sume (a:Int, b:Int){
    println("suma : $a y $b = ${a+b}")

}
/*fun max ( a:Int , b:Int):Int{
    return if (a>b)
        a
    else
        b
}*/
fun max (a:Int, b:Int)= if (a<b) a else b

fun main() {
    println(max(4 ,9))
}