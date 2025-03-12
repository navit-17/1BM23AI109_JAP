import java.util.Scanner;
public class gym_membership {
    public static void main(String[] args){
        details();
    }

    public static int calc(int dur){
        return (dur * 1200);
    }
    public static void details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your membership status (T/F): ");
        boolean mem_stat = sc.nextBoolean();
        if(mem_stat){
            System.out.print("Enter your membership duration (m):  ");
            int duration = sc.nextInt();
            int fee = calc(duration);
            System.out.println("Your Fees for " + duration + " months is " + fee);
        }
        else {
            System.out.print("You can purchase a new membership");
        }

    }
}
