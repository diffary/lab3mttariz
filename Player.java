import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public void makeMove(GameBoard board) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.println(name + ", введите строку и столбец (0-2):");
        row = scanner.nextInt();
        col = scanner.nextInt();
        
        while (!board.makeMove(row, col, symbol)) {
            System.out.println("Неверный ход. Попробуйте снова:");
            row = scanner.nextInt();
            col = scanner.nextInt();
        }
    }

    public void displayInfo() {
        System.out.println("Игрок: " + name + ", Символ: " + symbol);
    }

    public char getSymbol() {
        return symbol;
    }
}
