public class Condition {
    public static void main(String[] args) {
        int salary =25000;
        if(salary > 25000) {
            salary += 2000;
        }else if(salary<25000) {
            salary += 1000;
        }
        else {
            salary += 500;
        }
        System.out.println(salary);

    }
    
    
}
