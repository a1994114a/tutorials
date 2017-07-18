/** basic biased coin flip */

import java.util.Random;

public class Flip{
 
 public static void main(String[] args){
  double bias = 0.5;  // 50% heads, 50% tails
  int amount=100;
  boolean ok = true;
  if(args.length == 2){
   try{
    bias = Double.parseDouble(args[0]);
    amount=Integer.parseInt(args[1]);
   }catch(Exception e){
    System.out.println("command line argument must be a number");
    ok = false;
   }
  }
  if(ok){
   System.out.print("bias is " + bias);
  }
  java.util.Random generator= new java.util.Random();
  String k = "";
  int a=0;
  int b=0;

  for(int i=0;i<amount;i++){
    if(generator.nextDouble()<bias){
      k+="1";// 1 stands for head
      a++;
    }else{
      k+="2";
      b++;
    }
  }
  println("");
  println(a+" heads, "+b+ " tails, bias "+bias);
 }
 private static<K> void println(K args){System.out.println(args);}
 private static<T> void print(T args){System.out.print(args);}
}

