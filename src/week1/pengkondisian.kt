package week1

fun main() {
    val nilai = 20

    //if else standart
    if (nilai > 60){
        println("Lulus")
    }else{
        println("Tidak lulus")
    }

    // if di dalam if
    if (nilai > 70 ){
        println('A')
    }else if (nilai > 60){
        println('B')
    }else{
        println('C')

        //when expresion
        val number = 5
        val hasil = when (number){
            1 -> "satu"
            2 -> "dua"
            3 -> "tiga"
            else -> "gagal"
        }
        println(hasil)
    }
}