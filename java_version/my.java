//This is an example of leetcode problem 875. Koko Eating Bananas.
//This java file refers to your solution.
//You should create a main function to allow homologous input and output, and then import your function to solve the problem.


import java.util.*;
//please be attention to the classname, which should be appliance with the file name.
public class my{
	//Don't forget to add the permission modifier static.
        public static boolean check(int[] piles,int h,int mid){
                int sum = 0;
                for(int c:piles){
                        sum+=c%mid==0?c/mid:c/mid+1;
                }
                return sum>h?true:false;
        }
	//Don't forget to add the permission modifier static.
        public static int minEatingSpeed(int[] piles,int h){
                int max = Integer.MIN_VALUE;
                int sum = 0;
                for(int c:piles){
                        if(c>max){
                                max = c;
                        }
                        sum+=c;
                }
                int left = 0;
                int right = max;
                while(left<=right){
                        int mid = right+(left-right)/2;
                        if(check(piles,h,mid)){
                                left = mid+1;
                        }else{
                                right = mid-1;
                        }
                }
                return left;
        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] piles = new int[n];
                for(int i=0;i<n;i++){
                        piles[i] = sc.nextInt();
                }
                int h = sc.nextInt();
                System.out.println(minEatingSpeed(piles,h));
        }
}
