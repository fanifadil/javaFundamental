package Day10;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class BuatList2 {
    static Scanner variabel = new Scanner(System.in);
    static int n;
    //Buat banyak  Input
    public static int jumlahInputN(){
        System.out.print("Masukkan jumlah nilai input N: ");
        n = variabel.nextInt();
        return n;
    }
    //Buat kerangka list dan Array
    //List Input
    public static ArrayList kerangkaListInput(){
        ArrayList listContohInput = new ArrayList();
        isiKerangkaListInput(listContohInput);
        return listContohInput;
    }

    //Array Prima

    public static int[] kerangkaArrayPrima(){
        int panjangArrayPrima = n;
        int[] arrayPrima = new int[panjangArrayPrima];
        isiKerangkaArrayPrima(arrayPrima);
        return arrayPrima;
    }

    //List Contoh
    public static ArrayList kerangkaListPrima(){
        ArrayList listContohPrima = new ArrayList();
        isiKerangkaListPrima(listContohPrima);
        return listContohPrima;
    }

    //Isi kerangka list dan Array
    //Isi Kerangka list Input
    public static void isiKerangkaListInput(ArrayList listContohInput){
        int panjangList = jumlahInputN();
        for(int index = 0; index< panjangList; index++){
            System.out.print("Masukkan angka ke- "+(index+1)+" :");
            listContohInput.add(variabel.nextInt());
        }
        System.out.println("INFORMASI!!!\n" +
                "Berikut adalah urutan nomor yang anda masukkan.");
        System.out.println(listContohInput);
    }

    //Isi kerangka Array Prima
    public static void isiKerangkaArrayPrima(int[] arrayPrima){
        int inisiasiAwal =1;
        int bilPrimaAwal =2;
        while(inisiasiAwal <= arrayPrima.length)
        {
            boolean cekPrima =true;

            for (int batasBilanganPrima = 2; batasBilanganPrima <= bilPrimaAwal /2; batasBilanganPrima++)
            {
                if(bilPrimaAwal % batasBilanganPrima ==0)
                {
                    cekPrima =false;
                    break;
                }
            }

            if(cekPrima)
            {
                if(inisiasiAwal %10==0)
                {
                    int bilPrima = bilPrimaAwal;
                    arrayPrima[inisiasiAwal-1]=bilPrima;
                }
                else
                {
                    int bilPrima = bilPrimaAwal;
                    arrayPrima[inisiasiAwal-1]=bilPrima;
                }
                inisiasiAwal++;
            }
            bilPrimaAwal++;
        }

    }

    //Isi Kerangka List Prima
    public static void isiKerangkaListPrima(ArrayList listContohPrima){
        int[] arrPrima = kerangkaArrayPrima();
        System.out.println("List bilangan prima sebanyak " + arrPrima.length +": ");
        for(int primaKe = 0; primaKe< arrPrima.length; primaKe++){
            listContohPrima.add(arrPrima[primaKe]);
        }
        System.out.println(listContohPrima);
    }

    //Cetak kerangka list dan Array
    //Cetak Kerangka list Input
    public void cetakKerangkaListInput(){
        ArrayList contohInput = kerangkaListInput();
        System.out.println(contohInput);
    }

    //Cetak Kerangka ArrayPrima
    public void cetakKerangkaArrayPrima(){
        int[] arrayPrima = kerangkaArrayPrima();
        for (int arrKe = 0; arrKe<arrayPrima.length; arrKe++){
            System.out.printf("%3s", arrayPrima[arrKe]);
        }
        System.out.println();
    }

    //Cetak Kerangka List Prima
    public void cetakKerangkaListPrima(){
        ArrayList contohPrima = kerangkaListPrima();
        System.out.println(contohPrima);
    }

    //Buat Method input pilihan untuk memilih menu



    //public static void main(String[] args) {
    //    BuatList2 hasil = new BuatList2();
    //    hasil.cetakKerangkaListInput();
    //    //hasil.cetakKerangkaArrayPrima();
    //    hasil.cetakKerangkaListPrima();

    //}
}

