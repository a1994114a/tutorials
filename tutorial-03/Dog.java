public class Dog extends Animal{
   public Dog(String name, int birth){
    super(name,birth);
  }
   @Override
  public String noise(){
    int a=rand(0,1);
    if(a==0){return "woof";}else{return "grrr";}
  }
}