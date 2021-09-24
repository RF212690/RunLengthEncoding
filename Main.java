package RunLengthEncoding.java;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner input= new Scanner(System.in);  
  String message = input.next();
  char temp=message.charAt(0);
  int counter=1;  
  String output="";
  for(int i=1;i<message.length();i++)
  {
  if(message.charAt(i)==temp){
    counter=counter+1;
    System.out.println("a");  
  }
  else{
  output=output+counter+temp;
  temp=message.charAt(i);
  counter=1;
   System.out.println("b");  
  }
  }
  output=output+counter+temp;
  int outputLength=output.length();
  int inputLength=message.length();
  System.out.println(output);
  System.out.println("Your input is "+inputLength+" characters long, the output is "+outputLength+" characters long, you saved a total of "+(inputLength-outputLength)+" characters");
  }
}
