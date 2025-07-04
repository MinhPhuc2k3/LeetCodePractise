class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer>[] row = new Set[9];
        Set<Integer>[] column = new Set[9];
        Set<Integer>[][] sub_boxes = new Set[3][3];
        for(int i=0; i<9; i++){
            row[i] = new HashSet<>();
            column[i] = new HashSet<>();
        }
        for(int i=0; i<3; i++) for(int j=0; j<3; j++) sub_boxes[i][j]=new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.') continue;
                int number = board[i][j]-'0';
                if(row[i].contains(number)
                    || column[j].contains(number)
                    || sub_boxes[i/3][j/3].contains(number)
                ){
                    return false;
                }
                row[i].add(number);
                column[j].add(number);
                sub_boxes[i/3][j/3].add(number);
            }
        }
        return true;
    }
}