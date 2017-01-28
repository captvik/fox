/**
 * Created by capt on 23.01.17.
 */
public class PlayLogic {
    String [] [] logic = {
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
    public String [] [] massRandom(String [] [] mass) {
       for (int i = 0; i < 7; i++) {
           mass [(int)(Math.random() * 9) + 1] [(int)(Math.random() * 9) + 1] = "x";
       }
       return mass;
    }
    public void massPrint(String [] [] mass) {
        for ( int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass [i].length; j ++) {
                System.out.print((char)27 + "[31m" +  mass[i][j] +  (char)27 + "[0m");
            }
            System.out.println();
        }
    }
}
