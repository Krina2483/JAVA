import java.util.*;
class Prog4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        System.out.println("Percentage is "+((A+B+C+D+E)/5));
    }
}