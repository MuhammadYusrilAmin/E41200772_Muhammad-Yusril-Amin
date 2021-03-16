/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author MUHAMMAD YUSRIL
 */
class book {
    int price;
    int pages;
    
    public void set (int price, int pages){
        this.price = price;
        this.pages = pages;
    }
    
    public void show (){
        System.out.println("Book Information");
        System.out.println("Book Price : " +price);
        System.out.println("Number of Pages :" +pages);
    }
}
public class latihanMingguke2_c {
     public static void main(String[] args) {
        book javabook = new book();
        javabook.set(80000, 201);
        javabook.show();
    }
}
