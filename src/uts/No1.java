package uts;
import java.util.Scanner;
public class No1 {
   public static void Shellsort(int[] arr) {
        int n = arr.length;
        int C,M;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        int temp;
        C = 0;
        M = 0;
        jarak = n;
        
        while (jarak >= 1) { 
            jarak = jarak/2;
            Sudah = true;
            while (Sudah) {
                Sudah = false;
                for (j = 0; j < n - jarak; j++) {
                    i = j + jarak; 
                    C++;
                    if (arr[j]> arr[i]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        Sudah = true;
                    }
                }
            }
        }
    }
    
    public static void tampil(int data[]) {
        for(int i = 0; i<data.length; i++) 
            System.out.print(data[i] + "");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int A[] = {3, 10, 4, 2, 8, 13};
        No1.tampil(A);
        No1.Shellsort(A);
        No1.tampil(A);
    }
   public static void shellsort(String[] args) {
       //pendeklarasian variabel
       int B[] = {3, 10, 4, 2, 8, 13};
       int cari = 8;
       int IndeksAwal = 0; //0
       int IndeksAkhir = B.length-1;
       int ketemu = 0; 
       int point = 0;
       
       //menampilkan data dalam array
       System.out.println("isi data adalah: ");
       for (int i = 0; i < B.length; i++) {
           
           System.out.print(B[i] + "");
        }
       System.out.println("");
       System.out.println("");
       
       while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)) {
           point = (IndeksAwal + IndeksAkhir) / 2; 
           System.out.println("indeks pointer:" + point);
           if (cari == B[point] ) { 
                ketemu = 1;
                System.out.println("Data" + cari + "Telah ditemukan pada index ke " + point);
           }
           
           else if (cari < B[point] ) { 
               System.out.println("Cari di kiri ");
               IndeksAkhir = point-1; 
           }
           
           else {
               IndeksAwal = point+1;
               System.out.println("cari di kanan ");
           }
        }
       
       if (ketemu == 1)
           System.out.println("kesimpulan: data ditemukan ");
       else
           System.out.println("kesimpulan: data tidak ditemukan");
       
        
    }
}

     


    


                
      