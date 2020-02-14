import java.util.*;
public class GameOfLife {

    public void GameOfLife(){

        int x = 10, y = 10;

//        i am creating a grid for my element.
        int Grid[][] = {
            {0,0,0,0,0,0,0,0,0,0},
            {1,0,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,0,0},
            {0,0,0,1,1,0,1,0,1,1},
            {0,0,0,1,0,0,0,0,0,1},
            {1,1,1,1,1,0,0,0,1,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1},
            {1,0,1,0,1,0,1,0,1,0},
            {0,1,0,0,1,0,1,0,1,0}
        };

        // condition to display the grid.
        for (int i = 0; i < x ; i++)
        {
            for (int j = 0; j < y ; j++)
            {
                if (Grid[i][j] == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
        System.out.println();
    }

    // public function for the nextGeneration.
    public static void nextGeneration( int x, int y, int grid[][]){


        int aliveNeighbours = 0;
        int [][]futureGeneration = new int[x][y];

        // Looping though every cell in the grid
        for (int n = 0; n < x - 1 ; n++) {

            for (int m = 0; m < y - 1 ; m++) {
                // making sure we find alive neighbours.

                for (int i = -1; i <= 1 ; i++) {
                    for (int j = -1; j <= 1 ; j++) {
                        aliveNeighbours += grid[n + i][m + j];
                        aliveNeighbours -= grid[n][m];
                    }
                    /* Rules of Conway are implemented.
                    cell is alone so it dies.*/
                    if ((grid[n][m] == 1) && (aliveNeighbours < 2)){
                        futureGeneration[n][m] = 0;
                    }
//                    cell dies due to over population.
                    else if ((grid[n][m] == 1) && (aliveNeighbours > 3)){
                        futureGeneration[n][m] = 0;
                    }
//                    cell is resurrect.
                    else if ((grid[n][m] == 0) && (aliveNeighbours == 3)){
                        futureGeneration[n][m] = 1;
                    }
                    else
                    {
                        futureGeneration[n][m] = futureGeneration[n][m];
                    }

                }
            }

        }
        // Displaying The next Generation.
        System.out.println("The Next Generation");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (futureGeneration[x][y] == 0){
                    System.out.println("0");
                }
                else {
                    System.out.println("1");
                }
            }
            System.out.println();
        }
    }
}
