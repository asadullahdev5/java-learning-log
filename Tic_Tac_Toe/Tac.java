import java.util.Scanner;
public class Tac{

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static char currentPlayer = 'X';

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            printBoard();

            System.out.println("Player " + currentPlayer + "'s Turn");

            System.out.print("Enter row (0-2): ");
            int row = input.nextInt();

            System.out.print("Enter column (0-2): ");
            int col = input.nextInt();

            if (!isValidMove(row, col)) {
                System.out.println("Invalid Move! Try Again.");
                continue;
            }

            board[row][col] = currentPlayer;

            if (checkWin()) {
                printBoard();
                System.out.println("🎉 Player " + currentPlayer + " Wins!");
                break;
            }

            if (checkDraw()) {
                printBoard();
                System.out.println("🤝 Match Draw!");
                break;
            }

            switchPlayer();
        }

        input.close();
    }

    public static void printBoard() {
        System.out.println();

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static boolean isValidMove(int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        return board[row][col] == '-';
    }

    public static void switchPlayer() {

        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public static boolean checkWin() {

        // Rows
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == currentPlayer &&
                board[i][1] == currentPlayer &&
                board[i][2] == currentPlayer) {

                return true;
            }
        }

        // Columns
        for (int i = 0; i < 3; i++) {

            if (board[0][i] == currentPlayer &&
                board[1][i] == currentPlayer &&
                board[2][i] == currentPlayer) {

                return true;
            }
        }

        // Main Diagonal
        if (board[0][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer) {

            return true;
        }

        // Secondary Diagonal
        if (board[0][2] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer) {

            return true;
        }

        return false;
    }

    public static boolean checkDraw() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        return true;
    }
}