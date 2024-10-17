package week1

fun main() {
    val tugas = 60
    val UTS = 40
    val UAS = 80

    //Hitung rata-rata
    println("============================================================")
    var total = tugas + UTS + UAS
    println("Jumlah nilai : $total")

    val hasil = total / 3
    println("Rata-rata: $hasil")

    //Grade dan status kelulusan
    if (hasil in 75..100) {
        println("Grade:' A' Status: Lulus")
    } else if (hasil in 65..74) {
        println("Grade:' B' Status: Lulus  ")
    } else if (hasil in 55..64) {
        println("Grade:' C' Status: Lulus")
    } else if (hasil in 45..54) {
        println("Grade:' A' Status: Tidak Lulus")
    } else {
        println("Grade:' E' Status: Tidak Lulus")
    }
    println("============================================================")
}
