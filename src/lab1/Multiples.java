package lab1;

public class Multiples {
    /**
     * Print out the number of multiples of 3 and 5 below 1000.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    /**
     * Count the multiples of a and b below n.
     * @param a
     * @param b
     * @return count
     */
    static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++){
            if (i % a == 0 || i % b == 0){
                count++;
            }
        }
        return count;
    }
}
