package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        System.out.print("Masukan Nama Anda = ");
        String data = input.nextLine();
        System.out.print("Pilihan : \n 1. Hitung Kata \n 2. Hitung Vokal \n 3. Hitung Karakter \n 4. Ganti Vokal \n\n Masukan pilihan :");
        pilihan = input.nextInt();
        input.close();
        switch (pilihan) {
            case 1:
                HitungJumlahKata(data);
                break;
            case 2:
                HitungVokal(data);
                break;
            case 3:
                HitungKarakter(data);
                break;
            case 4:
                GantiVokal(data);
                break;
            default:
                System.out.println("Pilihan Tidak Ditemukan");
        }

    }
    static void HitungKarakter(String nama){
        int jumlahHuruf = 0;
        int counter = 0;
        String[] arrHuruf = nama.split("");
        for (int i = 0; i < arrHuruf.length; i++) {
            if (!(arrHuruf[i].equalsIgnoreCase(" "))) {
                jumlahHuruf++;
            }
        }
        System.out.println("jumlah Huruf = " + jumlahHuruf);
    }

    static void HitungVokal(String nama){
        int jumlahVokal = 0;

        String[] arrHuruf = nama.split("");
        for (int i = 0; i < arrHuruf.length; i++) {
            if (arrHuruf[i].equalsIgnoreCase("a") || arrHuruf[i].equalsIgnoreCase("i") || arrHuruf[i].equalsIgnoreCase("u") || arrHuruf[i].equalsIgnoreCase("e")|| arrHuruf[i].equalsIgnoreCase("o")) {
                jumlahVokal++;
            }
        }
        System.out.println("Jumlah Vokal = " + jumlahVokal);
    }
    static void GantiVokal(String nama){
        int jumlahHuruf = 0;
        int counter = 0;
        String[] arrHuruf = nama.split("");
        for (int i = 0; i < arrHuruf.length; i++) {
            if (arrHuruf[i].equalsIgnoreCase("a") || arrHuruf[i].equalsIgnoreCase("i") || arrHuruf[i].equalsIgnoreCase("u") || arrHuruf[i].equalsIgnoreCase("e")|| arrHuruf[i].equalsIgnoreCase("o")) {
                arrHuruf[i] = Integer.toString(counter++);
            }
        }
        System.out.println(Arrays.toString(arrHuruf));
    }

    static void HitungJumlahKata(String nama){
        int jumlahKata = 0;
        String[] arrKata = nama.split(" ");
        for (int i = 0; i < arrKata.length; i++){
            if(!(arrKata[i].equalsIgnoreCase("") || arrKata[i].equalsIgnoreCase(" "))){
                jumlahKata++;
            }
        }
        System.out.println("Jumlah Kata = " + jumlahKata);
    }
}