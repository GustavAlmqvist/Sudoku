private boolean solver(int[][] board) {
    for (int row=BOARD_START; row<BOARD_SIZE; row++){
        for (int column=BOARD_START; column<BOARD_SIZE; column++){
            if (board[row][column] == NO_VALUE){
                for (int k=0; k<10; k++){ //Use MIN & MAX_VALUE INSTEAD?
                    board[row][column] = k;
                    if (Valid(board, row, column) && solver(board)) return true;
                    board[row][column] = NO_VALUE;
                }
            }
            return false;
        }
    }
    return true;
};