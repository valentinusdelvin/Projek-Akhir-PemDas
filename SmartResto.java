import java.util.*;
public class SmartResto {
    static int biaya = 0;
    static Scanner braws = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Selamat datang di Itaewon Resto".toUpperCase());
        System.out.println("Daftar layanan");
        homePage();
        braws.close();
    }

    public static void homePage(){
        String[] layanan = {
            "1. Reservasi Tempat", 
            "2. Pesan Makanan", 
            "3. Pesan Minuman", 
            "4. Pembayaran Pesanan"
        };
        
        System.out.println("Silahkan pilih layanan yang anda inginkan");
        for (int i = 0; i<layanan.length; i++){
            System.out.printf("%s\n", layanan[i]);
        }
        while (true) {
            try {
                System.out.println("pilihan yang diinginkan :");
                int pilihanlayanan = braws.nextInt();
                switch (pilihanlayanan) {
                    case 1:
                        reservasi();
                        break;
                    case 2:
                        makanan();
                        break;
                    case 3:
                        minuman();
                    case 4:
                        pembayaran();
                        break;
                    default:
                        System.out.println("Pilihan Tidak Tersedia");
                        homePage();
                        break;
                }
            } 
            catch (InputMismatchException e){
                System.out.println("Pilihan tidak valid");
                braws.nextLine();
            }
        }
    }

    public static void reservasi(){
        System.out.println("List Reservasi");
        String [] jenisTempat = {
            "1. Rame-rame 1 (10-20 orang)           IDR 750.000", 
            "2. Rame-rame 2 (3-10 orang)            IDR 350.000", 
            "3. Berdua (2 orang)                    IDR 65.000", 
            "4. Me Time (1 orang)                   IDR 35.000",
        };
        int [] hargaTempat = {750000, 350000, 65000, 35000};

        for (int i = 0; i < jenisTempat.length; i++){
            System.out.printf("%s\n", jenisTempat[i]);
        }
        while (true) {
            try{
                System.out.print("masukkan pilihan reservasi yang akan dipilih, tekan 0 untuk kembali ke halaman awal\n");
                int pilihan = braws.nextInt();
                if (pilihan == 0){
                    break;
                }
                if (pilihan>0 && pilihan<=jenisTempat.length){
                    biaya += (hargaTempat[pilihan-1]);
                }
                else {
                    System.out.println("Pilihan tidak ada");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Pilihan tidak valid");
                braws.nextLine();
            }
        }
        homePage();
    }

    public static void minuman(){
        String [] jenisMinum = {
            "1. Hot Series",
            "2. Ice Series"
        };
        System.out.println("Jenis Minuman");
        for (int i = 0; i<jenisMinum.length; i++){
            System.out.println(jenisMinum[i]);
        }
        while (true) {
            System.out.print("Masukkan jenis minuman yang akan dipilih, tekan 0 untuk kembali ke halaman awal\n");
            int pilihan = braws.nextInt();
            if (pilihan == 0){
                break;
            }
            if (pilihan>0 && pilihan<=jenisMinum.length){
                switch (pilihan) {
                    case 1:
                        hotSeries();
                        break;
                    case 2:
                        iceSeries();
                        break;
                }
            }
            else {
                System.out.println("Pilihan tidak ada");
            }
        }
        homePage();
    }

    public static void hotSeries(){
        String[] hotDrink ={
            "1. Coffee Latte                                IDR 15.000",
            "2. Cappucino                                   IDR 15.000",
            "3. Americano                                   IDR 12.000",
            "4. Espresso                                    IDR 8.000",
            "5. Hot Chocolate Marshmallow                   IDR 12.000",
            "6. Hot Matcha Latte                            IDR 12.000",
            "7. Hot Lemon Tea                               IDR 8.000",
            "8. Hot Jasmine Tea                             IDR 5.000",
            "9. Wedang Uwuh                                 IDR 8.000",
            "10. Wedang Ronde                               IDR 8.000"
        };
        int [] hotDrinkPrice = {
            15000, 15000, 12000, 8000, 12000, 12000, 8000, 5000, 8000, 8000
        };
        System.out.println("Pilihan Hot Drink Series");
        for (int i = 0; i<hotDrink.length; i++){
            System.out.println(hotDrink[i]);
        }
        while (true) {
            System.out.print("masukkan pilihan minuman yang akan dipilih, tekan 0 untuk kembali ke halaman sebelumnya\n");
            int pilihan = braws.nextInt();
            if (pilihan == 0){
                break;
            }
            if (pilihan>0 && pilihan<=hotDrink.length){
                System.out.println("masukkan jumlahya: ");
                int jumlah = braws.nextInt();
                biaya += (hotDrinkPrice[pilihan-1]*jumlah);
            }
            else {
                System.out.println("Pilihan tidak ada");
            }
        }
        minuman();
    }

    public static void iceSeries(){
        String [] iceSeries = {
            "1. Ice Coffee Latte                            IDR 15.000",
            "2. Caramel Machiatto                           IDR 15.000",
            "3. Ice Americano                               IDR 12.000",
            "4. Hazelnut Latte                              IDR 15.000",
            "5. Brown Sugar Boba Milk Tea                   IDR 15.000",
            "6. Classic Milk Tea                            IDR 12.000",
            "7. Ice Lemon Tea                               IDR 9.000",
            "8. Ice Jasmine Tea                             IDR 6.000",
            "9. Es Dawet                                    IDR 8.000",
            "10. Es Tape Ketan                              IDR 8.000"
        };
        int [] iceSeriesPrice = {
            15000, 15000, 12000, 15000, 15000, 12000, 9000, 6000, 8000, 8000
        };
        System.out.println("Pilihan Ice Drink Series");
        for (int i = 0; i<iceSeries.length; i++){
            System.out.println(iceSeries[i]);
        }
        while (true) {
            System.out.print("masukkan pilihan minuman yang akan dipilih, tekan 0 untuk kembali ke halaman sebelumnya\n");
            int pilihan = braws.nextInt();
            if (pilihan == 0){
                break;
            }
            if (pilihan>0 && pilihan<=iceSeries.length){
                System.out.println("masukkan jumlahya: ");
                int jumlah = braws.nextInt();
                biaya += (iceSeriesPrice[pilihan-1]*jumlah);
            }
            else {
                System.out.println("Pilihan tidak ada");
            }
        }
        minuman();
    }

    public static void makanan(){
        String [] jenisMakan = {
            "1. Appetizer",
            "2. Main Course",
            "3. Dessert"
        };
        System.out.println("Jenis Makanan");
        for (int i = 0; i<jenisMakan.length; i++){
            System.out.println(jenisMakan[i]);
        }
        while (true) {
            System.out.print("masukkan jenis makanan yang akan dipilih, tekan 0 untuk kembali ke halaman awal\n");
            int pilihan = braws.nextInt();
            if (pilihan == 0){
                break;
            }
            if (pilihan>0 && pilihan<=jenisMakan.length){
                switch (pilihan) {
                    case 1:
                        appetizer();
                        break;
                    case 2:
                        mainCourse();
                        break;
                    case 3:
                        dessert();
                        break;
                }
            }
            else {
                System.out.println("Pilihan tidak ada");
            }
        }
        homePage();
    }

    public static void appetizer(){
        String[] foodapps ={
            "1. Kroket ayam (3 pieces)              IDR 10.000",
            "2. Risol Mayo  (3 pieces)              IDR 10.000",
            "3. Batagor                             IDR 15.000",
            "4. Siomay                              IDR 15.000",
            "5. Bakwan (10 pieces)                  IDR 12.000",
            "6. Lumpia ayam (3 pieces)              IDR 10.000"
        };
        int[] appsPrice ={
            10000, 10000, 15000, 15000, 12000, 10000
        };
        System.out.println("Pilihan Appetizer");
        for (int i = 0; i<foodapps.length; i++){
            System.out.println(foodapps[i]);
        }
        while (true) {
            System.out.print("masukkan pilihan makanan yang akan dipilih, tekan 0 untuk kembali ke halaman sebelumnya\n");
            int pilihan = braws.nextInt();
            if (pilihan == 0){
                break;
            }
            if (pilihan>0 && pilihan<=foodapps.length){
                System.out.println("masukkan jumlahya: ");
                int jumlah = braws.nextInt();
                biaya += (appsPrice[pilihan-1]*jumlah);
            }
            else {
                System.out.println("Pilihan tidak ada");
            }
        }
        makanan();
    }

    public static void mainCourse(){
        String[] foodMain ={
            "1. Tongseng Kambing                    IDR 35.000",
            "2. Tengkleng Kambing                   IDR 30.000",
            "3. Sop Kambing                         IDR 30.000",
            "4. Rendang                             IDR 25.000",
            "5. Rawon                               IDR 25.000",
            "6. Soto Ayam                           IDR 20.000",
            "7. Gudeg                               IDR 20.000",
            "8. Ca Kangkung                         IDR 15.000",
            "9. Trancam                             IDR 15.000",
            "10. Gado-Gado                          IDR 15.000"
        };
        int [] mainPrice={
            35000, 30000, 30000, 25000, 25000, 20000, 20000, 15000, 15000, 15000
        };
        System.out.println("Pilihan Main Course");
        for (int i = 0; i<foodMain.length; i++){
            System.out.println(foodMain[i]);
        };
        while (true) {
            System.out.print("masukkan pilihan makanan yang akan dipilih, tekan 0 untuk kembali ke halaman sebelumnya\n");
            int pilihan = braws.nextInt();
            if (pilihan == 0){
                break;
            }
            if (pilihan>0 && pilihan<=foodMain.length){
                System.out.println("masukkan jumlahya: ");
                int jumlah = braws.nextInt();
                biaya += (mainPrice[pilihan-1]*jumlah);
            }
            else {
                System.out.println("Pilihan tidak ada");
            }
        }
        makanan();
    }

    public static void dessert(){
        String[] foodDessert={
            "1. Klepon                              IDR 8.000",
            "2. Kue Putu                            IDR 15.000",
            "3. Bika Ambon                          IDR 15.000",
            "4. Bubur Sumsum                        IDR 10.000",
            "5. Srabi                               IDR 15.000",
            "6. Es Krim Pandan                      IDR 5.000"
        };
        int [] dessertPrice ={
            8000, 15000, 15000, 10000, 15000, 5000
        };
        System.out.println("Pilihan Main Course");
        for (int i = 0; i<foodDessert.length; i++){
            System.out.println(foodDessert[i]);
        };
        while (true) {
            System.out.print("masukkan pilihan makanan yang akan dipilih, tekan 0 untuk kembali ke halaman sebelumnya\n");
            int pilihan = braws.nextInt();
            if (pilihan == 0){
                break;
            }
            if (pilihan>0 && pilihan<=foodDessert.length){
                System.out.println("masukkan jumlahya: ");
                int jumlah = braws.nextInt();
                biaya += (dessertPrice[pilihan-1]*jumlah);
            }
            else {
                System.out.println("Pilihan tidak ada");
            }
        }
        makanan();
    }

    public static void pembayaran(){
        System.out.printf("Biaya yang harus anda bayar adalah %d rupiah, masukkan nominal uang pembayaran anda\n", biaya);
        int uangBayar = braws.nextInt();
        while (uangBayar<biaya){
            System.out.printf("Uang yang dimasukkan kurang %d. Masukkan uang lagi:\n", biaya-uangBayar);
            uangBayar += braws.nextInt();
        }

        if (uangBayar>biaya){
            System.out.printf("Kembalian: %d\n", uangBayar-biaya);
        }
        System.out.println("TERIMA KASIH TELAH BERBELANJA DI ITAEWON RESTO");
        biaya = 0;
        System.exit(0);
    }
}
