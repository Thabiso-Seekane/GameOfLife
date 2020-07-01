import java.util.*;
public class Main {
    public static void main(String[] args) {

        GameOfLife cell = new GameOfLife();
        cell.randomCells();
        cell.print();
        cell.nextGeneration();
        cell.print();
    }
}
