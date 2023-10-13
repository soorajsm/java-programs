public class test {
    public static void main(String[] args) {
        System.out.println("This is the main method in MainClass");
        AnotherClass obj=new AnotherClass();
        obj.main(args);
    }
}

class AnotherClass {
    public static void main(String[] args) {
        System.out.println("This is a main method in AnotherClass");
    }
}
