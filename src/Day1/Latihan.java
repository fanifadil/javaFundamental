package Day1;

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CETAK BILANGAN ANGKA 1 DAN 0");
        System.out.print("Masukan Jumlah Angka : ");
        int jumlahAngka = input.nextInt();
        for (int i = 0; i < jumlahAngka; i++){
            System.out.print(i%2);
        }

    }
}
