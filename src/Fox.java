/**
 * Created by capt on 22.01.17.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;
public class Fox {
    public static void main (String [] args) throws Exception {

        PlayField pole = new PlayField(); //Создаём объекты классов!!!!!!!!!!!!!!!
        PlayLogic play = new PlayLogic();
        Game game = new Game();

        String [] [] massField = pole.massPlayField();          //Массив игрового поля
        String [] [] massLogic  = play.massRandom(play.logic);  //Массив логики

        pole.printPlayField(massField); //Выводим на экран игровое поле - пока пустое

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Ввод с клавиатуры

        int num = 1;
        int numX = 0;
        boolean isExit = false;
        while (!isExit) {               //Организуем игровой цикл (пока isExit не будет равняться "exit")
            System.out.println("Введите координаты поля в виде yx или exit для выхода : ");
            String yx = reader.readLine();
            isExit = yx.equals("exit");
            if (yx.length() == 2) {     //Определяем, что ввели то-что нужно

                int y = Integer.parseInt(yx.substring(0, 1)); //Первый символ строки в число
                int x = Integer.parseInt(yx.substring(1, 2)); //Второй символ строки в число

                massLogic = game.searchFox(massLogic, y, x, 0);  //В массив логики число лис в заданных координатах
                if (massLogic [y] [x].equals("0"))
                    massLogic = game.searchFox(massLogic, y, x, 1);

                if (massLogic [y] [x].equals("X"))
                    numX++;

                pole.printPlayField(game.moveMass(massLogic, massField)); //Печатаем игровое поле

                System.out.println("Число ходов: " + num++ + "     Колличество найденных лис: " + numX);

            }
            else if (!isExit)
                System.out.println("Неправильно ввели координаты!");

        }

    }
}
