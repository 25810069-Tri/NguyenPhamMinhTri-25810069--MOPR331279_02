// Họ tên: Nguyễn Phạm Minh Trí - MSSV: 25810069

class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    // Object thu nhat truyen du ca ba gia tri theo dung thu tu
    val sp1 = SanPham("Dien thoai Samsung Galaxy", 12500000.0, 15)

    // Object thu hai chi truyen hai tham so bat buoc bang named argument, soLuongTonKho lay mac dinh la 0
    val sp2 = SanPham(tenSanPham = "Tai nghe Bluetooth", gia = 450000.0)

    // In thong tin tung object bang cach truy cap tung thuoc tinh qua dau cham
    println("--- Thong tin San pham 1 ---")
    println("Ten san pham: " + sp1.tenSanPham)
    println("Gia: " + sp1.gia)
    println("So luong ton kho: " + sp1.soLuongTonKho)

    println("\n--- Thong tin San pham 2 ---")
    println("Ten san pham: " + sp2.tenSanPham)
    println("Gia: " + sp2.gia)
    println("So luong ton kho: " + sp2.soLuongTonKho)
}
