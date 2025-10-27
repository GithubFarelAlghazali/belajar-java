// Muhammad Farel Alghazali
// 109092500033

public class Kasir {
    public static void main(String[] args){
        String pelanggan,makanan,minuman;
        int hargaMakan, hargaMinum, hargaAwal;
        double pajak, hargaAkhir;

        pelanggan = "Muhammad Farel Alghazali";
        makanan = "Nasi Goreng Spesial";
        minuman = "Es Kopi Susu";
        hargaMakan = 28000;
        hargaMinum = 18000;

        hargaAwal = hargaMinum + hargaMakan;
        pajak = hargaAwal * 0.11;
        hargaAkhir= hargaAwal + pajak;
        System.out.println("========= STRUK PEMBAYARAN =========");
        System.out.println("Nama Pelanggan: " + pelanggan);
        System.out.println("Detail Pembelian:");
        System.out.println("- " + makanan + " : Rp" + hargaMakan);
        System.out.println("- " + minuman + " : Rp " + hargaMinum);
        System.out.println("------------------------------------");
        System.out.println("Total tagihan : Rp " + hargaAwal);
        System.out.println("Pajak(11%) : Rp " + pajak);
        System.out.println("------------------------------------ +");
        System.out.println("Total Bayar : Rp " + hargaAkhir);
        System.out.println("Terimakasih atas kunjungan Anda!");
    }
}