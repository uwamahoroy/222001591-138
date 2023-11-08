interface Animal {
    void methodAnimal();
}
class cow implements Animal{
    public void eat() {
      System.out.println("grass");
}
 public void methodAnimal() {
      eat();
 }
}
class lion extends cow implements Animal {
    public void walking() {
      System.out.println("move");
    }
 public void methodAnimal() {
      super.methodAnimal();
      walking();
 }
}
class cat extends lion implements Animal {
    public void shout() {
      System.out.println("Be Patience");
    }
    public void methodAnimal() {
      super.methodAnimal();
      shout();
    }
  }
class goat extends cat implements Animal {
    public void providing() {
      System.out.println("Rich");
    }
  
    public void methodAnimal() {
      super.methodAnimal();
      providing();
    }
  }
public class Inheritance2 {
    public static void main(String[] args) {
        goat animal = new goat();
        animal.methodAnimal();
      }
    }  
