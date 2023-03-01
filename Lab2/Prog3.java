import java.util.*;
class Prog3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temp. in Fahrenhit : ");
        float F = sc.nextFloat();
        System.out.println("Temp. in Calsius is "+((F-32)*5/9));
    }
}