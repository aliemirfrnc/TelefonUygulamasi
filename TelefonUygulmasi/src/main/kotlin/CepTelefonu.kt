class CepTelefonu (var kendiNumaram : String) {
    companion object {
        var kisiler: ArrayList<Kisi> = ArrayList()


        fun kisiEkle(kisi: Kisi) {
            if (kisiler.any { it.isim == kisi.isim && it.telNo == kisi.telNo }) {
                println("Kişi zaten var!")
                return
            }
            kisiler.add(kisi)

        }

        fun kisileriListele() {
            println("----------Kişiler----------\n")
            kisiler.forEach { println("Ad:"+it.isim+"\nTelefon:"+it.telNo+"\n") }
            println()
        }

        fun kisiSorgula(isim: String){
            var kisi = kisiler.find { it.isim == isim } ?:return
            if (kisi != null) {
                println("Kişi bulundu:")
                println("İsim: ${kisi.isim}")
                println("Numara: ${kisi.telNo}")
            } else {
                println("Kişi bulunamadı.")
            }
        }

        fun kisiyiGüncelle(isim: String, telNo: Int) {
            var kisi = kisiler.find { it.isim == isim } ?: return
            kisi.telNo = telNo

        }

        fun kisiyiSil(isim: String) {
            var kisi = kisiler.find { it.isim == isim } ?: return
            kisiler.remove(kisi)
        }

    }
}