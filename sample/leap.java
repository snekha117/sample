package sample;

public class leap {
  public static void main(String args[])
  {
	  int l=2002;
	  if(l%4==0 && l%100==0 && l%400==0) {
		  System.out.print("the year is leap year");
	  }
	  else
	  {
		  System.out.print("the year is not leap year");
	  }
  }
}
