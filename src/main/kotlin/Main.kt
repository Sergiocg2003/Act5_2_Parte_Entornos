/*
crea un array de 20 elementos y llénalo de número aleatorios (investiga la función para ello). Una vez realizado recorre
dicho array e imprime en pantalla los números que sean pares. Una vez finalizado ordénalo e imprime el último y
primer elemento del array, así como la suma de todos los elementos que contiene el array.
Ahora borra los elementos impares y nuevamente imprime todos los elementos restantes del array.
*/

fun main() {
    val numeros = arrayListOf<Int>()
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    numeros.add((0..20).random())
    println(numeros)


    println("Pares:")
    for (posicion in numeros) {
        if (posicion % 2 == 0) {
            println(posicion)
        }
    }

    val ordenados = numeros.sorted()
    println("Primero")
    println(ordenados.get(0))
    println("Ultimo")
    println(ordenados.get(19))
    println("Suma")
    println(ordenados.sum())

    println("Borrar impares")
    numeros.removeIf {it%2 != 0}
    println(numeros)

}
