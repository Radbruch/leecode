import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[n+1];
        sum[0] = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum[i+1] = arr[i] + sum[i]; // sum[i] 为 nums[0]到nums[i-1]的和（前缀和）
        }


        while (sc.hasNext()) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            System.out.println(sum[R+1] - sum[L]);
        }
    }
}
