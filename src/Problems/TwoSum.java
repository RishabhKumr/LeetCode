package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	 public static int[] twoSum(int[] nums, int target) {
		    Map<Integer,Integer> map = new HashMap<>();
		        for(int i = 0; i < nums.length; i++)
		        {
		            if(map.containsKey(target-nums[i]))
		            {
		                return new int[]{map.get(target - nums[i]),i};
		            }
		            else
		            {
		                map.put(nums[i],i);
		            }
		        }
		        int[] arr = new int[]{-1,-1};
		        return arr;
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4};
		int target = 5;
		int index[] = twoSum(arr,target);
		System.out.println(Arrays.toString(index));

	}

}
