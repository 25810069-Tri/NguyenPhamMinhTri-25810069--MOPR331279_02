// Ho ten: Nguyễn Phạm Minh Trí - MSSV: 25810069
fun main() {
    val diem = 7.5

    val xepLoai = when (diem) {
        in 8.5..10.0 -> "Xuat sac"
        in 8.0..8.49 -> "Gioi"
        in 6.5..7.99 -> "Kha"
        in 5.0..6.49 -> "Trung binh"
        in 0.0..4.99 -> "Yeu"
        else -> "Diem khong hop le"
    }

    println("Diem trung binh: $diem")
    println("Xep loai: $xepLoai")
}
