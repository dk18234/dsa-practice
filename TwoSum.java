public class TwoSum{
public static int[] twoSum(int[] nums, int target){
    int left =0;
    int right = nums.length -1;
    while(left<right){

        int sum = nums[left]+ nums[right];

        if (sum < target){
            left++;
        }
        else if (sum > target) {
            right--;
        }
        else{
            return new int[] {left, right};
        }
    }
    return new int[]{-1, -1};
}
    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 6, 10, 12};
        int target = 16;
    
        int[] result = twoSum(nums, target);
    
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

}