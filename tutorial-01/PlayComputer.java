/**
 * Auto Generated Java Class.
 */
public class PlayComputer {
  
  
  public static void main(String[] args) { 
    
    int n = 14;
int x = 4;
int y = 9;
   
int count = 0;
for(int i=0; i<x; i+=1){
   if( y + 2*i >= n){
      count += 1;
      y = y - x;
   }else{
      y = y + x;
   }
}
   
System.out.println( count + "," + y);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
