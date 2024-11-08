import java.util.Scanner;
    public class TUGAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int nilai, total=0, totalRata=0;
int[][] survey = new int[10][6];
float rataResponden, rataPertanyaan, rataSeluruh;

for (int i = 0; i < survey.length; i++) {
    System.out.println("Masukkan nilai untuk responden " + (i+1) + ":");
    for (int j = 0; j < survey[i].length; j++) {
        do {
            System.out.print("Pertanyaan " + (j+1) + " (1-5): ");
            nilai = sc.nextInt();
        if (nilai < 1 || nilai > 5) {
            System.out.println("Nilai harus antara 1 dan 5. Silakan coba lagi.");
        }
        } 
        while (nilai < 1 || nilai > 5);
            survey[i][j] = nilai;
            }
        }

System.out.println("========================================");
System.out.println("\nRata-rata nilai untuk setiap responden:");
    for (int i = 0; i < survey.length; i++) {  
    total = 0;
        for (int j = 0; j < survey[i].length; j++) {
            total += survey[i][j];
            }
            rataResponden = total/6;
            System.out.printf("Responden %d: %.2f%n", (i+1), rataResponden);
        }

System.out.println("===========================================");
System.out.println("\nRata-rata nilai untuk setiap pertanyaan:");;
        for (int j = 0; j < survey[0].length; j++) {  
            total=0;
            for (int i = 0; i < survey.length; i++) {
                total += survey[i][j];
            }
            rataPertanyaan = total/10;
            System.out.printf("Pertanyaan %d: %.2f%n", (j+1), rataPertanyaan);
        }

System.out.println("===========================================");   
    for (int i = 0; i < survey.length; i++) {
        for (int j = 0; j < survey[i].length; j++) {
            totalRata += survey[i][j];
            }
        }
        rataSeluruh = totalRata/60;
        System.out.printf("%nRata-rata keseluruhan: %.2f%n", rataSeluruh);

    }
}