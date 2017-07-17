public class TheRandomClassOfUtil{
  
  public static void main(String[] args){
  java.util.Random generator = new java.util.Random();
                                                    //a object of class java.util.Random will generate random items of all types
                                                   
    for(int i=0;i<200;i++){
      
//  println(generator.nextDouble());  //same as "Math.random()" and generates a double x such that 0.0<=x<1
//  println(generator.nextInt(5));    //generate random integer x such that 0<=x<n, if n isits input
//  println(generator.nextBoolean()); //generate randome booleans
    }
  }
  private static<K> void println(K args){System.out.println(args);};
  private static<T> void print(T args){System.out.print(args);}
}