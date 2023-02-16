package Sparsh1;

public class Recursion_Factorial {
    public static void main(String[] args){
        float ans = fact(4);
        System.out.println(ans);
    }
    static float fact(int n){
        if(n<=1){
            return 1;
        }
        return fact((n)-1);
    }

}
