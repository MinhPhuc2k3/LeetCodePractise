class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size = 200;
        StringBuilder common = new StringBuilder("");
        for(int i=0; i<strs.length; i++) size = Math.min(strs[i].length(), size);
        boolean check = false;
        for(int i=0; i<size; i++){
            char tmp  = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(tmp!=strs[j].charAt(i)){
                    check = true;
                }
            }
            if(check) break;
            else common.append(Character.toString(tmp));
        }
        return common.toString();
    }
}