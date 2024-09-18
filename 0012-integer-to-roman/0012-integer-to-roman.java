class Solution {
    public String intToRoman(int n) {
        
        String[] ones={"","I","II","III" ,"IV","V","VI","VII","VIII","IX"};
        String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundreds={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousands={"","M","MM","MMM"};
        String ans="";
        ans+=thousands[n/1000];
        ans+=hundreds[(n%1000)/100];
        ans+=tens[(n%100)/10];
        ans+=ones[(n%10)];
        return ans;
    }
}