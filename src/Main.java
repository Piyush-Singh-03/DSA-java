import java.util.Scanner;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("salary bonus");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary");
        int input = sc.nextInt();
        if (input > 10000){
            input += 2000;
        } else if(input > 20000){
            input += 3000;
        } else{
            input += 1000;
        }
        System.out.println(input);
    }
}