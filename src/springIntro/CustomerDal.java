package springIntro;

public class CustomerDal implements ICustomerDal {
	String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add() {
		System.out.println("Coonection String : " + this.connectionString);
		System.out.println("Oracle Veritabanına Eklendi veya mySql");
	}
}