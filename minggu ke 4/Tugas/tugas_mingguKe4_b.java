package Tugas;

public class tugas_mingguKe4_b {
    public static void main(String[] args) {
        // header
        System.out.println("         Do_While ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        // Membuat variable 
        int angka = 1;
        
        do {
            System.out.print("  "+angka);
            // increment nilai angka
            angka *= 2;
        }while(angka <= 100);
        System.out.println("");
    } 
}
