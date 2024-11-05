
    public class Main1 {
        public static void main(String[] args) {
            Bank bank_1 = new Bank("PrivateBank");
            Bank bank_2 = new Bank("Monobank");
            Bank bank_3 = new Bank("OchadBank");

            BankAccount account_1 = new BankAccount("TkacukRostyk", 1500, "UAN", bank_1, "0001");
            BankAccount account_2 = new BankAccount("TkacukRostyk", 100, "USD", bank_1, "0002");

            System.out.println("=======================================");
            System.out.println("Money operation with 1000 UAN from TkacukRostyk to TkacukRostyk in USD:");
            account_1.money_operation(account_2, 1000);
            System.out.println("TkacukRostyk in UAN: " + account_1.getBalance());
            System.out.println("TkacukRostyk in USD: " + account_2.getBalance());
            System.out.println("=======================================");

            BankAccount account_3 = new BankAccount("Napoleon", 10000, "EUR", bank_1, "0003");

            System.out.println("=======================================");
            System.out.println("Money operation with 3000 EUR from Napoleon to TkacukRostyk in USD:");
            account_3.money_operation(account_2, 3000);
            System.out.println("Napoleon in EUR: " + account_3.getBalance());
            System.out.println("TkacukRostyk in USD: " + account_2.getBalance());
            System.out.println("=======================================");

            BankAccount account_4 = new BankAccount("TkacukRostyk", 200, "CAN", bank_2, "0004");

            System.out.println("=======================================");
            System.out.println("Money operation with 100 USD from TkacukRostyk to TkacukRostyk in CAN(another bank):");
            account_2.money_operation(account_4, 100);
            System.out.println("TkacukRostyk in USD: " + account_2.getBalance());
            System.out.println("TkacukRostyk in CAN(another bank): " + account_4.getBalance());
            System.out.println("=======================================");

            BankAccount account_5 = new BankAccount("Napoleon", 5000, "UAN", bank_3, "0005");

            System.out.println("=======================================");
            System.out.println("Money operation with 1000 UAN from Napoleon to TkacukRostyk in CAN(another bank):");
            account_5.money_operation(account_4, 1000);
            System.out.println("Napoleon in UAN: " + account_5.getBalance());
            System.out.println("TkacukRostyk in CAN(another bank): " + account_4.getBalance());
            System.out.println("=======================================");

        }
    }