class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int[][] arr = new int[numRows][s.length()];
        int k=0;
        for(int j=0; j<s.length(); j++){
            if(j%2==0){
                for(int i=0; i<numRows; i++){
                    arr[i][j] = s.charAt(k);
                    k++;
                    if(k==s.length()) break;
                }
            }else{
                for(int i=numRows-2; i>=1; i--){
                    arr[i][j] = s.charAt(k);
                    k++;
                    if(k==s.length()) break;
                }
            }
            if(k==s.length()) break;
        }
        String res = "";
        for(int i=0; i<numRows; i++){
            for(int j=0; j<s.length(); j++){
                if(arr[i][j]!=0){
                    res += Character.toString((char) arr[i][j]);
                }
            }
        }
        return res;
    }
}