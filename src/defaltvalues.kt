fun saludo (saludo:String = "   HOLA"){
    println(saludo)
}

fun otrafuncioon(Edad:Int=0 , esAulto:Boolean =false,tieneRopa:Boolean= true){

}
data class p1 (val a:Int = 2)
fun main() {
    saludo("Hola que paso ")
    saludo()

    otrafuncioon(esAulto = true,Edad= 30, tieneRopa = true)

    val OBJ = p1(3)

}