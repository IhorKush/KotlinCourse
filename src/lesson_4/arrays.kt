package lesson_4

fun main() {
    var list = arrayOf(10, 20, 30, 40, 50)
    var names = arrayOf("Ihor", "Roman", "Vitalii")
    println(list[2])

    println()

    println(names[1])
    names[2] = "Volodymyr"
    println(names[2])

    println()

    println(list.size)

    println()

    for (i in names) {
        println("$i ")
    }

    println()

    list.forEach { i ->
        if (i > 20) println("The number is greater than 20")
        else println("The number is less or equal to 20")
    }

    println()

    names.forEachIndexed { index, element ->
        println("$element has index $index")
    }
}