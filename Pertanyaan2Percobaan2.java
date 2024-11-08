import java.util.Scanner;
    public class Pertanyaan2Percobaan2 {
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
    sc.close();
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
            System.out.print((penonton[i][j] != null ? penonton[i][j] : "null") + " ");
        }
        System.out.println();
    }
    break;
}
    }
        }
    }  


