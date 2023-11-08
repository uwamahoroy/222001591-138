public class continents {
    public void CO(){

        System.out.println("EVERY COUNTY HAS CONTINENTS");
    }
}
interface Africa {
    void show ();
}
class Africans extends continents {
    public void  AF(){
        System.out.println("THE AFRICAN HAS MANY COUNTRY RWANDA.");
    }
}
class Rwanda extends Africans implements Africa{
    public void show (){}
    }

class Family_Africa extends Rwanda {
 public void FAF(){
    System.out.println("AND THEN THEY FORM A FAMILY, A NUCLEAR ONE.");
 }
}
class Output{
    public static void main(String[] args) {
        
    
    Family_Africa family_Africa= new Family_Africa();

    System.out.println();// jump line
    family_Africa.CO();
    family_Africa.AF();
    family_Africa.FAF();
    System.out.println();// jump line
}
}    
