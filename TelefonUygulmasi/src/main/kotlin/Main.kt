
import CepTelefonu.Companion.kisiEkle
import CepTelefonu.Companion.kisiSorgula
import CepTelefonu.Companion.kisiler
import CepTelefonu.Companion.kisileriListele
import CepTelefonu.Companion.kisiyiGüncelle
import CepTelefonu.Companion.kisiyiSil
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    while (true) {
        anaMenu();
        print("Seçiminizi Yapınız:")
        var menuSecim = readLine()!!.toInt()

        when (menuSecim) {
            0 -> {
                println("Çıkış Yapılıyor")
                exitProcess(0)
            }

            1 -> {
                kisileriListele()
            }

            2 -> {
                println("\nKişi adını girin: ")
                val isim = readLine()!!
                print("Kişi numarasını girin: ")
                val telNo = readLine()!!.toInt()
                kisiEkle(Kisi(isim,telNo))
                print("----------Kişi Eklenmiştir----------\n")
                kisileriListele()
            }
            3->{
                print("Lütfen Sorgulamak istediğiniz kişinin adını girin:")
                val isim = readLine()!!
                kisiSorgula(isim)
            }
            4->{
                println("Silmek istediğiniz Kişinin adını girin: ")
                val isim = readLine()!!
                kisiyiSil(isim)
                print("----------Kişi Silinmiştir----------\n")
                kisileriListele()
            }
            5->{
                println("Kişi adını girin: ")
                val isim = readLine()!!
                println("Kişi numarasını girin: ")
                val telNo = readLine()!!.toInt()
                kisiyiGüncelle(isim, telNo)
                print("----------Kişi Güncellenmiştir----------\n")
                kisileriListele()
            }
        }
    }
}

fun anaMenu(){
    println("**********MENÜ**********")
    println("0-Çıkış")
    println("1-Kişileri Listele")
    println("2-Yeni Kişi Ekle")
    println("3-Kişi Sorgula")
    println("4-Kişi Sil")
    println("5-Kişi Güncelle")
}