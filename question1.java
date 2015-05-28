import java.io.*;
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // examine first 3
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b - a == c - b) {
            int offset = b - a;
            int last = c;
            for (int i = 3; i < n; i++) {
                int next = sc.nextInt();
                if (next - last != offset) {
                    return last + offset;
                } else {
                    last = next;
                }
            }
        } else {

            if (b - a > c - b) return a + (c - b);
            else return b + (b - a);
        }
    }
}