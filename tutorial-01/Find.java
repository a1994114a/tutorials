/**
 * Auto Generated Java Class.
 */
public class Find {
  
  
  public static void main(String[] args) { 
    System.out.print("Enter a string:");
    java.util.Scanner input= new java.util.Scanner(System.in);
    String a = input.nextLine();
    System.out.print("Enter a character:");
    char b = input.next().charAt(0);
    System.out.println("The frequency of letters is:");
   
    int counter =0;
    for(int i=0;i<a.length();i++){
      if(a.charAt(i)==b){
      counter +=1;
      }
    }
    System.out.println(counter);
  
  /* ADD YOUR CODE HERE */
  }
}
