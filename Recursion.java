public class Recursion {
    public static void main(String[] args) {
  System.out.println(factorial(5));

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
}
