package Day1;

import java.util.Scanner;

public class Ganjil {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bilangan;
        System.out.println("Cek Deret Bilangan Ganjil");
        System.out.print("Masukan Bilangan = ");
        bilangan = input.nextInt();
        for(int i = 1; i < bilangan; i++) {
            if(i%2 == 1){
                System.out.println(i + " " +"Adalah Bilangan Ganjil");
            }
        }
    }
}
