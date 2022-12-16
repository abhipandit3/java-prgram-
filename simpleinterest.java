import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int R = input.nextInt();
        int T = input.nextInt();
        int si = P*R*T/100;
        System.out.println(si);

    }
    
}
