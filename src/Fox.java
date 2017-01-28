/**
 * Created by capt on 22.01.17.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;
public class Fox {
    public static void main (String [] args) throws Exception {

        PlayField pole = new PlayField();
        PlayLogic play = new PlayLogic();
        Game game = new Game();

        String [] [] massField = pole.massPlayField();
        String [] [] massLogic  = play.massRandom(play.logic);

        //pole.printPlayField(mass);
        play.massPrint(massLogic);
        massField = game.moveMass(massLogic, massField);
        pole.printPlayField(massField);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isExit = false;
        while (!isExit) {
            System.out.println("Введите координаты поля в виде yx или exit для выхода : ");
            String yx = reader.readLine();
            isExit = yx.equals("exit");
            if (yx.length() == 2) {
                //System.out.println(yx.substring(0,0));
                int y = Integer.parseInt(yx.substring(0, 1));
                int x = Integer.parseInt(yx.substring(1, 2));

                massLogic = game.searchFox(massLogic, y, x);
                pole.printPlayField(game.moveMass(massLogic, massField));
                //play.massPrint(massLogic);


            }
            else if (!isExit)
                System.out.println("Неправильно ввели координаты!");

        }


    }
}
