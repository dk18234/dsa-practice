import java.util.HashMap;
public class TwoSoom {
    public static int [] TwoSum(int[] nums, int Target){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int complement = Target - nums[i];
            if(map.containsKey(complement)){
            return new int []{map.get(complement), i};
            }
            map.put(nums[i], i);
        }    
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,9,17,32,97};
        int Target = 129;
        int[] result = TwoSum(nums, Target);
        System.out.println(result[0] + ", " + result[1]);
    }
}