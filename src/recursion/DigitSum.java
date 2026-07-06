package recursion;

public class DigitSum {
    static void main() {
        System.out.println(sum(1334543234));
    }
    static long sum(long n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sum(n / 10);
    }
}
