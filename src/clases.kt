class Ejemplo{
    fun hola(){
        println("Hola Papu")
    }
}
class Person (val nombre:String){
    init{
        println("Nombre $nombre")
    }

    constructor(name:String , edad:Int):this(name){
        println("Nombre $nombre , edad  $edad")
    }
}


fun main() {
    val  person= Person("Rolejio ", 30)
    println(person.toString())
}