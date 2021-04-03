package Tugas;

public class tugas_mingguKe4_b {
    public static void main(String[] args) {
        // Membuat variable 
        int angka1 = 1;
        int angka = 2;
        
        // header
        System.out.println("         Do_While ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        System.out.print("1");
        do {
            System.out.print(" "+angka);
            // increment nilai angka
            angka += 2;
        }while(angka <= 100);
        System.out.println("");
        System.out.println("");
        
        // header2
        System.out.println("         Do_While ");
        System.out.println("Bilangan perkalian 2 (1-100)");
        System.out.println("============================");

        do {
            System.out.print("  "+angka1);
            // increment nilai angka perkalian
            angka1 *= 2;
        }while(angka1 <= 100);
        System.out.println("");
    }
}
