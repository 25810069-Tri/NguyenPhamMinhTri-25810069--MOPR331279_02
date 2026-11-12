// Họ tên: Nguyễn Phạm Minh Trí - MSSV: 25810069

// Abstract class PhuongTienDiChuyen
abstract class PhuongTienDiChuyen {
    // Thuộc tính abstract tocDoToiDa
    abstract val tocDoToiDa: Int

    // Hàm không abstract moTa() in ra câu mô tả có sử dụng tocDoToiDa
    fun moTa() {
        println("Phuong tien nay co toc do toi da la $tocDoToiDa km/h.")
    }
}

// Class con XeMay kế thừa PhuongTienDiChuyen, override lại tocDoToiDa
class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 90
}

// Class con OTo kế thừa PhuongTienDiChuyen, override lại tocDoToiDa
class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 180
}

fun main() {
    // Tạo object của mỗi class con
    val xeMay = XeMay()
    val oTo = OTo()

    // Gọi hàm moTa() trên từng object
    println("--- Mo ta Phuong tien Xe May ---")
    xeMay.moTa()

    println("\n--- Mo ta Phuong tien O To ---")
    oTo.moTa()
}
