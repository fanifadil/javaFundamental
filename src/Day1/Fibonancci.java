package Day1;

import java.util.Scanner;

public class Fibonancci {
    public static void main(String[] args) {
        int nilaiAwal = 1;
        int nilaiSekarang = 1;
        int angkaFibonanci = 1;
        int jumlahAngka;
        Scanner input=new Scanner(System.in);
        System.out.println("Angka Fibonanci");
        System.out.print("Masukan Jumlah Bilangan = ");
        jumlahAngka = input.nextInt();
        for (int i = 1; i <= jumlahAngka; i++){
            System.out.println(nilaiSekarang);
            angkaFibonanci = nilaiAwal + nilaiSekarang;
            nilaiAwal = nilaiSekarang;
            nilaiSekarang = angkaFibonanci;
        }

    }
}
