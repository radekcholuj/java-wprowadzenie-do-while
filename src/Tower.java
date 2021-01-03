public class Tower {
    public static void main(String[] args) {
        int[][] chessboard = new int[8][8];
        int black = 1;
        int white = 4;


        chessboard[0][4] = black;
        chessboard[1][0] = black;
        chessboard[1][1] = black;
        chessboard[1][2] = black;
        chessboard[1][3] = black;
        chessboard[1][7] = black;
        chessboard[2][2] = black;
        chessboard[2][2] = black;
        chessboard[2][6] = black;
        chessboard[3][0] = black;
        chessboard[4][5] = black;
        chessboard[7][2] = black;


        chessboard[4][3] = white;
        chessboard[4][6] = white;
        chessboard[5][2] = white;
        chessboard[5][5] = white;
        chessboard[6][0] = white;
        chessboard[6][1] = white;
        chessboard[6][5] = white;
        chessboard[6][6] = white;
        chessboard[6][7] = white;
        chessboard[7][0] = white;
        chessboard[7][4] = white;
        chessboard[7][7] = white;

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                System.out.print(chessboard[i][j]);
            }
            System.out.println();
        }

        int x = 0, y = 0;
        int xPos = 7;
        int yPos = 4;
        int atackX1 = 0;
        int atackX2 = xPos;
        int atackY1;
        int atackY2 = 0;


        while (x < xPos) {
            if (chessboard[x][yPos] == 1) {
                atackX1 = x;
                if (atackX1 < x) {
                    atackX1 = x;
                }
            }
            x++;
        }
        System.out.println("pionek do zbicia w pionie na pozycji " + atackX1 + " " + yPos);


        x = xPos;
        while (x < chessboard.length) {
            if (chessboard[x][yPos] == 1) {
                atackX2 = x;
            }
            x++;
        }
        if (atackX2 > 0 && atackX2 > xPos) {
            System.out.println("pionek do zbicia w pionie na pozycji " + atackX2 + " " + yPos);
        }


        while (y < yPos) {
            if (chessboard[xPos][y] == 1) {
                atackY1 = y;
                if (atackY1 < y) {
                    atackY1 = y;
                }
                System.out.println("pionek do zbicia w poziomie na pozycji " + xPos + " " + atackY1);
            }
            y++;
        }

        y = yPos + 1;
        while (y > yPos && y < chessboard.length) {
            if (chessboard[xPos][y] == 1) {
                atackY2 = y;
                if (atackY2 < y) {
                    atackY2 = y;
                }
                System.out.println("pionek do zbicia w poziomie na pozycji " + xPos + " " + atackY2);
            }
            y++;
        }

    }
}