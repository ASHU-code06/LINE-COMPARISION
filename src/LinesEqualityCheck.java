import java.util.Scanner;

public class LinesEqualityCheck {
    public static void main(String[] args){

        Scanner myinput = new Scanner(System.in);

        System.out.println("Enter x1 and y1 co-ordinate for line 1 ");
        double x1 = myinput.nextDouble();
        double y1 = myinput.nextDouble();

        System.out.println("Enter x2 and y2 co-ordinate for line 1 ");
        double x2 = myinput.nextDouble();
        double y2 = myinput.nextDouble();

        double len1 ;
        len1=Math.sqrt(Math.pow(x1,y1)+Math.pow(x2,y2)) ;
        System.out.println("lenth of line 1 is   "+len1);

        System.out.println("Enter x1 and y1 co-ordinate for line 2 ");
        double a1 = myinput.nextDouble();
        double b1 = myinput.nextDouble();

        System.out.println("Enter x2 and y2 co-ordinate for line 2 ");
        double a2 = myinput.nextDouble();
        double b2 = myinput.nextDouble();

        double len2 ;
        len2=Math.sqrt(Math.pow(a1,b1)+Math.pow(a2,b2)) ;
        System.out.println("lenth of line 2 is   "+len2);

        if(len1==len2){
            System.out.println("The lines are equal");
        } else if (len1>len2) {
            System.out.println("The line1 is greater");
        } else if (len2>len1) {
            System.out.println("The line2 is greater");
        }
    }

}
