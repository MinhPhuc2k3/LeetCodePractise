class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int step = 2*numRows-2;
        String res="";
        int ne = -1;
        for(int row = 0; row<numRows; row++){
            if(row==0 || row==numRows-1){
                for(int i=row; i<s.length(); i+=step){
                    res+=Character.toString((char) s.charAt(i));
                }
            }else{
                int x = ne;
                for(int i=row; i<s.length()||x<s.length(); i+=step){
                    if(x>0 && x<s.length()){
                        res+=Character.toString((char) s.charAt(x));
                    }
                    if(i>0 && i<s.length()){
                        res+=Character.toString((char) s.charAt(i));
                    }
                    x+=step;
                }
                ne--;
            }
        }
        return res;
    }
}