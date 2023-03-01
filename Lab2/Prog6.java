import java.util.*;
class Prog6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds : ");
        float w = sc.nextFloat();
        System.out.println("Enter height in inches : ");
        float h = sc.nextFloat();
        double W = ((1/0.45359237)*w);
        double H = ((1/0.0254)*h);
        System.out.println("BMS is : "+(W/(H*H)));
    }
}