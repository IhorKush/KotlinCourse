package lesson_2

fun main() {
    println("How many candies did you eat:")
    val candies = readln().toInt()

    println("How many steps did you walk:")
    val steps = readln().toInt()

    val caloriesPerCandy = 60
    val caloriesPerStep = 0.032

    val caloriesEaten = candies * caloriesPerCandy
    val caloriesBurnt = steps * caloriesPerStep

    if (caloriesEaten <= caloriesBurnt) {
        println("Well done!")
    } else {
        val reminingCalories = caloriesEaten - caloriesBurnt
        val reminingSteps = reminingCalories / caloriesPerStep
        println("Oops, you need to walk $reminingSteps steps if you want to burn all calories.")
    }

}