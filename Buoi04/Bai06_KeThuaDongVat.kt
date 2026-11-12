// Họ tên: Nguyễn Phạm Minh Trí - MSSV: 25810069

// Class cha DongVat và hàm keu() được đánh dấu open
open class DongVat(val ten: String) {
    open fun keu(): String {
        return "Dong vat dang phat ra am thanh"
    }
}

// Class con Cho kế thừa DongVat, override lại hàm keu()
class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gau gau"
    }
}

// Class con Meo kế thừa DongVat, override lại hàm keu()
class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo"
    }
}

fun main() {
    // Tạo danh sách chứa cả object Cho và Meo
    val danhSachDongVat: List<DongVat> = listOf(
        Cho("Cho Vang"),
        Meo("Meo Muop"),
        Cho("Cho Husky"),
        Meo("Meo Tam The")
    )

    // Dùng vòng lặp for để in ra ten và kết quả gọi keu() của từng con vật
    println("--- Danh sach tieng keu cua dong vat ---")
    for (dongVat in danhSachDongVat) {
        println("${dongVat.ten} keu: ${dongVat.keu()}")
    }
}
