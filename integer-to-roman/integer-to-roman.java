class Solution {
    public String intToRoman(int num) {
      String ones[]=new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
      String tens[]=new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
      String hundreds[]=new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
      String thousand[]=new  String[]{"","M","MM","MMM"};
        int th=num/1000;
        int h=num%1000/100;
        int t=num%1000%100/10;
        int o=num%10;
        
        return thousand[th]+ hundreds[h]+ tens[t]+ones[o] ;
    }
}