// Ho ten: Nguyễn Phạm Minh Trí - MSSV: 25810069
fun main() {

    var tenKhachHang: String? = null

    // 1. Safe Call
    val doDai = tenKhachHang?.length
    println("Do dai ten: $doDai")

    // 2. Elvis
    val tenHienThi = tenKhachHang ?: "Khach vang lai"
    println("Ten khach hang: $tenHienThi")

    // 3. Toan tu !!
    tenKhachHang = "Nguyen Van A"

    // Chi dung !! khi chac chan bien khong null.
    // Neu bien la null, chuong trinh se bi loi khi chay.
    val tenBatBuoc = tenKhachHang!!
    println("Ten: $tenBatBuoc")
}