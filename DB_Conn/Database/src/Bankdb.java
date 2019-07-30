import java.util.Scanner;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;

import java.util.Date;

public class Bankdb {

public static void main(String[] args) 

{
    int pinno=0;
    int amount=0;

    int menu;
    int withdraw;
    int transfer=0;
    int update=0;

    Date date =  new Date();

    Connection con = null;

    String url = "jdbc:mysql://localhost:3306/";

    String db = "CLIENT";

    String driver = "com.mysql.jdbc.Driver";

    String user = "root";

    String pass = "";
    int idno[] = {2700,2702,2703,2704,2705,2706,2707,2708,2709,2710,2711,2712};

    Scanner scan = new Scanner(System.in);

    try
    {
        Class.forName(driver);

        con = DriverManager.getConnection(url + db, user, pass);

        System.out.println(date);
        System.out.println("\t"+"Menu"+"\n");
        System.out.println("1. Deposit Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Display Information");
        System.out.println("4. Transfer Amount ");
        System.out.println("5. Exit");

        boolean quit = false;

        do 

        {

                System.out.print("Please enter your choice: ");

                menu = scan.nextInt();

                switch (menu)

                {

                case 1:                                         //.......DEPOSIT .........//    

                    System.out.println("Enter PIN number : ");  
                    pinno =  scan.nextInt();
                    Statement st1  = con.createStatement();
                    ResultSet res1 = st1.executeQuery("SELECT balance from CLIENT.bank where idno=2701");
                    if(pinno==idno[0])

                    {
                        while (res1.next()) 
                        {
                            System.out.printf("Current Balance  : "+"%,d"+"\n",res1.getInt(1));

                            amount=res1.getInt(1);


                        }
                        System.out.println("");
                        System.out.println("Enter deposit amount : ");
                        withdraw = scan.nextInt();

                        amount = amount + withdraw;
                        System.out.printf("Available balance : "+"%,d"+"\n" ,amount);
                        st1.executeUpdate("update bank set balance='"+amount+"' where idno=2701");
                    }

                        break;




                case 2:                                         

                    //...............................WITHDRAW.........//


                    Statement st2  = con.createStatement();
                    ResultSet res2 = st2.executeQuery("SELECT balance from CLIENT.bank where idno=2701");
                    System.out.println("Enter PIN number : ");  
                    pinno =  scan.nextInt();


                    if(pinno==idno[0])

                    {
                        while (res2.next()) 
                        {

                            System.out.printf("Current Balance  : "+"%,d"+"\n",res2.getInt(1));

                            amount=res2.getInt(1);
                        }

                        System.out.println("");
                        System.out.println("Enter withdraw amount : ");
                        withdraw = scan.nextInt();

                        amount = amount - withdraw;
                        System.out.printf("Available balance : "+"%,d"+"\n" ,amount);
                        st2.executeUpdate("update bank set balance='"+amount+"' where idno=2701");
                    }

                        break;




                case 3:


                    //...............DISPLAY.........//


                    Statement st3  = con.createStatement();
                    ResultSet res3 = st3.executeQuery("SELECT * FROM CLIENT.bank where idno='"+pinno+"' ");
                    System.out.println("Enter PIN number : ");  
                    pinno =  scan.nextInt();

                    if(pinno>=idno[])

                    {
                        while (res3.next()) 
                        {

                        System.out.println(res3.getString(1)+"\t"+res3.getString(2)+"\t"+res3.getString(3)+"\t"+res3.getString(4));
                        }
                    }

                        break;

                case 4: 


                    //.........................TRANSFER.........//


                    Statement st  = con.createStatement();
                    ResultSet res = st.executeQuery("SELECT balance from CLIENT.bank where idno=2701");

                    Statement st4  = con.createStatement();
                    ResultSet res4 = st4.executeQuery("SELECT balance from CLIENT.bank where idno=2707");

                    System.out.println("Enter PIN number : ");  
                    pinno =  scan.nextInt();


                    if(pinno==idno[0])

                    {
                        while (res.next()) 
                        {

                            System.out.printf("Current Balance  : "+"%,d"+"\n",res.getInt(1));

                            transfer=res.getInt(1);
                        }
                        while (res4.next()) 
                        {

                            System.out.printf("Current Balance  : "+"%,d"+"\n",res4.getInt(1));

                            update=res4.getInt(1);
                        }

                        System.out.println("Enter PIN number : ");
                        int pinno1 = scan.nextInt();
                        if(pinno1==idno[6])

                        {



                        System.out.println("Amount to transfer : ");
                        withdraw = scan.nextInt();

                        transfer = transfer - withdraw;

                        update = update + withdraw;

                        System.out.printf("Available balance : "+"%,d"+"\n" ,transfer);
                        st4.executeUpdate("update bank set balance='"+update+"' where idno=2707");
                        st.executeUpdate("update bank set balance='"+transfer+"' where idno=2701");


                    }
                    }

                        break;

                case 5: 
                    System.out.println("Thank You !");

                    quit = true;        //....EXIT...//

                }
        }
        while (!quit);


        con.close();    
    }


    catch (Exception e) 
    {

        System.out.println(e);
     }

}
}               