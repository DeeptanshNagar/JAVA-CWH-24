import java.util.Scanner;

public class fun_patterns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an uppercase letter: ");
        char n = sc.nextLine().charAt(0);

        for (char i = 'A'; i <= n; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
