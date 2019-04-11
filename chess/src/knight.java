


import chess.*;
import com.sun.rowset.internal.Row;
import java.util.ArrayList;
import java.util.List;


public class knight extends Piece{
   public knight(int row , int coloumn) 
   { super(row,coloumn);
     
       
   }
   public int getRow()
     {
         return square.getRow() ;
     }
   public int getColoumn()
     {
         return square.getColoumn() ;
     }
 @Override 
 public List<Square> legalMoves(  ) 
 {

     
     List<Square> resultList = new ArrayList<Square>();

     
     for(int i=1 ;i<=8;i++)
 {   for(int j=1;j<=8;j++)
 {
     if((square.getRow()+2)==i&& (square.getColoumn()-1)==j)
     {  

         Square s = new Square(i,j);
         resultList.add(s);
         
     }   
      if((square.getRow()+2)==i&& (square.getColoumn()+1)==j)
     { Square s = new Square(i,j);
         resultList.add(s);
     }  
     if((square.getRow()-2)==i&& (square.getColoumn()-1)==j)
     {  Square s = new Square(i,j);
         resultList.add(s);
     }     
     if((square.getRow()-2)==i&& (square.getColoumn()+1)==j)
     {  Square s = new Square(i,j);
         resultList.add(s);
     }   
     if((square.getRow()+1)==i&& (square.getColoumn()-1)==j)
     { Square s = new Square(i,j);
         resultList.add(s);
     }
     if((square.getRow()+1)==i&& (square.getColoumn()+1)==j)
     {  Square s = new Square(i,j);
         resultList.add(s);
     }  
     if((square.getRow()-1)==i&& (square.getColoumn()-1)==j)
     {  Square s = new Square(i,j);
         resultList.add(s);
     }  
     if((square.getRow()-1)==i&& (square.getColoumn()+1)==j)
     {  Square s = new Square(i,j);
         resultList.add(s);
     }  
     
 }  
         }
  return resultList;
 }
 
 
}
