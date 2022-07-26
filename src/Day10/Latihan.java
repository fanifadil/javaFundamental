package Day10;

import java.util.Arrays;
import java.util.Scanner;

public class Latihan {

    Scanner s = new Scanner(System.in);

    public int getN(){
        System.out.println("Masukan Nilai N");
        int input = s.nextInt();
        return input;
    }

    public int[] dataInput(){
        int n = getN();
        int[] data = new int[n];
        System.out.println("Masukan Angka sebanyak " + n);
        for (int i = 0; i < n; i++){
            data[i] = s.nextInt();
        }

        return data;
    }

    public void kpk(){
        int[] arrData = dataInput();
        int counter = 1;
        for (int i = 0; i < arrData.length; i++){
            while (counter % arrData[0] != 0 || counter % arrData[1] != 0 || counter % arrData[2] != 0) {
                counter++;
            }
        }
        System.out.println("KPK = " + counter);
    }

    public void fpb(){
        int[] arrData = dataInput();
        int a=20;
        int b=12;
        int c=16;
        int r;
        r = a % b % c;

        do{
            a = b;
            b = c;
            c = r;
            r = a % b % c;
        } while (r != 0);
        System.out.println("Maka FPB dari 3 Bilangan    : "+c);
    }

    public static void main(String[] args) {
        Latihan l = new Latihan();
        l.kpk();
        l.fpb();
    }
}
