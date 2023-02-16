package Sparsh1;

import java.sql.ParameterMetaData;
import java.util.Scanner;

// armstrong number is the sum of cube of all the digit of the number
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        System.out.println(ArmstrongNumber(n));
        for (int i = 0; i < 5000000; i++) {
            if(ArmstrongNumber(i)){
                System.out.println(i);
            }
        }
    }
    static boolean ArmstrongNumber(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rev = n % 10;
            n = n / 10;
            sum = sum+(rev*rev*rev);

        }
        if(sum== original){
            return true;
        }
        return false;
    }

}