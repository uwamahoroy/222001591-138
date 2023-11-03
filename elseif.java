public class elseif {
    public static void main(String args[]){  
        int number = 5;
        if (number>10){
            System.out.println("the number is greater than 10");  
        }
        else if (number>5){
           System.out.println("the number is greater than 5 but not greater than 10");    
        }
        else if (number>0){
             System.out.println("the number is positive but not greater than 5"); 
        }
             else if (number<0){
                 System.out.println("the number is negative");
             }
                 else{
                    System.out.println("the number is zero");
                 }
             }  
}