class Student{ 
    String name;
    int age;

    Student(String n, int a){
        name=n;
        age=a;
    }
    public void display(){
        System.out.println("Name:"+name+" Age:"+age);
    }
}
public class Obj{
    public static void main(String args[]){
        Student student1=new Student();
        student1.name="Pavithra";
        student1.age=25;
        student1.display();
            Student student2=new Student();
        student2.name="Kavyaa";
        student2.age=25;
        student2.display();


    }
}