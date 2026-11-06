// Ho ten: Nguyễn Phạm Minh Trí - MSSV: 25810069
fun main() {
    val canNang = 83.0
    val chieuCao = 1.68

    val bmi = canNang / (chieuCao * chieuCao)

    println("Chi so BMI: $bmi")

    if (bmi < 18.5) {
        println("Phan loai: Gay")
    } else if (bmi < 25) {
        println("Phan loai: Binh thuong")
    } else if (bmi < 30) {
        println("Phan loai: Thua can")
    } else {
        println("Phan loai: Beo phi")
    }
}
