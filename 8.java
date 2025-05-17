class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.isEmpty()){
            return 0;
        }
        if(s.length()==1 && (s.charAt(0)=='-'||s.charAt(0)=='+')){
            return 0;
        }
        long INT_MIN = -2147483648;      // -2^31
        long INT_MAX = 2147483647; 
    
        String clean_string="";
        boolean isNegative=false;
        
        int startindex=0;
        if(s.charAt(startindex)=='-'){
            isNegative=true;
            startindex++;
        }
        if(s.charAt(startindex)=='+'){
            startindex++;
        }
        if(startindex>1){
            return 0;
        }
        int dummyindex=0;
        String finalString="";
        for(;startindex<s.length();startindex++){
            int ascii=s.charAt(startindex);
            if(ascii-48>=0 && ascii-48<=9){
                finalString+=String.valueOf(ascii-48);
            }
            else{
                break;
            }
            // System.out.println(ascii-48);
        }
        // int ascii='9';
        // System.out.println(finalString);
        if(finalString.isEmpty()){
            return 0;
        }
        //0 to 9
        // return 0;
        
        
        for(int j=dummyindex;j<finalString.length();j++){
            if(finalString.charAt(j)!='0'){
                dummyindex=j;
                break;
            }
        }
        // System.out.println(dummyindex);
        long finalresult=0;
        for(;dummyindex<finalString.length();dummyindex++){
            // System.out.println(finalString.charAt(dummyindex));
            int ascii = finalString.charAt(dummyindex);
            int digit = ascii - 48;

            long limit = isNegative ? 2147483648L        
                                    : 2147483647L;       

            if (finalresult > (limit - digit) / 10) {    
                return isNegative ? (int)-2147483648 : (int)2147483647;
            }

            finalresult = finalresult * 10 + digit;


        }
        System.out.println(finalresult);
        long result=finalresult;
        // System.out.println(isNegative);
        if(isNegative){
            result=(-1)*finalresult;
            // System.out.println(result);
            // return result;
        }
        System.out.println("result: "+result);
        if(result<=INT_MIN){
            return (int)INT_MIN;
        }
        if(result>=INT_MAX){
            return (int)INT_MAX;
        }
        
        return (int)result;
    }
}
