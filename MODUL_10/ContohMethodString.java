public class ContohMethodString{
    String sambutPengguna(String nama){
        return "Hai, " + nama + " ! Bagaimana kabar anda?";
    }

    public static void main(String[] args) {
        ContohMethodString app = new ContohMethodString();

        String pesan = app.sambutPengguna("Farel");
        System.out.print(pesan);
    }
}