import java.util.Scanner;

public class Stringarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String sec = sc.next();

        int len1 = first.length();
        int len2 = sec.length();
        int len = Math.max(len1, len2);

        StringBuilder result = new StringBuilder(len1 + len2);

        for (int i = 0; i < len; i++) {
            if (i < len1) {
                result.append(first.charAt(i));
            }
            if (i < len2) {
                result.append(sec.charAt(i));
            }
        }

        System.out.println(result.toString());
    }
}