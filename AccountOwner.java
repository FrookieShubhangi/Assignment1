package BankAccountManagementSystem;

public class AccountOwner {
	String ownerName;
	String accountType;
	String ownerAddressCity;
	String ownerAddressState;
	String ownerAddressPincode;
	double balanceAmount=0.0;
	String accountCreationDate;
	String status;
	public AccountOwner(String name, String accountType, String date, double amount, String status) {
		this.ownerName = name;
		this.accountType = accountType;
		this.accountCreationDate = date;
		this.balanceAmount = amount;
		this.status= status;
	}
}
