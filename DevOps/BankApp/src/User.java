import java.util.List;

public class User {

 

    String userName;

    String password;

 

    List<Account> userAccounts;

    //getter setter

    public boolean login(String username, String password) {
		return false;

    }

 

    public boolean logout() {
		return false;

    }

 

  

    public User(Account a, Double amount) {

       // call method of Account here to deposite money

       // call method of Log to log the transition

    }

 

   // other actions.

}

 

// Bank.java

public class Bank {

 

    String nameOfBank;

    List<Account> accounts;

    // getter setter

 

    // Action no 1.

    public boolean createAcccount(Account ac) {

          accounts.add(ac);

    }

}

// common class for handling different accounts

class Account {

    String accountHolderName;

    String accountNumber;

    Double balance;
// getter setter

}

// Example class inheriting Account class to manage different kinds of accounts.

class CurrentAccount {

     Double interestRate;

}

// File Logger.java
public class Logger {


   File logFile;

   public void logError(String message) {

   }

}
