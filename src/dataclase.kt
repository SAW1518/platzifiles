data class Auto(var macrca: String, private  var pertas: Int) {
    var numPuertas = pertas
        get () {
            return if (field > 0) field else 1
        }
}

data class Persona(var nombre: String, val age: Int, val color: String)

fun main() {
    val auto = Auto("Ford",3)
    println(auto.numPuertas)

    var marca = auto.macrca

    auto.macrca = "Chevy"

    auto.hashCode()
    println(auto.toString())

    val mavel = Persona("mavel ", 24, "cafe ")
    val mala = mavel.copy("marla")
    println(mavel)
    println(mala)
    println("----------------------")
    val darla = mala
    darla.nombre = "Darla"

    println(mavel)
    println(mala)
    println(darla)


}