import java.util.*;
public class Main {
    public static void main(String[] args) {

        GameOfLife cell = new GameOfLife();
        int x = 10;
        int y = 10;
        int grid[][] = new int[x][y];

        cell.GameOfLife();
        cell.nextGeneration(x,y,grid);
    }
}
