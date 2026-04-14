public class remDuplicates {

    public static int removeDuplicates(int[] nums){

        int i=0;

        for(int j=1 ; j<nums.length; j++){
            if (nums[i]!= nums[j]){
                i++;
                nums[i]= nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,6,7,7,8,8,9,10,12,14,16,17};

        int result = removeDuplicates(nums);

        System.out.println("Count :" + result);

        for(int k=0;k<result;k++){
            System.out.println(nums[k] + " ");
        }

    }

}
