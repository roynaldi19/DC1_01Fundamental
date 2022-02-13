package `07Boolean`

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 13

    val isOpen = now >= officeOpen && now <= officeClosed

    print("Office is open : $isOpen")

}