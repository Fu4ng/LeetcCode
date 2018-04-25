public class PlusOne {
    public static int[] plusOne(int[] digits) {
        long  temp = 0;
        int [] result;
        if(digits[0]==0){
            result =new int[1];
            result[0]=1;
            return result;
        }
        int len = digits.length-1;
        while(len>=0){
            temp+=(long)(digits[digits.length-1-len] * (long)(Math.pow(10,len)));
            len--;
        }
        temp+=1;
        //判断temp位数
        int d = (int)(Math.log10(temp))+1;
        result = new int[d];
        while(d!=0){
            result[result.length-d] = (int)( temp /(long)(Math.pow(10,(d-1))));
            temp = temp % (long)(Math.pow(10,(d-1)));
            d--;
        }
        return result;
    }
    public static void main(String[] srgc){
        int[] d = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] t = plusOne(d);
        for (int i:t
             ) {
            System.out.print(i);
        }
    }
}
