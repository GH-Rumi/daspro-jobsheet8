import java.util.Scanner;
public class tugas111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai angka = ");
        int angka = sc.nextInt();

        if (angka > 2) {
        for(int iOuter=1; iOuter<=angka; iOuter++) {
        for(int i=1; i<=angka; i++) {
            if (iOuter>1 && iOuter<angka && i>1 && i<angka) {
            System.out.print("  ");
        } else {
        System.out.print(" " + angka);
        }
        }
        System.out.println();
        }
    }  
    else {
        System.out.print("Masukkan input yang valid (minimal 3)");
    }
} 
}