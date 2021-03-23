package latihan;

public class array_1Dimensi {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array ={5, 10, 17, 20, 1};
        String[] teks={"Saya", "sedang", "belajar", "OOP", "Java"};
        
        for (int i =0; i < array.length; i++){
            System.out.println(array[i]);
        }
        
        for (int y =0; y < teks.length; y++){
            System.out.print(teks[y]);
            System.out.print(" ");
        }
    }
}
