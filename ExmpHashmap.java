import java.util.HashMap;
public class JavaTester {
   public static void main(String[] args){
      HashMap<Integer, String> hm = new HashMap<Integer, String>();
      hm.put(12, "John");
      hm.put(2, "Smith");
      hm.put(7, "Peter");
      System.out.println("
HashMap object output :

" + hm);
      hm.put(12, "Smith");
      System.out.println("
After inserting duplicate key :

" + hm);
   }
}


//OUTPUT

/*
HashMap object output :
{2=Smith, 7=Peter, 12=John}
After inserting duplicate key :
{2=Smith, 7=Peter, 12=John}
*/

