// Credit Card Lab driver
import java.util.Scanner;

public class CreditCardLabDriver
{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    boolean done = false;

    CreditCard test = new CreditCard();

    while(!done){
      System.out.println("Enter a number to be tested");
      String num1 = in.next();
      if (num1.length() > 16 || num1.length() < 12) done = true;
      String num = "";
      for (int i = num1.length() -1; i >=0; i--){
        num = num + num1.charAt(i);
      }
      System.out.println("Is "+num1+" a valid number? "+ test.verify(num));
      int typeInt = test.findType(num1);
      String[] types = {"none", "Master Card", "Visa", "American Express", "Discover", "Diners Club/ Carte Blanche"};

      System.out.println("Credit card type is: "+ types[typeInt]);
      System.out.println();
      done = true;
    }
  }
}