import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter signal color:");
        String s = sc.nextLine();

        switch (s.toLowerCase()) {

            case "red":
                System.out.println("Stop");
                break;

            case "green":
                System.out.println("Go");
                break;

            case "yellow":
                System.out.println("Ready");
                break;

            default:
                System.out.println("not exist");
        }
    }
}