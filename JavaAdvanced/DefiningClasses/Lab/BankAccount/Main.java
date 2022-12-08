package JavaAdvance.JavaAdvanced.DefiningClasses.Lab.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccounts = new HashMap<>();

        BiFunction<BankAccount, String[], String> depositeFunction = (d, arr) ->{
            int amount = Integer.parseInt(arr[2]);
            d.deposit(amount);
            return "Deposited" + amount + " to ID" + arr[1];
        };

        BiFunction<BankAccount, String[], String> getInterestFunction = (d, arr) ->{
            int years = Integer.parseInt(arr[2]);
            double interest = d.getInterest(years);
            return String.format("%.2f", interest);
        };

        String input = scanner.nextLine();
        while(!input.equals("End")){
            String[] data = input.split("\\s+");

            String command = data[0];
            if(command.equals("Create")){
                BankAccount bankAc = new BankAccount();
                bankAccounts.put(bankAc.getId(), bankAc);
                System.out.println("Account ID" + bankAc.getId() + " created");

            } else if(command.equals("Deposite")){
                String output = executeOnBankAccount(data, bankAccounts, depositeFunction);
                System.out.println(output);

            } else if(command.equals("GetInterest")){
                String output = executeOnBankAccount(data, bankAccounts, getInterestFunction);
                System.out.println(output);


            } else if(command.equals("SetInterest")){
                double interesetRate = Double.parseDouble(data[1]);
                BankAccount.setInterestRate(interesetRate);
            }

            input = scanner.nextLine();
        }
    }

    private static String executeOnBankAccount(String[] data, Map<Integer, BankAccount> bankAccounts, 
                                            BiFunction<BankAccount, String[], String> depositeFunction) {
        int id = Integer.parseInt(data[1]);
        BankAccount bankAccount = bankAccounts.get(id);

        if(bankAccount == null){
            return "Account does not exist";
        }
        return depositeFunction.apply(bankAccount, data);
    }
}
