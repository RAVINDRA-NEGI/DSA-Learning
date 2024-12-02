import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(isPalindrom("y jafsjdfl"));
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


    public static void arrayRevers(int [] n){
          reverse(n, 0, n.length-1);
          for(int i : n){
            System.out.print(i + " ");
          }
          System.out.println();
    }
    public static void reverse(int [] n , int start , int end){
          if (start>= end) {
            return;
          }
       int temp = n[start];
       n[start] = n[end];
       n[end] = temp;
       reverse(n, start+1, end-1);   
      

    }

    public static boolean isPalindrom(String s){
      String processed = preprocess(s);


      if (checker(processed, 0, processed.length()-1)) {
        return true;
      }else{
        return false;
      }
    }

    public static String preprocess(String s) {
     
      return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
  }


    public static boolean checker(String s , int start , int end){
     

      if (start >= end){
        return true;
      }
      if (s.charAt(start) != s.charAt(end)){
        return false;
      }
      return checker(s, start+1, end-1);
    }


    

    
}
