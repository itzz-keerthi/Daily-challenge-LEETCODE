class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs);
        String target=strs[0];
        String cmnprefix="";
        for(int i=1;i<strs.length;i++){
            cmnprefix=commonprefix(target,strs[i]);
        }
        return cmnprefix;
        /*for(int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }*/
        //return "he";
    }
    public String commonprefix(String target,String check){
        int i=0;
        int len=Math.min(target.length(),check.length());

        /*String firststr=target;
        String secondstr=check;
        if(target.length()>check.length()){
            firststr=check;
            secondstr=target;
        }*/
        String result="";
        while(i<len){
            if(target.charAt(i)==check.charAt(i)){
                result+=target.charAt(i);
            }
            else{
                break;
            }
            i++;
        }

        /*HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<target.length();i++){
            if(!map.containsKey(target.charAt(i))){
                map.put(target.charAt(i),1);
            }
            else{
                int val=map.get(target.charAt(i));
                map.put(target.charAt(i),val+1);
            }
        }
        //c:1 i:1 r:1
        for(int j=0;j<check.length();j++){
            if(map.containsKey(check.charAt(j))){
                result+=check.charAt(j);
                int freq=map.get(check.charAt(j));
                map.put(check.charAt(j),freq-1);
            }
        }*/
        return result;
    }
}
