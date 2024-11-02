public class Main {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        Player player1 = new Player("Игрок 1", 'X');
        Player player2 = new Player("Игрок 2", 'O');
        Player currentPlayer = player1;

        boolean gameWon = false;

        while (!gameWon) {
            board.displayBoard();
            currentPlayer.makeMove(board);
            gameWon = board.checkWin(currentPlayer.getSymbol());
            if (gameWon) {
                board.displayBoard();
                System.out.println(currentPlayer.getSymbol() + " выиграл!");
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1; // Меняем игрока
        }
    }
}
