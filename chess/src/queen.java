/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import chess.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class queen extends Piece {
    public queen(int row , int coloumn) 
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

         for(int i=0 ;i<=8;i++)
 {   for(int j=0;j<=8;j++)
 {  for(int x=1 ; x<8;x++)
 {
     if((square.getRow()+x)==i&& (square.getColoumn()+x)==j)
     {   Square s = new Square(i,j);
         resultList.add(s);
     }   
 }
 for(int x=1 ; x<8;x++)
 {
      if((square.getRow()-x)==i&& (square.getColoumn()-x)==j)
     {  Square s = new Square(i,j);
         resultList.add(s);
     }  
 }
 for(int x=1 ; x<8;x++)
 {
     if((square.getRow()+x)==i&& (square.getColoumn()-x)==j)
     {  Square s = new Square(i,j);
         resultList.add(s);
     }
 } 
 for(int x=1 ; x<8;x++)
 {
 if((square.getRow()-x)==i&& (square.getColoumn()+x)==j)
     {  Square s = new Square(i,j);
         resultList.add(s);
     }
 
 
 }
 }  
         }
     for(int i=1 ;i<=8;i++)
 {   for(int j=1;j<=8;j++)
 {
     if((square.getRow())==i&&( (square.getColoumn())!=j)&& square.getColoumn()>=1 && square.getColoumn()<=8)
     {  

         Square s = new Square(i,j);
         resultList.add(s);
         
     }   
      if((square.getRow())!=i&&( (square.getColoumn())==j)&& square.getRow()>=1 && square.getRow()<=8)
     { Square s = new Square(i,j);
         resultList.add(s);
     }  
     
    
     
 }  
         }
  return resultList;
 }
 

    
}
