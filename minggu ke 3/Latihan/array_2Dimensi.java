package latihan;

public class array_2Dimensi {
   public static void main(String[] args) {
        // TODO code application logic here
        int[][] array ={{5,4, 2, 1, 5}, {9,6, 5, 7, 8}, {5, 1, 2, 5, 10}};
        
        for (int baris =0; baris < 3; baris++){
            for (int kolom =0; kolom < 5; kolom++){
                System.out.print(array[baris][kolom]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
