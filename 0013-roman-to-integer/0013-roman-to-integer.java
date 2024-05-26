class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanHash =  new HashMap<>();
        romanHash.put('I',1);
        romanHash.put('V',5);
        romanHash.put('X',10);
        romanHash.put('L',50);
        romanHash.put('C',100);
        romanHash.put('D',500);
        romanHash.put('M',1000);
        int res = 0;
        int prev = 0;
        for(int i=s.length()-1; i>=0; i--){ 
            if(prev>romanHash.get(s.charAt(i))){
                res-=romanHash.get(s.charAt(i));
            }else res+=romanHash.get(s.charAt(i));
            prev = romanHash.get(s.charAt(i));
        }
        return res;
    }
}