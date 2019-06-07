/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 060619 PVHP-CodeGym     **
 *********************************************/
public class GameMineSweeper {
    public static void main(String[] args) {
        String[][] map = {
                {"*", ".", "*", ".", "."}
        };

        final int MAP_WIDTH = map[0].length;

        String[][] mapReport = new String[1][MAP_WIDTH];
        for (int xOrdinate = 0; xOrdinate < map[0].length; xOrdinate++) {
            String curentCell = map[0][xOrdinate];
            if (curentCell.equals("*")) {
                mapReport[0][xOrdinate] = "*";
            } else {
                final int[][] NEIGHBOURS_ORDINATE = {
                        {0, xOrdinate - 1}, {0, xOrdinate + 1}
                };

                int minesAround = 0;
                for (int i = 0; i < NEIGHBOURS_ORDINATE.length; i++) {
                    int[] neighbourOrdinate = NEIGHBOURS_ORDINATE[i];
                    int xOrdinateOfNeighbour = neighbourOrdinate[1];
                    int yOrdinateOfNeighbour = neighbourOrdinate[0];

                    boolean isOutOfMapNeighbour = xOrdinateOfNeighbour < 0 || xOrdinateOfNeighbour == MAP_WIDTH;
                    if (isOutOfMapNeighbour) continue;

                    boolean isMineOwnerNeighbour = map[yOrdinateOfNeighbour][xOrdinateOfNeighbour].equals("*");
                    if (isMineOwnerNeighbour) minesAround++;
                }

                mapReport[0][xOrdinate] = String.valueOf(minesAround);
            }
        }

        for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
            String currentCellReport = mapReport[0][xOrdinate];
            System.out.print(currentCellReport);
        }
    }
}
