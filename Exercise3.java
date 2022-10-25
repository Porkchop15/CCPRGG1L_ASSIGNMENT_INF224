public class Exercise3 {
    public static void main(String[] args) throws Exception {
  
        char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
    
  
        // WORD 1
        System.out.println("1. WORD 1");
        for (int rows = 0; rows < 4; rows++){
        
            for (int column = 0; column < 4; column++){
                
                if (rows == 0){
                    System.out.print(mdArray[rows][column]);
                    
                }
                else{
                    System.out.print("");
                }
            }
        }
        // WORD 2
        System.out.println("");
        System.out.println("2. WORD 2");
        for (int rows = 0; rows < 4; rows++){

            for (int column = 0; column < 4; column++){
                
                if (rows == 1){
                    System.out.print(mdArray[rows][column]);
                }
                else{
                    System.out.print("");
                }
            }
        }
        
        // WORD 3
        System.out.println("");
        System.out.println("3. WORD 3");
        for (int rows = 0; rows < 4; rows++){

            for (int column = 0; column < 4; column++){
                
                if (rows == 2){
                    System.out.print(mdArray[rows][column]);
                }
                else{
                    System.out.print("");
                }
                    
                
            }
        }
        
        // WORD 4
        System.out.println("");
        System.out.println("4. WORD 4");
        for (int rows = 0; rows < 4; rows++){

            for (int column = 0; column < 4; column++){
                
                if (rows == 3){
                    System.out.print(mdArray[rows][column]);
                    
                }
                else{
                    System.out.print("");
                }
                    
            }
        }
        
        // WORD 5
        System.out.println("");
        System.out.println("5. WORD 5");
        for (int rows = 0; rows < 4; rows++){

            for (int column = 0; column < 4; column++){
                
                if (column == 0){
                    System.out.println(mdArray[rows][column]);
                    
                }
                else{
                    System.out.print("");
                }
                    
            }
        }
      
        // WORD 6
        System.out.println("");
        System.out.println("6. WORD 6");
        for (int rows = 0; rows < 4; rows++){

            for (int column = 0; column < 4; column++){
                
                if (column == 1){
                    System.out.println(mdArray[rows][column]);
                    
                }
                else{
                    System.out.print("");
                }
                    
            }
        }
        
        // WORD 7
        System.out.println("");
        System.out.println("7. WORD 7");
        for (int rows = 0; rows < 4; rows++){

            for (int column = 0; column < 4; column++){
                
                if (column == 2){
                    System.out.println(mdArray[rows][column]);
                    
                }
                else{
                    System.out.print("");
                }
                    
            }
        }
        
        // WORD 8
        System.out.println("");
        System.out.println("8. WORD 8");
        for (int rows = 0; rows < 4; rows++){

            for (int column = 0; column < 4; column++){
                
                if (column == 3){
                    System.out.println(mdArray[rows][column]);
                    
                }
                else{
                    System.out.print("");
                }
                    
            }
        }

        // WORD 9
        System.out.println("");
        System.out.println("9. WORD 9");
        for (int rows = 0; rows < mdArray.length; rows++){
            System.out.println(" ");
            for (int column = 0; column < mdArray.length; column++){

                if (rows == 1 && (column == 1 || column == 2)){
                    System.out.print(" ");
                    
                }
                else if (rows == 2 && (column == 1 || column == 2)){
                    System.out.print(" ");
                   
                }
                else{
                    System.out.print(mdArray[rows][column]);
                }
            
 
            }
        }
        // WORD 10
        System.out.println("");
        System.out.println("10. WORD 10");
        for (int rows = 0; rows < mdArray.length; rows++){
            System.out.println(" ");
            for (int column = 0; column < mdArray.length; column++){

                if (rows == 0 && (column == 1 || column == 2)){
                    System.out.print(" ");  
                }
                else if (rows == 1 && (column == 0 || column == 3)){
                    System.out.print(" ");
                }
                else if (rows == 2 && (column == 0 || column == 3)){
                    System.out.print(" ");
                }
                else if (rows == 3 && (column == 1 || column == 2)){
                    System.out.print(" ");  
                }
                else{
                    System.out.print(mdArray[rows][column]);
                }
            }
        }
        
        
    }
}
               
    
  
