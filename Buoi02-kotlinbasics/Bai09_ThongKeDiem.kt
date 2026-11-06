// Ho ten: Nguyễn Phạm Minh Trí - MSSV: 25810069
fun main() {

    val diem = arrayOf(
        8.0, 7.0, 9.0, 6.0, 10.0,
        5.0, 8.0, 7.0, 9.0, 6.0
    )

    var tong = 0.0
    var diemCaoNhat = diem[0]
    var diemThapNhat = diem[0]

    for (i in diem.indices) {

        tong += diem[i]

        if (diem[i] > diemCaoNhat) {
            diemCaoNhat = diem[i]
        }

        if (diem[i] < diemThapNhat) {
            diemThapNhat = diem[i]
        }
    }

    val diemTrungBinh = tong / diem.size

    println("Diem trung binh: $diemTrungBinh")
    println("Diem cao nhat: $diemCaoNhat")
    println("Diem thap nhat: $diemThapNhat")
}
