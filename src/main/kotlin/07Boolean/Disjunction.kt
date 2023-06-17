package `07Boolean`

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = readln().toInt()

    val isClose = now < officeOpen || now > officeClosed

    print("Office is close : $isClose")
}