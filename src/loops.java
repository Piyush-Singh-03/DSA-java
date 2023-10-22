import java.util.Scanner;
public class loops {
    public static void main(String[] args){
           /* for (int num = 1 ;  num < 5 ; num ++){
                System.out.println(num);
            }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        for (int i = 1; i <= num ; i++){
 //           System.out.println(i + " ");
            System.out.println("hello world");
        }

        int num = 1;
        while (num <= 10){
            System.out.println(num);
            num++;
        }*/
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // q- find largest number
        int max = a;
        if(max <b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        System.out.println("the greatest number is " + max);
    }
}
