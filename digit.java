public class digit {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(371));
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
}
