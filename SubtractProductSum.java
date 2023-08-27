public class SubtractProductSum {
    
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int result;
        while (n > 0) {
            int rem = n % 10;
            product *= rem;
            sum += rem;
            n /= 10;
        }
        result = product - sum;
        return result;
    }

    public static void main(String args[]) {
        int n = 234;
        int result = subtractProductAndSum(n);
        System.out.println(result);
    }

}