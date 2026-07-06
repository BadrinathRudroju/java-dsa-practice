package recursion;

public class Nto1 {
    static void main() {
        concept(5);
    }

    static void fun(int n){
        if(n ==0){
            return;
        }

        System.out.println(n);
        fun(n-1);
    }

    static void funRev(int n){
        if(n ==0){
            return;
        }

        funRev(n-1);
        System.out.println(n);
    }

    static void combine(int n){
        if (n == 0){
            return;
        }

        System.out.println(n);
        combine(n-1);
        System.out.println(n);
    }

    //--n vs n--
    static void concept(int n){
        if(n ==0){
            return;
        }
        System.out.println(n);
        concept(--n);
    }
}
