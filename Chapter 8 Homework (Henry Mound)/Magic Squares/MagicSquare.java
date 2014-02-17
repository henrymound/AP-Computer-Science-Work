public class MagicSquare{

  private int[][] square;
  private int size, row, colomn, lastRow, lastColomn, matrixSize;
  
  public MagicSquare(int s){
  
    size = s;
    square = new int[size][size];
    row = 0;
    colomn = size/2;
    lastRow = row;
    lastColomn = colomn;
    matrixSize = size * size;
    square[row][colomn] = 1;
   
  }

  public void create(){
  
    for(int i = 2; i < matrixSize + 1; i++){
    
      if(row - 1 < 0)
        row = size-1;
      else row--;
      
      if(colomn + 1 == size)
        colomn = 0;
      else colomn++;
      

      if(square[row][colomn] == 0)
        square[row][colomn] = i;
      else{
        row = lastRow;
        colomn = lastColomn;
        if (row + 1 == size)
          row = 0;
        else
          row++;
        square[row][colomn] = i;
      }
      
      lastRow = row;
      lastColomn = colomn;
      
      }

    }
  
  public String toString(){

    String result = "";
    int magicConstant = 0;
    
    for(int i = 0; i < square.length; i++){
      for(int j = 0; j < square[i].length; j++){
         result += " " + square[i][j] + "\t";
      }
      result += "\n";
      magicConstant = magicConstant+ square[i][0];
    }
    return result + "The magic constant is "+magicConstant+".";
  
  }
  
  }
