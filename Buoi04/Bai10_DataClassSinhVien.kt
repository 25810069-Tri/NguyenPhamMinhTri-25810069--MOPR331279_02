// Họ tên: Nguyễn Phạm Minh Trí - MSSV: 25810069

// Khai báo bằng từ khóa data trước class
data class SinhVien(
    val mssv: String,
    val hoTen: String,
    val diemTrungBinh: Double
)

fun main() {
    // Tạo hai object có cùng giá trị cho cả ba thuộc tính
    val sv1 = SinhVien("25810069", "Nguyen Pham Minh Tri", 8.5)
    val sv2 = SinhVien("25810069", "Nguyen Pham Minh Tri", 8.5)

    // In object thứ nhất để xem toString() tự sinh
    println("--- In object sv1 (toString tu sinh) ---")
    println(sv1)

    // So sánh hai object bằng toán tử == để kiểm tra equals() tự sinh (trả về true)
    println("\n--- So sanh sv1 == sv2 (equals tu sinh) ---")
    val soSanh = (sv1 == sv2)
    println("sv1 == sv2: $soSanh")

    // Dùng copy() từ sv1 để tạo ra object mới chỉ đổi diemTrungBinh, giữ nguyên mssv và hoTen
    val sv3 = sv1.copy(diemTrungBinh = 9.2)

    // In object tạo ra từ copy() để kiểm tra
    println("\n--- Object sv3 tao ra tu copy() ---")
    println(sv3)
    println("Kiem tra: mssv = ${sv3.mssv}, hoTen = ${sv3.hoTen}, diemTrungBinh = ${sv3.diemTrungBinh}")
}
