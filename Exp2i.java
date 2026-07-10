public class Exp2i {
    String name;
    int roll_no;
    Student(){
        name = "Unknown";
        roll_no = 100;
    }
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("PRN: "+roll_no);
        System.out.println();
    }
    public static void  main (String[] args) throws Exception{
        Student obj1 = new Student();
        Student obj2 = new Student(1001,"Prakash");
        obj1.display();
        obj2.display();
    }
}
