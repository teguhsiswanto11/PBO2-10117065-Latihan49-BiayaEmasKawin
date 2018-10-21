public class EmasKawin {
    private double berat;
    private double hargaPerGram;

    public double getBerat() {
        return berat;
    }

    public double getHargaPerGram() {
        return hargaPerGram;
    }

    public EmasKawin(double berat, double hargaPerGram) {
        this.berat = berat;
        this.hargaPerGram = hargaPerGram;
    }

    public double hitungBiaya() {return berat*hargaPerGram;}

//     maksimal nilai input -> 2.147.483.647 (untuk tipedata Integer)
    public String terbilang(double i) {
        int j = (int) i;
        String[] angka = {" ","satu ","dua ","tiga ","empat ","lima ","enam ","tujuh ","delapan ","sembilan ","sepuluh ","sebelas "};
        if (j < 12) {return angka[j]; }
        else if (j < 20) {return angka[j - 10]+"belas ";}
        else if (j < 100) {return angka[j / 10]+"puluh "+terbilang(j % 10);}
        else if (j < 200) {return "seratus "+terbilang(i - 100);}
        else if (j < 1000) {return angka[j / 100]+"ratus "+terbilang(j % 100);}
        else if (j < 2000) {return "seribu "+terbilang(i - 1000);}
        else if (j < 1000000) {return terbilang(j / 1000)+"ribu "+terbilang(j % 1000);}
        else if (j < 1000000000) {return terbilang(j / 1000000)+"juta "+terbilang(j % 1000000);}
        else if (j <= 2147483647) {return terbilang(j / 1000000000)+"miliar "+terbilang(j % 1000000000);}
    return angka[j];}

}
