/*
 * Name: Madhu Sharma
 * Date Completed: 9/11/2020
 * Period:5
 */

/**
 * Interface grouping for ChessPieces
 */ 
public interface ChessPiece 
{
  /*
  Create a constant called CHESSBOARDSIZE that represent the size,
  both number of rows and columns on a chess board.
  Use this constant in the classes in the isValidNextMove method.
  */
  public static final int CHESSBOARDSIZE = 8;
  public static final int CHESSBOARDMIN = 0;
  
  /**
   * The getName method returns the name of the chesspiece as a String.
   * @return name of the chesspiece as a String
   */  
  public abstract String getName();

  
  /**
   * The getColor method returns the color of the chesspiece as a String.
   * @return color of the chesspiece as a String
   */ 
  public abstract String getColor();

  
  /**
   * The getRow method returns the current row location of the chesspiece.
   * @return the current row location of the chesspiece
   */  
  public abstract int getRow();
  
  
  /**
   * The getCol method returns the current column location of the chesspiece.
   * @return the current column location of the chesspiece
   */
  public abstract int getCol();
  
  
  /**
   * Given the next row and column location, the isValidNextMove method returns true if
   * the next row and column location is a valid next move for this chesspiece 
   * based on the current row and column.  Otherwise, it will return false
   * as it is not a valid next move.
   * @param nextRow the row of the next move
   * @param nextCol the column of the next move
   * @return true if the next row and column location is a valid next move based on the current row and column; Otherwise false
   */
  public abstract boolean isValidNextMove(int nextRow, int nextCol);
  
}
