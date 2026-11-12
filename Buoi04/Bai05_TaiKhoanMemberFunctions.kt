// Họ tên: Nguyễn Phạm Minh Trí - MSSV: 25810069

class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tao tai khoan $soTaiKhoan thanh cong voi so du ban dau: $soDu")
        }
    }

    // Hàm thành viên nạp tiền: cộng thêm soTien vào soDu
    fun napTien(soTien: Double) {
        if (soTien > 0) {
            soDu += soTien
            println("Nap thanh cong: +$soTien VND")
        } else {
            println("So tien nap khong hop le")
        }
    }

    // Hàm thành viên rút tiền: kiểm tra điều kiện đủ số dư trước khi trừ tiền
    fun rutTien(soTien: Double): Boolean {
        return if (soTien > 0 && soDu >= soTien) {
            soDu -= soTien
            println("Rut thanh cong: -$soTien VND")
            true
        } else {
            println("Rut tien that bai: so du khong du hoac so tien khong hop le")
            false
        }
    }
}

fun main() {
    val tk = TaiKhoanNganHang("TK8888", 1000000.0)
    println("So du hien tai: ${tk.soDu} VND\n")

    // Lần 1: Nạp 500,000 VND
    println("--- Lan 1: Nap 500,000 VND ---")
    tk.napTien(500000.0)
    println("So du sau khi nap: ${tk.soDu} VND\n")

    // Lần 2: Rút 300,000 VND (hợp lệ)
    println("--- Lan 2: Rut 300,000 VND ---")
    val ketQua1 = tk.rutTien(300000.0)
    println("Ket qua rut tien: $ketQua1")
    println("So du sau khi rut: ${tk.soDu} VND\n")

    // Lần 3: Rút 2,000,000 VND (vượt quá số dư)
    println("--- Lan 3: Rut 2,000,000 VND (qua so du) ---")
    val ketQua2 = tk.rutTien(2000000.0)
    println("Ket qua rut tien: $ketQua2")
    println("So du sau khi rut: ${tk.soDu} VND")
}
