import java.text.DecimalFormat

fun formattedDivision(num1: Double, num2: Double): String {
    val value = num1 / num2
    val decimalFormat = DecimalFormat("#,###,##0.0000")
    return decimalFormat.format(value)
}