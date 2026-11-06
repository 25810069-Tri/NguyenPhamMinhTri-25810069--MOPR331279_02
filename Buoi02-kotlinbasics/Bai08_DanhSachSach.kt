// Ho ten: Nguyễn Phạm Minh Trí - MSSV: 25810069
fun main() {

    val danhSachSach = mutableListOf(
        "Lap trinh Kotlin",
        "Lap trinh Java",
        "Co so du lieu",
        "Lap trinh C++",
        "Android co ban"
    )

    println("Danh sach ban dau:")
    println(danhSachSach)

    // Them sach
    danhSachSach.add("Python co ban")
    danhSachSach.add("Lap trinh Web")

    // Xoa sach
    danhSachSach.remove("Lap trinh Java")

    // Sap xep
    danhSachSach.sort()

    println("Danh sach sau khi xu ly:")
    println(danhSachSach)
}
