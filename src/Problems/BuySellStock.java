package Problems;

import java.util.Stack;

public class BuySellStock {
	public int maxProfit(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        stack.push(prices[0]);
        int index = 0;
        int diff = 0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i] < stack.peek() && i!=prices.length-1)
            {
                stack.pop();
                stack.push(prices[i]);
            }
            else if(prices[i] > stack.peek() && diff < (prices[i] - stack.peek()))
            {
                diff = prices[i] - stack.peek();
            }
            
        }
        return diff;
	}
}
