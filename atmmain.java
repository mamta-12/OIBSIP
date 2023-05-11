import java.util.*;
class ATM
{
int user_id,user_pin;
int balance,deposit_amt,withdraw_amt,tbalance,trans_amt;
int  receiver;
ATM(int balance)
{
this.balance=balance;
}

void getdata()
{
Scanner sc=new Scanner(System.in);
{
System.out.print("Please enter your User ID:");
user_id=sc.nextInt();
if(user_id==1001)
{
System.out.println("Valid User ID");
}
else
{
System.out.print("Please enter  valid User ID:");
System.exit(0);
}
}
{
System.out.print("Please enter your PIN:");
user_pin=sc.nextInt();
if(user_pin==400)
{
System.out.println(" Valid User PIN");
}
else
{
System.out.print("Please enter  valid User PIN:");
System.exit(0);
}
}
}
void intial_balance()
{
System.out.println("The Initial balance is :"+balance);
}
void deposit()
{
System.out.print("Please enter  the amount to be deposit:");
Scanner sc=new Scanner(System.in);
deposit_amt=sc.nextInt();
balance=balance+deposit_amt;
System.out.println("The amount after deposit is :"+balance);
System.out.println("................................");
}
void withdraw()
{
System.out.print("Please enter  the amount to be withdraw:");
Scanner sc=new Scanner(System.in);
withdraw_amt=sc.nextInt();
balance=balance-withdraw_amt;
System.out.println("The amount after withdraw is :"+balance);
System.out.println("................................");
}


void transaction_history()
{
System.out.println("The Initial balance is :"+balance);
System.out.println("The  Withdraw Amount:"+withdraw_amt);
System.out.println("The  Deposited Amount :"+deposit_amt);
System.out.println("The Transfer  Amount :"+trans_amt);
System.out.println("The  Amount after transaction is :"+balance);
}
void transfer()
{
System.out.println("Please enter the User ID to whom you transfer:");
Scanner sc=new Scanner(System.in);
receiver=sc.nextInt();
System.out.println("The User ID to whom money is transfer:"+ receiver);
System.out.println(".................................");

System.out.println("Please enter the amount you want to transfer:");
trans_amt=sc.nextInt();
System.out.println("The amount to be transfer :"+trans_amt);
System.out.println(".................................");

balance=balance-trans_amt;
System.out.println("The amount after transfer is  :"+balance);
System.out.println(".................................");

}


}




class atmmain
{
public static void main(String args[])
{
ATM a=new ATM(5000);
while(true)
{
System.out.println("------------ATM Machine-----------");
System.out.println("1.Getdata");
System.out.println("2.Deposit");
System.out.println("3.Withdraw");
System.out.println("4.Transfer");
System.out.println("5.Transaction History");
System.out.println("6.Intial Balance");
System.out.println("7.Exit");

Scanner sc=new Scanner(System.in);
int op=sc.nextInt();
switch(op)
{
case 1: a.getdata();
break;
case 2: a.deposit();
break;
case 3: a.withdraw();
break;
case 4: a.transfer();
break;
case 5: a.transaction_history();
break;
case 6:a. intial_balance();
break;
case 7:System.exit(0);
}
}
}
}

