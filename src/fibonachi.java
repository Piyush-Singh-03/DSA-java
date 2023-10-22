import java.util.Scanner;
public class fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your position for fib series");
        int input = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= input){
            int temp = b;
            b = b +a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
