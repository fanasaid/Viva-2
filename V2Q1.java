
package viva2;

import java.util.ArrayList;
import java.util.Scanner;

public class V2Q1 {
        private double balance;
        private final ArrayList<String> transactions;
        // we use private because it can be accessed inside the v2q1 class
        //balance is used to hold user's current balance
        //transactions is a list to stores the history of transactions as strings. initialized as empty arraylist
        
        public V2Q1() {
            this.balance = 1000.00;
            this.transactions = new ArrayList<>();     
            // the constructor is set to 1000, creates an empty arraylist for transactions
        }
        
        public void checkBalance(){
            System.out.printf("Current Balance: RM%.2f%n", balance);
        }
        
        public void deposit(double amount){
            if (amount>0){
                balance += amount;
                transactions.add("Deposited: RM" + String.format("%.2f", amount));
                System.out.printf("Your balance is now: RM%.2f%n", balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
        
        public void withdraw(double amount){
            if (amount>0 && amount<= balance){
                balance -= amount;
                transactions.add("Withdrew: RM"+ String.format("%.2f", amount));
                System.out.printf("Your balance is: RM%.2f%n", balance);
            } else if (amount > balance){
                System.out.println("Insufficient balance.");
            }
        }
        
        public void printTransactions(){
            if(transactions.isEmpty()){
                System.out.println("No transactions yet");
            } else{
                System.out.println("Transaction History:");
                for(String transaction : transactions){
                    System.out.println(transaction);
                }
            }
        }
        // main method allows the user to interact w the banking system
        public static void main(String [] args){   // to create an object 'bank' from clas V2Q1 to access all methods 
            V2Q1 bank = new V2Q1();                // this will call the constructor that initializes the balance and transactions variables
            Scanner sc = new Scanner(System.in);  //"bank" allows to call non static methods
            int choice;
            
            System.out.println("Welcome to the Bank!");
            do{
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. View Transaction History");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");  //prompt the user to select an option and stores it in choice
                choice = sc.nextInt();
                
                switch (choice){
                case 1: 
                     bank.checkBalance(); // the object bank calls the checkBalance method
                     break;
                case 2:
                    System.out.print("Enter amount to deposit: RM");
                    double depositAmount = sc.nextDouble();
                    bank.deposit(depositAmount);
                    break;
                case 3: 
                    System.out.print("Enter amount to withdraw: RM");
                    double withdrawAmount = sc.nextDouble();
                    bank.withdraw(withdrawAmount);
                    break;
                case 4:
                    bank.printTransactions();
                    break;
                case 5:
                    System.out.printf("Thank you for using our banking system! %nYour final balance is: RM%.2f", bank.balance);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    
            }
            } while(choice != 5);
            sc.close();
        }
        
        
    }
    
