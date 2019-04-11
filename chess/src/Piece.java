
import java.util.List;

public abstract class Piece {
    int id;
  protected  static int count =1;
  protected   Square square ;
  protected    String colour ;
  
  public Piece(int row , int coloumn){
        id=count++;
        this.square.setRow(row);
     this.square.setColoumn(coloumn);
            }
  
    public abstract List<Square> legalMoves(  ) ;
    public  void setPosition(Square square)
    {
         
 
     this.square.setRow  (square.getRow());
     this.square.setColoumn(square.getColoumn());
 
    }
       
}
