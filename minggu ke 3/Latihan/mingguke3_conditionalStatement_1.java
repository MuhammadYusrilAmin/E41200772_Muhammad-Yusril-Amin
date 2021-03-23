package latihan;
import java.util.Scanner;

public class mingguke3_conditionalStatement_1 {
    public static void main(String[] args) {
        // membuat variable dan Scaner
        int nilai;
        String Grade;
        Scanner scan = new Scanner(System.in);
        //Mengambil Input
        System.out.print("Masukkan nilai = ");
        nilai = scan.nextInt();
        //hitung Grade
        if(nilai >= 90){
            Grade = "A";
        } else if(nilai >= 80){
            Grade = "B+";
        } else if(nilai >= 70){
            Grade = "B";
        } else if(nilai >= 60){
            Grade = "C";
        } else if(nilai >= 50){
            Grade = "C+";
        } else if(nilai >= 40){
            Grade = "D";
        } else {
            Grade = "E";
        }
        // Cetak Output
        System.out.println("Grade = " + Grade);
    }
}
