package `07Boolean`

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isClose = now < officeOpen || now > officeClosed

    print("Office is close : $isClose")
}