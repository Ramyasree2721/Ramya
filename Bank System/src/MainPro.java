import java.util.ArrayList;
import java.util.Scanner;

public class MainPro {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name,city;
		int accno, amt;
		ArrayList<Account> list=new ArrayList<>();
		list.add(new Account("Ramya sree","Warangal",5000));
		list.add(new Account("Shiva kumar","Warangal",10000));
		list.add(new Account("Kavitha","Warangal",8000));
		
		
		System.out.println("Select Operations");
		System.out.println("1. Open Account");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Balance Enquiry");
		System.out.println("5. List All");
		System.out.println("6. Exit");
		int choice;
		boolean found;
		
		do
		{
		
			System.out.print("Enter choice here");
			 choice=sc.nextInt();
			switch(choice) {
			case 1:
				   System.out.println("---- Account open ----");
				   System.out.print("Enter name");
				   name=sc.next();
				   System.out.println("Enter city");
				   city=sc.next();
				   System.out.print("Enter amount");
				   amt=sc.nextInt();
				   Account acc=new Account(name,city,amt);
				   list.add(acc);
				   System.out.println("Account opened..!!");
				   
				   break;
				
			case 2:
				 System.out.println("---- Account Deposit ----");
				 found=false;
				 System.out.print("Enter account no");
				 accno=sc.nextInt();
				 for(Account ac : list) {
					 if(accno==ac.getAccno()) {
						 found=true;
						 System.out.println("Customer Name "+ac.getName());
						 System.out.println("City"+ac.getCity());
						 System.out.println("Account Balance"+ac.getBal());

						 System.out.print("\nEnter amount to deposit");
						 amt=sc.nextInt();
						 ac.setBal(ac.getBal()+amt);
						 System.out.println("Deposit successfully..!!");
						 break;
						 
					 }
				 }
				 
				 if(!found) {
					 System.out.println("Invalid account number");
				 }
				 break;
				 
			
			case 3:
				 System.out.println("---- Account Withdraw  ----");
				 found=false;
				 System.out.print("Enter account no");
				 accno=sc.nextInt();
				 for(Account ac : list) {
					 if(accno==ac.getAccno()) {
						 found=true;
						 System.out.println("Customer Name "+ac.getName());
						 System.out.println("City"+ac.getCity());
						 System.out.println("Account Balance"+ac.getBal());

						 System.out.print("\nEnter amount to Withdraw");
						 amt=sc.nextInt();
						 if(amt<=ac.getBal()) {
						    ac.setBal(ac.getBal()-amt);
						    System.out.println("Withdraw  successfully..!!");
						 }
						 else {
							 System.out.println("Insufficient Balance..!!");
												
						 }
						 break;
						 
					 }
				 }
				 
				 if(!found) {
					 System.out.println("Invalid account number");
				 }
		
				   break;
			case 4:
				 System.out.println("---- Account Balance Enquiry ----");
				 found=false;
				 System.out.print("Enter account no");
				 accno=sc.nextInt();
				 for(Account ac : list) {
					 if(accno==ac.getAccno()) {
						 found=true;
						 System.out.println("Customer Name "+ac.getName());
						 System.out.println("City"+ac.getCity());
						 System.out.println("Account Balance"+ac.getBal());
						 break;
						 
					 }
				 }
				 
				 if(!found) {
					 System.out.println("Invalid account number");
				 }
		
				   break;
			case 5:
				 System.out.println("---- List of All Accounts ----");
				 for(Account ac:list) {
						System.out.println(ac);
				 }
				 
				   break;
			case 6:
				 System.out.println("---- Thanks for visting us ----");
				   break;
			default:
				 System.out.println("---- Invalid choice ----");
				   break;
			}
		}while(choice!=6);
		
		

	}

}
