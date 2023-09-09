//This is an example of leetcode problem 875. Koko Eating Bananas.
//This java file refers to standard answer(Brute force algorithm makes the result absolutely right).
//You should create a main function to allow homologous input and output, and then import your function to solve the problem.


import java.util.*;
//please be attention to the classname, which should be appliance with the file name.
public class std {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] piles = new int[n];
        for(int i=0;i<n;i++){
                piles[i] = sc.nextInt();
        }
        int h = sc.nextInt();
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int k = high;
        while (low < high) {
            int speed = (high - low) / 2 + low;
            long time = getTime(piles, speed);
            if (time <= h) {
                k = speed;
                high = speed;
            } else {
                low = speed + 1;
            }
        }
        System.out.println(k);
    }
//Don't forget to add the permission modifier static.
    public static long getTime(int[] piles, int speed) {
        long time = 0;
        for (int pile : piles) {
            int curTime = (pile + speed - 1) / speed;
            time += curTime;
        }
        return time;
    }
}

