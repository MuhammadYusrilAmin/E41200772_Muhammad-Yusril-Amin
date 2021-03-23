package latihan;
import java.util.Scanner;

public class mingguke3_conditionalStatement_2 {
    public static void main(String[] args) {
        // membuat variable dan Scaner
        String Lampu;
        Scanner scan = new Scanner(System.in);
        //Mengambil Input
        System.out.print("Masukkan warna lampu = ");
        Lampu = scan.nextLine();
        
        switch(Lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna lampu salah!"); 
        } 
    } 
}
