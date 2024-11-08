import java.util.Scanner;
public class Pertanyaan5Percobaan2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
String penonton[][] = new String[4][2];
int baris, kolom, pilih;
String nama, next;
                
                while (true) {
                    System.out.println("======== MENU ========");
                    System.out.println("1. Input Data Penonton");
                    System.out.println("2. Tampiilkan Daftar Penonton");
                    System.out.println("3. Exit");
                    System.out.print("Pilih Menu (1-3): ");
                    pilih = sc.nextInt();
                    sc.nextLine();
                switch (pilih) {
                case 0:
                System.out.println("TERIMA KASIH");
                return; 
                case 1:
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    if (baris < 1 || baris > 4 ||
                kolom < 1 || kolom > 2) {
                 System.out.println("Nomor baris atau kolom tidak tersedia. Silakan masukkan nomor yang valid.");
                 }
                 if (penonton[baris - 1][kolom -1] != null) {
                 System.out.println("Kursi telah terisi, mohon memilih kursi lainnya.");
                 }
          
                penonton[baris - 1][kolom - 1] = nama;          
                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                }
                }
                case 2:
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris " + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print((penonton[i][j] != null ? penonton[i][j] : "***") + " ");
                    }
                    System.out.println();
                }
                break;
            }    
      }  
    }
    }