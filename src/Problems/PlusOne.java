package Problems;

import java.math.BigInteger;
class PlusOne{
    String str = "";
    public int[] plusOne(int[] digits) {
        for(int i =0;i<digits.length;i++)
        {
            str += String.valueOf(digits[i]);
        }
        BigInteger big = new BigInteger(str);
        BigInteger big1 = new BigInteger("1");
        BigInteger sum = big.add(big1);
        String newStr = String.valueOf(sum);
        String[] str1 = newStr.split("");
        int[] arr = new int[str1.length];
        for(int i =0;i < str1.length;i++)
        {
            arr[i] = Integer.parseInt(str1[i]);
        }
        return arr;
    }
}