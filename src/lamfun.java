//simple program on lambda expression
/*import java.util.ArrayList;
class lamfun{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(7);
        arr.add(4);
        arr.add(2);
        arr.add(9);
        arr.forEach(n -> System.out.println(n));
    }
}*/
/*@FunctionalInterface
interface Fun{
    public void draw();
}
public class lamfun{
    public static void main(String[] args){
        int width = 29;
        Fun d2=()->{
            System.out.println("Fun" +width);
        };
        d2.draw();
    }
}*/
//Lambda expression with no parameter
/*interface Lambda{
    public String lam();
}
public class lamfun{
    public static void main(String[] args){
        Lambda l =()->{
            return "i am using Lambda Expression.";
        };
        System.out.println(l.lam());
    }
}*/
//lambda expression with or without return Keyword
/*interface Adding{
    int add(int a, int b);
}
public class lamfun{
    public static void main(String[] args){
        Adding add1 = (a,b)->(a+b);
        System.out.println(add1.add(3,7));
        Adding add2 = (int a, int b)->{
            return (a+b);
        };
        System.out.println(add2.add(50,100));
    }
}*/
//Lambda expression with multiple statements
/*@FunctionalInterface
interface Multiple{
    String multi(String message);
}
public class lamfun{
    public static void main(String[] args){
        Multiple person = (message)->{
            String str1 = "hii everyone,";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.multi("welcome to ksj."));
    }
}*/
//creating thread using lambda expression
/*public class lamfun{
    public static void main(String[] args){
        Runnable r1 = new Runnable(){
            public void run(){
                System.out.println("Creating Thread1");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Runnable r2=()->{
            System.out.println("Creating Thread2");
        };
        Thread t2=new Thread(r2);
        t2.start();
        }
}*/
//implementing functional interface
/*@FunctionalInterface
interface Function{
    void fun(String msg);
}
 public class lamfun implements Function{
    public void fun(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args){
        lamfun s = new lamfun();
        s.fun("hello everyone");
    }
 }*/
//simple program to demonstrate the use of predicate interface
/*import java.util.*;
import java.util.function.Predicate;
class lamfun{
    public static void main(String[] args){
        List<String> name = Arrays.asList( "soni" ,"shruti" , "swati" ,"sujata");
        Predicate<String> p = (s) -> s.startsWith("S");
        for (String st: name){
            if (p.test(st))
                System.out.println(st);
        }
    }
}*/
//method reference to an instance method of an object
/*@FunctionalInterface
interface MyInterface{
    void display();
}
class lamfun {
    public void myMethod(){
        System.out.println("Instance Method");
    }
    public static void main(String[] args) {
        lamfun obj = new lamfun();
        MyInterface ref = obj::myMethod;
        ref.display();
    }
}*/



