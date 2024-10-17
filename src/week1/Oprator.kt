package week1

fun main() {
    //Operator Aritmatika
    val plus = 4 + 4
    val minus = 5 - 4
    val kali = 6 * 5
    val bagi = 6 / 2
    val modulus = 6 % 6

    val result = "$plus $minus $kali $bagi $modulus"
   println(result)

    //Operator perbandingan
    val a = 10
    val b = 5

    val lebihdari = a > b
    val kurangdari = a < b
    val lebihdariSamadegan = a >= b
    val kurangdariSamadengan = a <= b
    val samadengan = a == b
    val tidakSamadengan = a != b

//    println(lebihdari)


    //Operator logika

    // and = dua stetmen harus true (konjungsi)
    val and = 10 > 10 && 12 > 11

    // or = salah satu  dari 2 stetmen harus true (disjungsi)
    val or = 10 > 10 || 12 > 11

    // negasi / kebalikan
    val negasi = !true
    println(negasi)
}