import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Batas deret (n) : ");
        int n = in.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        // Versi for (pencacah: a)
        System.out.print("for      :");
        for (int a = 1; a <= n; a++) {
            System.out.print(" " + a);
        }
        System.out.println();

        // Versi while (pencacah: b)
        System.out.print("while    :");
        int b = 1;
        while (b <= n) {
            System.out.print(" " + b);
            b++;
        }
        System.out.println();

        // Versi do-while (pencacah: c)
        System.out.print("do-while :");
        int c = 1;
        do {
            System.out.print(" " + c);
            c++;
        } while (c <= n);
        System.out.println();

        // Bukti meleset satu (off-by-one): dua penghitung terpisah
        System.out.println();
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }
        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // Saring deret 1-10: lewati genap (continue), berhenti kalau i > 7 (break)
        int tercetak = 0;
        System.out.print("Disaring :");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i > 7) {
                break;
            }
            System.out.print(" " + i);
            tercetak++;
        }
        System.out.println();
        System.out.println("Sampai println  : " + tercetak + " kali");
    }
}