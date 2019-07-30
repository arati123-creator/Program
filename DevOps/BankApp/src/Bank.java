
class Bank
{
private int balance;            

private int accnum;             

String custName;                   

String phoneNum;             
String email;
int phonenum;

private int number;

private String custName_phoneNum;


static int last_acct = 0;      




public Bank(String custName, String custName_phoneNum, int initial_balance)
  {
  this.custName = custName;
  this.custName_phoneNum = custName_phoneNum;
  balance = initial_balance;
  number = ++last_acct;
  }



public void deposit(int amount)
  {
  balance += amount;            
  }



public boolean withdraw(int amount)
{
if( amount > balance )
  return false;		
balance -= amount;		
return true;
}



public void statement()
{
System.out.println("Balance in account number " + number + " is " + balance);
}


/**
   Close the account.
**/

public void close()
{
balance = 0;
}



public static void main(String args[])
{

Bank a, b, c;

// create accounts
a = new Bank("Alice", "991",  50);



if( !a.withdraw(5000) )
  {
  System.out.println("Insufficient funds in " + a.number);
  }

if( !a.withdraw(11000) )
  {
  System.out.println("Insufficient funds in " + a.number);
  }

// print statements
a.statement();

}
}


