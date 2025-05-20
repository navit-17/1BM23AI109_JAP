import java.util.Scanner;
public class string_buffer {
    public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer();
    System.out.println("Capacity: " + sb1.capacity());

    StringBuffer sb2 = new StringBuffer("Hello");
    System.out.println("Capacity: " + sb2.capacity());

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();
    StringBuffer sb3 = new StringBuffer(input);
    sb3.reverse();
    String reversedUc = sb3.toString().toUpperCase();
    System.out.print("reversed and uppercase string: " + reversedUc);

    System.out.print("Enter a string to append: ");
    String appendString = sc.nextLine();
    sb3.append(appendString);
    System.out.println("String after appending: " + sb3);
    }
}
