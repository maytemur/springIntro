package springIntro;

public class MsSqlCustomerDal implements ICustomerDal {
	String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("Coonection String : " + this.connectionString);
		System.out.println("Microsoft Sql Veritabanına Eklendi");
		
	}

}
