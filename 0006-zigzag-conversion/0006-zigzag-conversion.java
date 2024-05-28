class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int step = 2*numRows-2;
        StringBuilder res = new StringBuilder("");
        int ne = -1;
        for(int row = 0; row<numRows; row++){
            if(row==0 || row==numRows-1){
                for(int i=row; i<s.length(); i+=step){
                    res.append(s.charAt(i));
                }
            }else{
                for(int i=row,x = ne; i<s.length()||x<s.length(); i+=step){
                    if(x>0 && x<s.length()){
                        res.append(s.charAt(x));
                    }
                    if(i>0 && i<s.length()){
                        res.append(s.charAt(i));
                    }
                    x+=step;
                }
                ne--;
            }
        }
        return res.toString();
    }
}