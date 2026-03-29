public class Duplicate{
public static boolean containsDuplicate(int[] nums){
    for (int i=0;i<nums.length; i++){
        for (int j=i+1;j<nums.length; j++){
            if (nums[i]==nums[j]){
                return true;
            }
        }
    }
    return false;
}

public static void main(String args[]){

    int[] nums = {90,67,89,34,24,127,67};
    boolean result = containsDuplicate(nums);
    System.out.println(result);

}
}