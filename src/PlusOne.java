public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int[] result;
        int len = digits.length;
        int f = 0;
        digits[digits.length-1]=(digits[digits.length-1]+1)%10;
        if(digits[digits.length-1] == 0) f=1;
        while(len-- > 0){
            if(digits[len]==0 && len!=0&& f==1){
                //需要进位
                digits[len-1]=(digits[len-1]+1)%10;
                if(digits[len-1]==0) f=1;
                else f=0;
            }
        }
        if(digits[0]==0){
            result = new int[digits.length+1];
            result[0] = 1;
            int i = 1;
            while(i<=digits.length){
                result[i]=digits[i-1];
                i++;
            }
        }else{
            result=new int[digits.length];
            int i= 0;
            while (i<digits.length){
                result[i] = digits[i];
                i++;
            }
        }
        return result;
    }
    public static void main(String[] srgc){
        int[] d = {9,9,9};
        int[] t = plusOne(d);
        for (int i:t
             ) {
            System.out.print(i);
        }
    }
}
