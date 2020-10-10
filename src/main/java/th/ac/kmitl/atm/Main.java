package th.ac.kmitl.atm;

public class Main {
    public static void main(String[] args) {

        DataSourceDB dataSourceDB = new DataSourceDB();
        DataSourceFile dataSourceFile = new DataSourceFile();
        Bank myBank =new Bank("My Bank ",new DataSourceWepAPI());
        //Bank yourBank =new Bank("Your Bank ",dataSourceFile);

        ATM atm = new ATM(myBank);

        String   name = atm.validateCustomer(2,2345);
        System.out.println( name + " has "+ atm.getBalance());
        atm.withdraw(200);
        System.out.println( name + " has "+ atm.getBalance());

    }
        }



