public class RecursionMethod {
    public static void main(String[] args) {
        
    }

    // #1 Direct Recursion
        //A function directly calls itself within its body.

public static int factorial(int n){

    if (n==0 || n==1) {
        return 1;
    }
    return n*factorial(n-1);

}


    //  #2 Indirect Recursion
    //A function calls another function, which eventually calls the first function again.
    public static void functionA(int n) {
        if (n > 0) {
            System.out.println("A: " + n);
            functionB(n - 1);
        }
    }
    
    public static void functionB(int n) {
        if (n > 0) {
            System.out.println("B: " + n);
            functionA(n - 1);
        }
    } 


//     3. Tail Recursion
// The recursive call is the last statement in the function. This is more memory-efficient as compilers can optimize the call stack (tail call optimization).

public static int tailFactorial(int n, int accumulator) {
    if (n == 0) return accumulator; // Base case
    return tailFactorial(n - 1, n * accumulator); // Tail recursive call
}


// 4. Head Recursion
// The recursive call occurs before any other computation in the function.

public static void printNumbers(int n) {
    if (n == 0) return; // Base case
    printNumbers(n - 1); // Recursive call (first action)
    System.out.println(n); // Computation after recursive call
}


// 5. Tree Recursion
// A function calls itself multiple times, creating a tree-like structure of calls.


public static int fibonacci(int n) {
    if (n == 0) return 0; // Base case
    if (n == 1) return 1; // Base case
    return fibonacci(n - 1) + fibonacci(n - 2); // Two recursive calls
}


// 6. Nested Recursion
// A recursive function is called inside the argument of another recursive call.


public static int nestedRecursion(int n) {
    if (n > 100) return n - 10; // Base case
    return nestedRecursion(nestedRecursion(n + 11)); // Recursive call inside itself
}


// 7. Mutual Recursion
// Similar to indirect recursion but involves more than two functions calling each other in a cycle.


public static boolean isEven(int n) {
    if (n == 0) return true;  // Base case
    return isOdd(n - 1);      // Mutual recursive call
}

public static boolean isOdd(int n) {
    if (n == 0) return false; // Base case
    return isEven(n - 1);     // Mutual recursive call
}





}