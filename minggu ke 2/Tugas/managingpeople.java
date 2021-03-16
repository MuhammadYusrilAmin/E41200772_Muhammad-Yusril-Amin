package tugas;

    class Person {
       String getName;
       int getAge; 
       
        public void set (String getName, int getAge){
            this.getName = getName;
            this.getAge = getAge;
        }
        
        public String getName(){
           return getName;
        }
        
        public int getAge(){
           return getAge;
        }
    }

public class managingpeople {
        
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.set("Arial", 37);
        Person p2 = new Person();
        p2.set("Joseph", 15);
               
        if (p1.getAge() == p2.getAge()){
            System.out.println(p1.getName()+" is the same age as "+p2.getName());
        }else{
            System.out.println(p1.getName()+" is NOT the same age as "+p2.getName());
        }
    }
}
