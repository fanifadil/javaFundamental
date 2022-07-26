package Day2;



import java.util.Arrays;
import java.util.Scanner;


public class ManipulasiString {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama = ");
        String nama = input.nextLine();
        input.close();

        hitungKarakter(nama);
        hitungKata(nama);
        hitungVokal(nama);


    }

    static void hitungKata(String nama){
        int jumlahKata = 0;
        int i = 0;
        while(i < nama.length()) {
            while (i < nama.length() && nama.charAt(i) == ' ') i++;
            if (i < nama.length() && nama.charAt(i) != ' ') {
                jumlahKata++;
                while (i < nama.length() && nama.charAt(i) != ' ') i++;
            }
        }
        System.out.println("Jumlah Kata = " + jumlahKata);
    }

    static void hitungVokal(String nama){
        int jumlahVokal = 0;
        nama = nama.toLowerCase();
        for(int i = 0; i < nama.length(); i++){
            if (nama.charAt(i) == 'a' || nama.charAt(i) == 'i' || nama.charAt(i) == 'u' || nama.charAt(i) == 'e' ||nama.charAt(i) == 'o'){
                jumlahVokal++;
            }
        }
        System.out.println("Jumlah vokal = " + jumlahVokal);
    }

    static void gantiAngka(String nama){

    }



    static void hitungKarakter(String nama){
        int jumlahKarakter = 0;
        for (int i = 0; i < nama.length(); i++ ){
            jumlahKarakter++;
            if (nama.charAt(i) == ' '){
                jumlahKarakter--;
            }
        }
        System.out.println("Jumlah Karakter = " + jumlahKarakter);
    }





}
