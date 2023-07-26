import package_graphics.*;
import java.util.*;

public class main_gr{
public static void main(String[] args){
pk_graphics obj = new pk_graphics();
Scanner sc = new Scanner(System.in);
System.out.println("Enter side of square: ");
int s = sc.nextInt();
System.out.println("Enter length and breadth: ");
int l = sc.nextInt();
int b = sc.nextInt();
System.out.println("Area of square: " +obj.sqAr(s));
System.out.println("Area of rectangle: " +obj.reAr(l,b));
}
}

