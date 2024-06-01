import java.util.*;
	 class Bankaccount{
		private double balance;
			public class Bankaccount(double intialbalance)
			{
				balance=intialbalance;
			}
			
				public double getbalance()
				{
					return balance;
				}
					public void deposit(double amount)
					{
						balance +=amount;
					}
					public double withdraw(double amount)
					{
						if(balance=>amount)
						{
							return true;
						}
						else 
						{
							return false;
						}
					}
					
public class Atminterface
		{
			private Bankaccount account;
			public ATM(BankAccount bankAccount) {
		        account = bankAccount;
		    }

		    public void displayMenu() {
		        System.out.println("ATM Menu:");
		        System.out.println("1. Check Balance");
		        System.out.println("2. Deposit");
		        System.out.println("3. Withdraw");
		        System.out.println("4. Exit");
		    }

		    public void run() {
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            displayMenu();
		            System.out.print("Select an option: ");
		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.println("Your balance: Rs. " + account.getBalance());
		                    break;
		                case 2:
		                    System.out.print("Enter amount to deposit: ");
		                    double depositAmount = scanner.nextDouble();
		                    account.deposit(depositAmount);
		                    System.out.println("Deposit successful. Your balance: Rs. " + account.getBalance());
		                    break;
		                case 3:
		                    System.out.print("Enter amount to withdraw: ");
		                    double withdrawAmount = scanner.nextDouble();
		                    if (account.withdraw(withdrawAmount)) {
		                        System.out.println("Withdrawal successful. Your balance: Rs. " + account.getBalance());
		                    } else {
		                        System.out.println("Insufficient balance.");
		                    }
		                    break;
		                case 4:
		                    System.out.println("Thank you for using the ATM!");
		                    scanner.close();
		                    return;
		                default:
		                    System.out.println("Invalid option. Please select a valid option.");
		            }
		        }
		    }
		}

		public class Main {
		    public static void main(String[] args) {
		        BankAccount userAccount = new BankAccount(1000); // Initial balance
		        ATM atm = new ATM(userAccount);
		        atm.run();
		    }
		}