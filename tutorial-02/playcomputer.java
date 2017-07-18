//n=14;
//x=14;
//14<200*14 so x=14+14*helper(14)=14+14*2=42
//  42<14*200 so x=42+42*2= 126
//  126<200*14 so x = 126+126*1=252
//  252<2800 so x = 252+252=504
//  504<2800 so x= 504+504=1008
//  1008<2800 so x=1008+1008=2016
//  2016<2800 so x = 2016+2016=4032
//  4032>2800 so while loop ended
//  return helper(4032/10)+helper(14)+14
//         =helper(403)+helper(4032)+14
//         =1+2+14=17
public class playcomputer{
  
  private static int helper(int n){

    if  (n < 10)   {return 3;}
    if  (n < 100) {return 2;}
   return 1;
  }

  private static int mystery(int n){

   int x = n;
   
   while( x < 200*n )
   {x = x + (x * helper(x));System.out.println(x);}
   
   return helper(x/10) + helper(n) + n;
  }
  public static void main(String[] args){
  System.out.println("mystery(14) is "+mystery(14));
  }
}