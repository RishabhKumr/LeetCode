package Problems;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int tmp =0;
     for(int i =0;i<nums.length;i++)
     {
         if(nums[i] == target)
         {
             tmp = i;
             break;
         }
         else if(nums[i]>target)
         {
            tmp = i;
             break;
         }
         else
         {
             tmp = nums.length;
         }
     }
     return tmp;
    }
}
