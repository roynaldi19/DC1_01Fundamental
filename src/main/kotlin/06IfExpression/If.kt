package `06IfExpression`

fun main() {
    val openHours = 7
    val now = readln().toInt()
    val office = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }
    print(office)
}