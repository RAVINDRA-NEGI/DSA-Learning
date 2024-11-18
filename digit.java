import java.util.ArrayList;
import java.util.List;

public class digit {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static boolean armstrongNumber(int n){
        int sum = 0;
        int original = n;
        while ( n >0){
            int digit = n%10;
            sum = sum + digit*digit*digit;
            n /= 10;
        }

        if(sum == original){
            return true;

        }else{
            return false;
        }
    }

        public static List<Integer>  divisors(int d){
          List<Integer> count  = new ArrayList<>();
            for( int i = 2; i <= d; i++){
                if (d%i == 0){
                    count.add(i);
                }
                
            }
            count.sort(Integer::compareTo);
            
            return count;
        }

        public static int sumOfAllDivisors(int n){
           int sum = 0;
            for (int i = 1; i <=n; i++){
                for(int j = 1; j<= i; j++){
                    if(i%j == 0){
                        sum += j;
                    }
                    // for (int j = i; j <= n; j += i) {
                    //     sum += i;
                    // }
                }
            }
            return sum;
        }

        // optimize version of sum of all divisors
        public static  long  alldivisors(int n){
            long sum = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        sum += j;
                        int pairDivisor = i / j;
                        if (j != pairDivisor) {
                            sum += pairDivisor;
                        }
                    }
                }
            }
    
            return sum;
        }


        public static boolean isAPrimeNumber(int n){
           int count = 0;
           if (n == 0 || n == 1){
            return false;
           }else{
            for(int i = 2; i<= n/2; i++){
                if(n%i == 0){
                    count++;
                    return false;
                }
            }

           }
           if (count == 0){
            return true;
           }else{
            return false;
           }
}

        public static int hcd(int a , int b){
            while (a>0 && b>0) {
                if (a>b){
                 a=a%b;
                }else{
                   b=b%a;
                }
            }
            return(a==0) ? b:a;
        }
        public static int factorial(int n){
            int sum = 1;
            while (n>0){
                sum *= n;
                n = n-1;
            }
            return sum;
        }
}