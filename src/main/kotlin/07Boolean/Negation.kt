package `07Boolean`

fun main() {
    val officeOpen = 7
    val now = readln().toInt()
    val isOpen = now > officeOpen

    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}