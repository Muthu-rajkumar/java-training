package DAY16.CLASSTASK;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] args){
        ArrayList<Integer>nums = new ArrayList<Integer>();
        ArrayList<Integer>num1 = new ArrayList<Integer>();
        nums.add(4);
        nums.add(5);
        num1.add(2);
        num1.add(3);
        nums.remove(0);
        nums.addAll(num1);
        System.out.println(nums);
    }
}