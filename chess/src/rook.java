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
public class rook extends Piece {
     public rook(int row , int coloumn) 
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

