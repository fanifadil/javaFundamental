package Day3;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class LatihanFunctioMethod {
    public void HitungKarakter(String nama) {
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

    public void HitungVokal(String nama) {
        int jumlahVokal = 0;

        String[] arrHuruf = nama.split("");
        for (int i = 0; i < arrHuruf.length; i++) {
            if (arrHuruf[i].equalsIgnoreCase("a") || arrHuruf[i].equalsIgnoreCase("i") || arrHuruf[i].equalsIgnoreCase("u") || arrHuruf[i].equalsIgnoreCase("e") || arrHuruf[i].equalsIgnoreCase("o")) {
                jumlahVokal++;
            }
        }
        System.out.println("Jumlah Vokal = " + jumlahVokal);
    }

    public void GantiVokal(String nama) {
        int jumlahHuruf = 0;
        int counter = 0;
        String[] arrHuruf = nama.split("");
        for (int i = 0; i < arrHuruf.length; i++) {
            if (arrHuruf[i].equalsIgnoreCase("a") || arrHuruf[i].equalsIgnoreCase("i") || arrHuruf[i].equalsIgnoreCase("u") || arrHuruf[i].equalsIgnoreCase("e") || arrHuruf[i].equalsIgnoreCase("o")) {
                arrHuruf[i] = Integer.toString(counter++);
            }
        }
        System.out.println(Arrays.toString(arrHuruf));
    }

    public void HitungJumlahKata(String nama) {
        int jumlahKata = 0;
        String[] arrKata = nama.split(" ");
        for (int i = 0; i < arrKata.length; i++) {
            if (!(arrKata[i].equalsIgnoreCase("") || arrKata[i].equalsIgnoreCase(" "))) {
                jumlahKata++;
            }
        }
        System.out.println("Jumlah Kata = " + jumlahKata);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        System.out.print("Masukan Nama Anda = ");
        String nama = input.nextLine();
        System.out.print("Pilihan : \n 1. Hitung Kata \n 2. Hitung Vokal \n 3. Hitung Karakter \n 4. Ganti Vokal \n\n Masukan pilihan :");
        pilihan = input.nextInt();
        LatihanFunctioMethod m = new LatihanFunctioMethod();
        input.close();
        switch (pilihan) {
            case 1:
                m.HitungJumlahKata(nama);
                break;
            case 2:
                m.HitungVokal(nama);
                break;
            case 3:
                m.HitungKarakter(nama);
                break;
            case 4:
                m.GantiVokal(nama);
                break;
            default:
                System.out.println("Pilihan Tidak Ditemukan");
        }
    }
}
