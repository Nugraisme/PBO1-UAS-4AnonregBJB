public class hostingAksi {
    public static void main(String[] args) {
        hosting hosting1 = new hosting();
        hosting1.paket = "Paket Basic";
        hosting1.harga = 250.00;
        hosting1.durasi_domain = "1 Hari";

        hosting hosting2 = new hosting();
        hosting2.paket = "Paket Normal";
        hosting2.harga = 1480.00;
        hosting2.durasi_domain = "1 Minggu";

        hosting hosting3 = new hosting();
        hosting3.paket = "Paket Advanced";
        hosting3.harga = 6480.00;
        hosting3.durasi_domain = "1 Bulan";

        hosting hosting4 = new hosting();
        hosting4.paket = "Paket Expert";
        hosting4.harga = 90980.00;
        hosting4.durasi_domain = "1 Tahun";
        System.out.println("List Harga Sewa Domain di Sewajarnyahaja.Com");
        System.out.println("============================================");
        hosting1.info();
        System.out.println("Harga + Pajak : " + (hosting1.harga + (hosting1.harga * 0.15)) );
        System.out.println("============================================");

        hosting2.info();
        System.out.println("Harga + Pajak : " + (hosting2.harga + (hosting2.harga * 0.15)) );
        System.out.println("============================================");

        hosting3.info();
        System.out.println("Harga + Pajak : " + (hosting3.harga + (hosting3.harga * 0.15)) );
        System.out.println("============================================");

        hosting4.info();
        System.out.println("Harga + Pajak : " + (hosting4.harga + (hosting4.harga * 0.15)) );
        System.out.println("============================================");
    }
}
