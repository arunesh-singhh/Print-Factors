import java.util.Scanner;

public class Print_Factor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 2;
        boolean isprime = true;

        while(div < n){
            if(n % div == 0){
                System.out.print(div + " ");
                isprime = false;
            }
            div++;
        }
        if(isprime){
            System.out.println("-1");
        }
        sc.close();
    }
    
}
