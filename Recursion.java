import java.util.ArrayList;

public class Recursion {
    public static void main(String[] args) {
  System.out.println(factorialNumbers(56));

    }
    public static void run(int n){
      if(n<1){
        return;
      }
      run(n-1);
      System.out.print(n);
     
    }
    public static void printName(int i , int j){
      if (i>j) {
        return;
      }
      System.out.println("raj");
      printName(i+1, j);
    }

    public static long SumOfSeries (long n){
      if(n == 0 ){
        return 0;
      }
      return (n*n*n) + SumOfSeries(n-1);
    }

    public static long factorial(int n){
      
      if(n==0){
        return 1;
      }

      return n * factorial(n-1);
    }

    public static long sumOfNumbers(long n){
      if (n==0) {
        return 0;
      }
      return n+(sumOfNumbers(n-1));
    }

    public static void generateFactorials(long n , long fact , int k , ArrayList<Long> result ){
      if (fact>n){
        return;
      }
      result.add(fact);
      generateFactorials(n, fact*(k + 1), k+1, result);
    }
    static ArrayList<Long> factorialNumbers(long n){
      ArrayList<Long> result = new ArrayList<>();
      generateFactorials(n, 1, 1, result);
      return result;
    }
}
