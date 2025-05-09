import java.util.Date;

public class Main{
    public static void main(String[] args){
        System.out.println("This is java program");
        System.out.println("Output from the java program");
        System.out.println(new Date());
        System.out.println("Hello");
        System.out.println("Hello world");

        int a = 5;
        int b = 10;
        int c = a+b;
        System.out.println("The sum number" + c );
        System.out.println("Added One more File");  

        Student student = new Student();
        student.sayHello();
        student.sayHello();
    }
}