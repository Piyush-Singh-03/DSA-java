import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // code tomorrow
        // enter op , enter input number , print answer
        // take input till user doesn't press x
        int ans = 0;
        while(true) {
            System.out.print("Enter your operator: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input numbers
                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*') {
                    ans = num1 * num2;
                }
                if(op == '/') {
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }else{
                        System.out.println("your number cannot be divided by 0");
                    }
                }
                if(op == '%') {
                    ans = num1 % num2;
                }


            }else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Enter a valid operator");
            }
            System.out.println(ans);
        }
    }
}
