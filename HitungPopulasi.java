public class HitungPopulasi{
    public static void  main(String[] args){
        int populasi_awal = 312032486;
        int kelahiran,kematian,imigran;
        int total_detik = 5 * 365 * 24 * 60 * 60;

        kelahiran = total_detik / 7;
        kematian = total_detik / 13;
        imigran = total_detik / 45;

        int populasi_akhir = populasi_awal + kelahiran - kematian + imigran;

        System.out.println(populasi_akhir);
    }
}