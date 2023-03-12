package springIntro;
/*
 * Ioc- Inversion of Control Dependency Injection- Ioc yapısını ayağa kaldıran
 * tasarım deseni Yazılımda değişime direnç göstermeyen yazılım yazmak çok
 * önemli- inşaat projesinde 5 katlı bina 3ncü katında değiştiremeyiz ama
 * yazılımda olur neden? Yazılımın amacı,insanların günlük aktivitelerinin pc
 * destekli sistemlerle kolaylaştırılmasıdır.Yazılımda sürekli değişim var. Ioc
 * ile birbirinin alternatifi olan işleri üretiyoruz.Bu işleri ayrı class'larda
 * yazıyoruz SOLID yazılım prensibine göre O harfi open close prensibi derki
 * yeni bir özellik, değişiklik değil, eklediğinde yazdığın hiçbir koda
 * dokunamazsın!!!
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService= context.getBean("service",ICustomerService.class);
		//CustomerManager manager = new CustomerManager(new CustomerDal());
		//CustomerManager manager = new CustomerManager(new MySqlCustomerDal());
		//CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		//manager.add();
		customerService.add();
	}	
}