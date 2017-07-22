public class Cat extends Animal{
  public Cat(String name, int birth){
    super(name,birth);
  }
  @Override
  public String noise(){
    int a=rand(0,1);
    if(a==0){return "meow";}else{return "prrr";}
  }
}