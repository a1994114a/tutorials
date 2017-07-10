/**
 * Auto Generated Java Class.
 */
public class Find2 {
  
  
  public static void main(String[] args) { 
    System.out.print("Enter a string:");
    java.util.Scanner input= new java.util.Scanner(System.in);
    String a = input.nextLine();
    String b = a.replaceAll(" ","");
    System.out.println("Frequencies of characters are:");
    for (int k =64; k<=126;k++){
    int counter =0;
    for(int i=0;i<a.length();i++){
      if(a.charAt(i)==(char) k){
      counter +=1;
      }
    }
    if(counter != 0){
    System.out.println("Chracter "+(char) k+" frequency: "+counter);
    }
  }
}
}

