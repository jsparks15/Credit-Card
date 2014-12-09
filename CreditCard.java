public class CreditCard
{  
  public String verify(String num)
  {
    if (num.length() >= 12 && num.length() <=16) // Only works if the card has correct number of digits
    {
    int a = 0; // temp variables
    int b = 0; // temp variables
    for (int i = num.length()-1; i > -1; i-=2) // Digits that get doubled in the Luhn test
    {
      int evenNum = Integer.parseInt(num.substring(i,i+1));
      int doubleSum = evenNum * 2;
        if (doubleSum > 9) doubleSum = (doubleSum-10)+1;
        a += doubleSum;
    }
    for (int i = num.length()-2; i > -1; i-=2) // Digits that just get added
    {
      int oddNum = Integer.parseInt(num.substring(i, i+1));
      b += oddNum;
    }
    if ((a+b) % 10 == 0) // Add them together and divide by 12. If the remainder is 0 return yes, if not, return no.
    { 
      return "Yes";
    }
    else
      return "No";
  }
    return "No"; // Above is basically the Luhn Test
  }
   private String[] Diners = {"36", "38", "301", "302", "303", "304", "305"}; 
   
 public int findType(String num1) // String to figure out the type of card based on the starting numbers 
 {
    if (num1.substring(0,2).equals("51") || num1.substring(0,2).equals("52") || num1.substring(0,2).equals("53") || num1.substring(0,2).equals("54") || num1.substring(0,2).equals("55")) return 1;
        else if (num1.substring(0,1).equals("4")) return 2;
        else if (num1.substring(0,2).equals("34") || num1.substring(0,2).equals("37")) return 3;
        else if (num1.substring(0,4).equals("6011")) return 4;
        else if (num1.substring(0,2).equals("36") || num1.substring(0,2).equals("38")) return 5;
        else if (num1.substring(0,3).equals("301") || num1.substring(0,3).equals("302") || num1.substring(0,3).equals("303") || num1.substring(0,3).equals("304") || num1.substring(0,3).equals("305")) return 5;
    {
      boolean dinerscard = false; // Set a boolean that determines if the card is a diners card.
      for (String dinernumbers: Diners)
      {
        if (num1.indexOf(dinernumbers) == 0 && num1.length() == 14) return 5; // If the credit card number starts with any of the numbers defined in the array, return the index of Diners card.
      }
        return 0;
    }
      }
}