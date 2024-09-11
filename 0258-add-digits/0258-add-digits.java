class Solution {
    public int addDigits(int n) {
        if(n%10==n) return n;
        int a= n%10+addDigits(n/10);
        if(a%10==a) return a;
        return addDigits(a);
    }
}