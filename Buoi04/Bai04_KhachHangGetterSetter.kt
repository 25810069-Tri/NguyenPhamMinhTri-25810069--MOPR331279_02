// Họ tên: Nguyễn Phạm Minh Trí - MSSV: 25810069

class KhachHang(
    var ho: String,
    var ten: String
) {
    // Thuộc tính hoTen khai báo var với custom getter và custom setter
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val parts = value.trim().split(" ", limit = 2)
            if (parts.size >= 2) {
                ho = parts[0]
                ten = parts[1]
            } else if (parts.size == 1) {
                ho = ""
                ten = parts[0]
            }
        }
}

fun main() {
    val kh = KhachHang("Nguyen", "An")
    println("--- Thong tin ban dau ---")
    println("Ho: ${kh.ho}")
    println("Ten: ${kh.ten}")
    println("Ho va Ten (getter): ${kh.hoTen}")

    // Sau khi đổi giá trị ten, in lại hoTen để kiểm tra kết quả luôn được ghép từ giá trị mới nhất
    kh.ten = "Binh"
    println("\n--- Sau khi doi ten thanh 'Binh' ---")
    println("Ho: ${kh.ho}")
    println("Ten: ${kh.ten}")
    println("Ho va Ten (getter): ${kh.hoTen}")

    // Gán hoTen bằng một chuỗi họ tên mới, sau đó in lại ho và ten để kiểm tra đã được tách đúng
    kh.hoTen = "Tran Cuong"
    println("\n--- Sau khi gan hoTen = 'Tran Cuong' (qua setter) ---")
    println("Ho: ${kh.ho}")
    println("Ten: ${kh.ten}")
    println("Ho va Ten (getter): ${kh.hoTen}")
}
