class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int[][] arr =  new int[numRows][s.length()];
        boolean state = true;
        int row = 0;
        int col = 0;
        for(int i=0; i<s.length(); i++){
            if(state || numRows ==  2){
                arr[row][col] = s.charAt(i);
                row++;
                if(row==numRows) {
                    state=false;
                    row = numRows-2;
                }
            }else{
                arr[row][col] = s.charAt(i);
                row--;
                if(row==0){
                    state=true;
                }
            }
            col++;
        }
        String res = "";
        for(int i=0; i<numRows; i++){
            for(int j=0; j<s.length(); j++){
                if(arr[i][j]!=0){
                    res+=Character.toString((char) arr[i][j]);
                }
                if(res.length()==s.length()){
                    return res;
                }
            }
        }
        return res;
    }
}