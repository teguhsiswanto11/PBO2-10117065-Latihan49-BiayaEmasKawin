/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program : Menghitung biaya beli emas berdasarkan berat dan harga emas per gram
 *
 */
public class Main {
    public static void main(String[] args) {
        EmasKawin em = new EmasKawin(15.7,570000);
        System.out.println("Harga 1 gram per Oktober : Rp."+em.getHargaPerGram());
        System.out.println("Berat emas : "+em.getBerat()+" gram");
        System.out.println("\nTotal Biaya : Rp."+em.hitungBiaya());
        System.out.println("("+em.terbilang(em.hitungBiaya())+"rupiah )");
    }
}
