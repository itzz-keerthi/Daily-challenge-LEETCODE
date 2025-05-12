/*
  BRUTE FORCE APPROACH
*/

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i:digits){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                int val=map.get(i);
                val++;
                map.put(i,val);
            }
        }
        System.out.println(map);
        for(int i=100;i<1000;i=i+2){
            ArrayList<Integer> arr=new ArrayList<>();
            HashMap<Integer,Integer> dummymap=new HashMap<>();
            dummymap.putAll(map);
            int n=i;
            while(n>0){
                int rem=n%10;
                arr.add(rem);
                n=n/10;
            }
            boolean hasOne=false;
            boolean hasTwo=false; 
            boolean hasThree=false;
            if(dummymap.containsKey(arr.get(0)) && dummymap.get(arr.get(0))!=0){
                hasOne=true;
                int val=dummymap.get(arr.get(0));
                val--;
                dummymap.put(arr.get(0),val);
            }
            if(dummymap.containsKey(arr.get(1)) && dummymap.get(arr.get(1))!=0){
                hasTwo=true;
                int val=dummymap.get(arr.get(1));
                val--;
                dummymap.put(arr.get(1),val);
            }
            if(dummymap.containsKey(arr.get(2)) && dummymap.get(arr.get(2))!=0){
                hasThree=true;
                int val=dummymap.get(arr.get(2));
                val--;
                dummymap.put(arr.get(2),val);
            }
            if(hasOne && hasTwo && hasThree){
                // System.out.println(i);
                res.add(i);
            }

            // System.out.println(arr);
        }
        // int n=100;
        // System.out.println(res);
        int[] output = res.stream().mapToInt(Integer::intValue).toArray();
        return output;
    }
}
