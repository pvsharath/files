import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if (isPangram(str)) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean flag = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!str.contains(String.valueOf(ch))) {
                flag = false;
                break;
            }
        }
        if (flag)
            return true;

        return false;
    }
}
