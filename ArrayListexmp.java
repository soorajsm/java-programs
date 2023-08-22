import java.util.ArrayList;

public class ArrayListexmp { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println(cars.get(0));
    System.out.println(cars.get(2));
    cars.remove("Volvo");
    cars.remove("Mazda");
    System.out.println(cars);
    
  } 
}
