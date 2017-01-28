/**
 * Created by capt on 23.01.17.
 */
public class Game {
    public String [] [] moveMass( String [] [] massLogic, String [] [] massField) { //Перенос массива логики в массив игрового поля
        for ( int i = 0; i < massLogic.length; i++) {
            for (int j = 0; j < massLogic [i].length; j ++) {
                if (massLogic [i] [j] != "x" & massLogic [i] [j] != "o" )
                    massField [i +i +2] [(j + 1) * 5] = massLogic [i] [j];
            }

        }
        return massField;
    }

    public String [] [] searchFox(String [] [] mass, int y, int x) { //Поиск лис по направлениям
        int num = 0;
        if (mass [y] [x] == "x") {
            mass [y] [x] = "X";
        }
        else {
            //Поиск по горизонтали
            for (int j = 0; j < 10; j++) {
                if (mass [y] [j] == "x" | mass [y] [j] == "X")
                    num++;
                //mass [y] [j] = "!";
            }
            //Поиск по вертикали
            for (int i = 0; i < 10; i++) {
                if (mass [i] [x] == "x" | mass [i] [x] == "X")
                    num++;
                //mass [i] [x] = "!";
            }
            //Поиск по диагонали \
            int iMin1 = y - x;
            int jMin1 = 0;
                if (iMin1 < 0) {
                    iMin1 = 0;
                    jMin1 = x - y;
                }
            int iMax1 = 9 - (x- y);
                if (iMax1 > 9)
                    iMax1 = 9;
            for (int i = iMin1; i < iMax1 + 1; i++) {
                if (mass [i] [jMin1] == "x" | mass [i] [jMin1] == "X")
                    num++;
                //mass [i] [jMin1] = "!";
                jMin1++;
            }

            //Поиск по диагонали /
            int iMin2 = y - (9 - x);
            int jMin2 = 9;
            if (iMin2 < 0) {
                iMin2 = 0;
                jMin2 = x + y;
            }
            int iMax2 = x + y;
            if (iMax2 > 9)
                iMax2 = 9;
            for (int i = iMin2; i < iMax2 + 1; i++) {
                if (mass [i] [jMin2] == "x" | mass [i] [jMin2] == "X")
                    num++;
                //mass [i] [jMin2] = "!";
                jMin2--;
            }

            mass [y] [x] = Integer.toString(num);

        }

        return mass;
    }
}
