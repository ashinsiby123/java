import java.util.Scanner;

class aE extends Exception{

public aE(String s){
super(s);
}
}

public class Q3{


public static void main(String[] args){

Scanner sc = new Scanner(System.in);
String u = "abc";
String p = "abc";

System.out.println("Enter password: ");
String un = sc.nextLine();

System.out.println("Enter username: ");
String pw = sc.nextLine();

try{

if(un.equals(u)&&pw.equals(p)){

System.out.println("Successfull");
}
else{
throw new aE("Invalid");
}
}
catch(aE e){
System.out.println("Exception caught " +e);

}




}



}




