
import java.util.Scanner;

public class soal1Sulit {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan jumlah siswa: ");
        int Jumlahsiswa = input.nextInt();

        int[] nilai = new int[Jumlahsiswa];
        int total = 0;

        for (int i = 0; i < Jumlahsiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        double Ratarata = (double) total / Jumlahsiswa;
        System.out.println("Nilai rata rata seluruh siswa adalah: " + Ratarata);
    }
}
