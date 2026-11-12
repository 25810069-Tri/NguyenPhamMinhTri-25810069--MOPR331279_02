// Họ tên: Nguyễn Phạm Minh Trí - MSSV: 25810069

// Extension function đếm số lượng nguyên âm (a, e, i, o, u) không phân biệt hoa thường cho String
fun String.demNguyenAm(): Int {
    val nguyenAm = setOf('a', 'e', 'i', 'o', 'u')
    return this.count { it.lowercaseChar() in nguyenAm }
}

// Extension function kiểm tra số nguyên tố cho Int
fun Int.laSoNguyenTo(): Boolean {
    if (this < 2) return false
    for (i in 2..Math.sqrt(this.toDouble()).toInt()) {
        if (this % i == 0) return false
    }
    return true
}

fun main() {
    println("--- Kiem tra Extension Function String.demNguyenAm() ---")
    val str1 = "Kotlin Programming"
    val str2 = "HELLO WORLD"
    val str3 = "Lap trinh di dong"

    println("\"$str1\" co so nguyen am la: ${str1.demNguyenAm()}")
    println("\"$str2\" co so nguyen am la: ${str2.demNguyenAm()}")
    println("\"$str3\" co so nguyen am la: ${str3.demNguyenAm()}")

    println("\n--- Kiem tra Extension Function Int.laSoNguyenTo() ---")
    val num1 = 7
    val num2 = 12
    val num3 = 19
    val num4 = 1

    println("$num1 co phai la so nguyen to khong? ${num1.laSoNguyenTo()}")
    println("$num2 co phai la so nguyen to khong? ${num2.laSoNguyenTo()}")
    println("$num3 co phai la so nguyen to khong? ${num3.laSoNguyenTo()}")
    println("$num4 co phai la so nguyen to khong? ${num4.laSoNguyenTo()}")
}
