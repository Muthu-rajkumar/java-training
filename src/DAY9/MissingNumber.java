package DAY9;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        int n=6;
        int[] arr={2,3,4,5,6};
        int aSum=0;
        int arSum=0;

        for(int i=0;i<=n;i++){

            aSum=aSum+i;
        }

        for(int i=0;i<arr.length;i++){

            arSum=arSum+arr[i];
        }
        System.out.println(aSum-arSum);
    }

}