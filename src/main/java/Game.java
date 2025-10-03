import java.util.Scanner;

public class Game {
    private SudokuBoard board;

    public Game(String[] args) {
        board = new SudokuBoard();
        for (String arg : args) {
            String[] parts = arg.split(";");
            String[] coords = parts[0].split(",");
            int x = Integer.parseInt(coords[0]);
            int y = Integer.parseInt(coords[1]);
            int value = Integer.parseInt(parts[1].split(",")[0]);
            boolean fixed = Boolean.parseBoolean(parts[1].split(",")[1]);
            board.setCell(x, y, value, fixed);
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            board.displayBoard();
            System.out.print("Digite x y valor (ou -1 para sair): ");
            int x = scanner.nextInt();
            if (x == -1) break;
            int y = scanner.nextInt();
            int value = scanner.nextInt();
            if (!board.setUserValue(x, y, value)) {
                System.out.println("Celula fixa. Tente novamente.");
            }
        }
        scanner.close();
    }
}

