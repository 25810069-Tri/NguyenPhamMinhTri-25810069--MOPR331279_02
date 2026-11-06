// Ho ten: Nguyễn Phạm Minh Trí - MSSV: 25810069

fun main() {
    val soLuong: Int = 3
    val donGia: Double = 100000.0

    val tienHang = soLuong.toDouble() * donGia
    val tienThue = tienHang * 0.08
    val tongTien = tienHang + tienThue

    println("Tien hang: $tienHang VND")
    println("Tien thue: $tienThue VND")
    println("Tong tien: $tongTien VND")
}