class Solution {

int result[];

    public static void main(String[] args) {
        int arr[]={0,1,1,1,1,2,5,6,2,2,2,2,7,7,7,8,5,8,5,8,5,9,6,9,6};
        containsDuplicate(arr);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }


    public boolean containsDuplicate(int[] nums) {
        int len=nums.length;
        result=new int[len];
        Arrays.sort(nums);
        for(int i=0;i<len-1;i++){
            if(nums[i]!=nums[i+1])
              result[i]=nums[i];
        }
        return result;
    }
}

