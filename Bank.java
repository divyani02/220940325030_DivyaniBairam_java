import java.util.Scanner;
class Bank{
    private String accno;
    private String name;
    private Double balance;

    Scanner KB = new Scanner(System.in);
    void openAccount()
    {
        System.out.println("Enter Account Number :-");
        accno= KB.next();
        System.out.println("Enter Name :-");
        name= KB.next();
        System.out.println("Enter Balance :-");
        balance= KB.nextDouble();
    }

    void showAccount()
    {
        System.out.println(accno + "," + name + "," + balance);
    }

    void deposit()
    {
        Double amt;
        System.out.println("Enter Amount u want to deposit :- ");
        amt = KB.nextDouble();
        balance = balance + amt;
    }

    void withdrawal() {
        Double amt;
        System.out.println("Enter amount u want to withdraw :-");
        amt = KB.nextDouble();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("less balance.. Transcation failed..");
        }
    }

}



