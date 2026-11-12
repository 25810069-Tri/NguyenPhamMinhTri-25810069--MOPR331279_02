// Họ tên: Nguyễn Phạm Minh Trí - MSSV: 25810069

// Interface không có phần thân cho hàm tinhDienTich()
interface CoTheTinhDienTich {
    fun tinhDienTich(): Double
}

// Class HinhVuong implement interface CoTheTinhDienTich
class HinhVuong(val canh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return canh * canh
    }
}

// Class HinhTron implement interface CoTheTinhDienTich
class HinhTron(val banKinh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return Math.PI * banKinh * banKinh
    }
}

fun main() {
    // Tạo một object cho mỗi class
    val hinhVuong = HinhVuong(5.0)
    val hinhTron = HinhTron(3.0)

    // Gọi tinhDienTich() và in kết quả ra màn hình
    println("--- Tinh dien tich cac hinh ---")
    println("Dien tich hinh vuong (canh = ${hinhVuong.canh}): ${hinhVuong.tinhDienTich()}")
    println("Dien tich hinh tron (ban kinh = ${hinhTron.banKinh}): ${hinhTron.tinhDienTich()}")
}
