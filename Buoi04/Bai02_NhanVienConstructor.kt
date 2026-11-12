// Họ tên: Nguyễn Phạm Minh Trí - MSSV: 25810069

class NhanVien(
    maNhanVien: String,
    val ten: String,
    var luongThang: Double
) {
    // Constructor phụ chỉ nhận vào ten, gọi tới constructor chính bằng từ khóa this
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    // Tạo object bằng constructor chính (3 tham số)
    val nv1 = NhanVien("NV001", "Nguyen Van An", 15000000.0)

    // Tạo object bằng constructor phụ (1 tham số)
    val nv2 = NhanVien("Tran Thi Binh")

    // nv1.maNhanVien // Lỗi biên dịch: Vì 'maNhanVien' không được khai báo với 'val' hay 'var' trong constructor chính nên nó chỉ là tham số hàm khởi tạo, không phải là thuộc tính (property) của class, do đó không thể truy cập từ bên ngoài qua dấu chấm.

    // In ten va luongThang cua ca hai nhan vien
    println("--- Thong tin nhan vien 1 ---")
    println("Ten: ${nv1.ten}")
    println("Luong thang: ${nv1.luongThang}")

    println("\n--- Thong tin nhan vien 2 ---")
    println("Ten: ${nv2.ten}")
    println("Luong thang: ${nv2.luongThang}")
}
