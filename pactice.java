import java.util.stream.*;


public class pactice{
    
    
    public static void main(String[] args) {
        
        int count = 0;
        
        int sum = 0;

        
        
        int[] years = new int[8];
        
        years [0] = 2000;
        years [1] = 2018;
        years [2] = 1990;
        years [3] = 1980;
        years [4] = 1970;
        years [5] = 1960;
        years [6] = 1950;
        years [7] = 1940;
        
        
        for(int i = 0; i < years.length; i++) {
            
        
              if(years[i] < 2018) { 
                   
                count++;
                
            }
        }
                sum +=count;     
           
            
            
                System.out.println(sum);
          
            

                     
            }  
                
            }
      

 
