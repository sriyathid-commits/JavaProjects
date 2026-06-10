package AdvancedSudokuGame.src;

import java.util.Scanner;

public class Main {
    private static int[][] board = new int[9][9];

    public static void main(String[] args) {
        System.out.println("Advanced Sudoku Game started...");
        Scanner scanner = new Scanner(System.in);

        // Simple demo: place a number in the grid
        System.out.print("Enter row (0-8): ");
        int row = scanner.nextInt();
        System.out.print("Enter column (0-8): ");
        int col = scanner.nextInt();
        System.out.print("Enter number (1-9): ");
        int num = scanner.nextInt();

        board[row][col] = num;
        System.out.println("Number placed!");

        // Display board
        printBoard();

        scanner.close();
    }

    private static void printBoard() {
        System.out.println("Sudoku Board:");
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}
