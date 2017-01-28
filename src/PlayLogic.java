/**
 * Created by capt on 23.01.17.
 */
public class PlayLogic {
    String [] [] logic = {                               //Массив логики
            {"o","o","o","o","o","o","o","o","o","o"},
            {"o","o","o","o","o","o","o","o","o","o"},
            {"o","o","o","o","o","o","o","o","o","o"},
            {"o","o","o","o","o","o","o","o","o","o"},
            {"o","o","o","o","o","o","o","o","o","o"},
            {"o","o","o","o","o","o","o","o","o","o"},
            {"o","o","o","o","o","o","o","o","o","o"},
            {"o","o","o","o","o","o","o","o","o","o"},
            {"o","o","o","o","o","o","o","o","o","o"},
            {"o","o","o","o","o","o","o","o","o","o"}
            };
    public String [] [] massRandom(String [] [] mass) { //Случайное заполнение массива логики лисами
       for (int i = 0; i < 7; i++) {
           mass [(int)(Math.random() * 9) + 1] [(int)(Math.random() * 9) + 1] = "x";
       }
       return mass;
    }

}
