public class TicTacToe {

    public static void main(String[] args) {
        new TicTacToe();
    }

    public TicTacToe() {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        char player = 'X';

        System.out.println(" 1 2 3");
        System.out.println( "|" + board[0][0] + "|" + board[0][1] + "|"
                + board[0][2] + "|");
        System.out.println("--------");
        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|"
                + board[1][2] + "|");
        System.out.println("--------");
        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|"
                + board[2][2] + "|");
    }
}