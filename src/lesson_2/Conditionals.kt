package lesson_2

fun main() {

    val age = 40
    val login = "kush"
    var pass = 12345

    if ((age in (18..40)) && (login == "kush") && (pass == 12345)) {
        print("Welcome to the Party!")
    } else {
        print("Sorry, your data is incorrect.")
    }

}