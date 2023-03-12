package springIntro;

public class CustomerManager implements ICustomerService {

	private ICustomerDal musteriDal;

	/*
	 * ICUstomerDal türünde bir customerDal oluşturuyorum, dışarıdan erişimi
	 * engellemek için private yaptık.Daha sonra contextMenu(MouseSağ Menu)-Source
	 * dan generate Constructor using fields diyince aşağıdaki public
	 * CustomerManager class'ını eclipse oluşturuyor.Bu ise CustomerManager
	 * constructor'ında bir customerDal istiyor demek oldu.
	 */
	// Sektörde buna "Constructor Injection" deniyor constructor args ile yaptık
	// genelde bu kullanılıyor
	// birde setter Injection denilen bir tür var -önerilmiyor
	/*
	 * public CustomerManager(ICustomerDal musteriDal) { // super(); //süper
	 * silinebilir this.musteriDal = musteriDal; }
	 */
	// Setter Injection- karşılığı applicationContext.xml'de property olarak eklendi
	// Sektörün %99'u contructor injection kullanıyor♦
	public void setMusteriDal(ICustomerDal musteriDal) {
		this.musteriDal = musteriDal;
	}

	public void add() {
		// CustomerDal customerDal= new CustomerDal();
		musteriDal.add();
	}

}