package `05Function`

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String){
    println("Your name is $name")
}

fun main() {
    val user = setUser("Roynaldi", 30)
    println(user)

    printUser("Roynaldi")
}

