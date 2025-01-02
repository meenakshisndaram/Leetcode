import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the non negative number:");
        int numb = in.nextInt();
        boolean prime= true;
        if (numb<=0){
            prime=false;
        }

else {
            int d=2;
            do {
                if (numb % d == 0) {
                    prime = false;
                    break;
                }
                d++;
            }while(d*d<=numb);
        }
        if(prime) {
            System.out.println("it is not a prime number");
        }
        else {
            System.out.println("it is not a prime number");
        }
    }
}