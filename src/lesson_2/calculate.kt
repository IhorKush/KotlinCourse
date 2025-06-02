package lesson_2

fun main() {
    println("Enter the first number: ")
    val num1 = readln().toInt()

    println("Enter the operator (+,-,*,/): ")
    val op = readln()

    println("Enter the second number: ")
    val num2 = readln().toInt()

    val result = when (op) {
        "+" -> {
            num1 + num2
        }

        "-" -> {
            num1 - num2
        }

        "*" -> {
            num1 * num2
        }

        "/" -> {
            num1 / num2
        }

        else -> {
            return
        }
    }
    println("Result: $result")
}