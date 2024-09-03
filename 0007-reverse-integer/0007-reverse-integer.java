class Solution {
    public int reverse(int x) {
       
        int remainder=0;long reverse=0;
        while(x!=0){
            remainder=x%10;
            reverse=reverse*10+remainder;
            x/=10;
        }
         if(reverse<=Math.pow(-2,31)||(reverse>=(Math.pow(2,31)-1)))
        return 0;
        return (int)reverse;
    }
}