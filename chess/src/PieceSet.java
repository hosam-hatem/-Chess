/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pcq
 */
public class PieceSet {
  
    String colour;
    Piece[] listOfPieces = new Piece[16];
  private void makeListOfPieces()
  {
 for(int i=1;i<=8;i++)
   {
       listOfPieces[i]= new pawn(2,i);
   }
  } 
}