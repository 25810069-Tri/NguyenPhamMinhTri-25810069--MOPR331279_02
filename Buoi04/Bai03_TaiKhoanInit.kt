// Họ tên: Nguyễn Phạm Minh Trí - MSSV: 25810069

class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        // Kiểm tra điều kiện bắt buộc thực hiện trong khối init
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tao tai khoan $soTaiKhoan thanh cong voi so du ban dau: $soDu")
        }
    }
}

fun main() {
    println("--- Tao tai khoan voi so du hop le ---")
    val tk1 = TaiKhoanNganHang("TK001", 5000000.0)

    println("\n--- Tao tai khoan voi so du am ---")
    val tk2 = TaiKhoanNganHang("TK002", -1000000.0)
}
