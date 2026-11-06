// Ho ten: Nguyễn Phạm Minh Trí - MSSV: 25810069git add Buoi02-kotlinbasics
fun main() {
    var a = 0
    var b = 1
    var viTri = 0

    for (i in 1..20) {
        if (a >= 100) {
            break
        }

        println("Vi tri $viTri: $a")

        val soTiepTheo = a + b
        a = b
        b = soTiepTheo

        viTri++
    }
}
