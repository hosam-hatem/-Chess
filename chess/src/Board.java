
import java.util.*; 

public class Board {
    //Data

    private PieceSet blackset;
    private PieceSet whiteset;
    List<Square> allsquares = new ArrayList<>();
    List<Square> blacksquares = new ArrayList<>();
    List<Square> whitesquares = new ArrayList<>();
    List<Square> freesquares = new ArrayList<>();

    Board() {          //Methods 
        blackset = new PieceSet();
        whiteset = new PieceSet();
        for (int i = 1; i <= 64; i++) {
            for (int j = 1; j <= 64; j++) {
                Square temp = new Square(i,j);
                allsquares.add(i - 1, temp);
            }
        }
    }

    public void GetBlack() {
        for (int i = 0; i < 64; i++) {
            if (allsquares.get(i).getState() == 'b') {
                blacksquares.add(i - 1, allsquares.get(i));
            }

        }
    }

    public void GetWhite() {
        for (int i = 0; i < 64; i++) {
            if (allsquares.get(i).getState() == 'w') {
                whitesquares.add(i - 1, allsquares.get(i));
            }
        }
    }

    public void GetFree() {
        for (int i = 0; i < 64; i++) {
            if (allsquares.get(i).getState() == 'f') {
                blacksquares.add(i - 1, allsquares.get(i));
            }
        }
    }

}
