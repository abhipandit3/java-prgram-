import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello How are you" +  name);
        input.close();


    }
    
}
