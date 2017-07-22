public class Owl extends Animal {
  protected boolean wise;
 public Owl(String name, int birth, boolean wise){
    super(name,birth);
    this.wise=wise;
  }
 @Override
 public String noise(){return "hoooo";}
 
}
