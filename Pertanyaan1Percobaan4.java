import java.util.Scanner;
public class Pertanyaan1Percobaan4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

int mahasiswa, matkul;

System.out.print("Masukkan Jumlah Mahasiswa: ");
mahasiswa = sc.nextInt();
System.out.print("Masukkan Jumlah Mata Kuliah: ");
matkul = sc.nextInt();
int[][] nilai = new int[mahasiswa][matkul];
    
for(int i = 0; i < nilai.length; i++){
        System.out.println("Input nilai mahasiswa ke-" + (i+1));
        
        double totalPerSiswa = 0;
    for(int j = 0; j < nilai[i].length; j++){
        System.out.print("Nilai mata kuliah " + (j+1) + ": ");
        nilai[i][j] = sc.nextInt();
        totalPerSiswa+=nilai[i][j];
    }
    System.out.println("Nilai rata-rata: " + totalPerSiswa/matkul);
    }
    System.out.println("\n====================================");
    System.out.println("Rata-rata Nilai setiap Mata Kuliah");
    
    for(int j = 0; j < matkul; j++){
        double totalPerMatkul = 0;
    
        for(int i = 0; i < mahasiswa; i++){
            totalPerMatkul += nilai[i][j];
        }
        System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul/matkul);
    }
   } 
}
