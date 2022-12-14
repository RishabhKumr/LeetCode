package Problems;

import java.util.Arrays;

public class MajorityElement {
	public int majorityElement(int[] num) {
        if(num.length == 1)
        {
            return num[0];
        }
        else
        {
            Arrays.sort(num);
            return num[num.length / 2];
        }
    }
}
