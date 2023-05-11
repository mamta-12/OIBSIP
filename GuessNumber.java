import java.util.Random;
import java.util.Scanner;

class Game
{
 int computer;
 public Game()
{
Random r = new Random();
computer = r.nextInt(100);
System.out.println("Guess the Number Form  1 to 100....");
}
public int computerNum(){
return computer;
}
}
public class GuessNumber
{
static int getInput(){
int n;
System.out.print("Enter the Number: ");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
return n;
}
static void isCorrectNumber(int i, int j){
 if(i==j)
{
System.out.println("Congrats!!You guess the Correct Number:");
}
 else if(i>j)
{
System.out.println("Your Number is Bigger than computer Number:");
}
else 
{
System.out.println("Your Number is Smaller than computer Number:");
}
}
public static void main(String[] args)
{
int n=0,computer=0,itteration=0;
 Game g = new Game();
do
{
n=getInput();
computer = g.computerNum();
isCorrectNumber(n, computer);
itteration++;
}
while (n!=computer);
System.out.println("YOU GUESS Number in "+ itteration+" ITTERATIONS");
}
}