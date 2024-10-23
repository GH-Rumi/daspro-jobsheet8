import java.util.Scanner;
public class Porseni11 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        String jumlahPemainBadminton = "", jumlahPemainTenismeja = "", jumlahPemainBasket = "", jumlahPemainVolly = "", namaPoliteknik;

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlah = sc.nextInt();
        int politeknik = 1;
        String sampah = sc.nextLine();

        do {
        System.out.print("Masukkan nama politeknik yang ke-" + politeknik + ": ");
        namaPoliteknik = sc.nextLine();
        System.out.println();
        System.out.println("Badminton");
        int i = 1;    
        do {
            System.out.print("Nama atlet ke-" + i + ": ");
            String namaBadminton = sc.nextLine();
            jumlahPemainBadminton += " " + namaBadminton + ",";
            i++;
        } while (i <= 5);
        System.out.println();
        System.out.println("Tenis meja");
        int j = 1;
        do {
            System.out.print("Nama atlet ke-" + j + ": ");
            String namaTenisMeja = sc.nextLine();
            jumlahPemainTenismeja += " " + namaTenisMeja + ",";
            j++;
        } while (j <= 5);
        System.out.println();
        System.out.println("Basket");
        int k = 1;
        do {
            System.out.print("Nama atlet ke-" + k + ": ");
            String namaBasket = sc.nextLine();
            jumlahPemainBasket += " " + namaBasket + ",";
            k++;
        } while (k <= 5);
        System.out.println();
        System.out.println("Bola Voly");
        int l = 1;
        do {
            System.out.print("Nama atlet ke-" + l + ": ");
            String namaVoly = sc.nextLine();
            jumlahPemainVolly += " " + namaVoly + ",";
            l++;
        } while (l <= 5);
        politeknik++;
        } while (politeknik <= jumlah);

        System.out.println();
        System.out.println("Atlet Badminton: " + jumlahPemainBadminton);
        System.out.println("Atlet Tenis Meja: " + jumlahPemainTenismeja);
        System.out.println("Atlet Basket: " + jumlahPemainBasket);
        System.out.println("Atlet Bola Voly: " + jumlahPemainVolly);
        sc.close();
    }
}