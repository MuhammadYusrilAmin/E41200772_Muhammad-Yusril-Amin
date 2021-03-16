package tugas;

public class person {
    String fName ;
    String lName;
    int stuId;
    String stuStatus;
     
    public person(String fName, String lName, int stuId, String stuStatus){
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus; 
    }
    public static void main(String[] args) {
        person student = new person("Lisa", "Palombo", 123456789, "Actice");   
        System.out.println ("Student Name: " + student.fName + "" + student.lName );
        System.out.println ("Student ID: " + student.stuId);
        System.out.println ("Student Status: " + student.stuStatus);
    }
}
