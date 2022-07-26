import java.time.LocalDate;

import entities.*;
import entities.Package;


public class Main {
	
	public static void main(String[] args) {
		Customer customer = new IndividualCustomer(1,"1111111","1111111","Tugay","Sert");
		Customer customer2 = new CorporateCustomer(2,"155652555","Etiya","665555944");
		Service service = new Service(1,"Vdsl");
		Service service2 = new Service(2,"Tivibu");
		Package packages = new Package(1,"16MBPS",service,100.0);
		Package packages2 = new Package(2,"Aile Paketi",service,120.0);
		Address address1 = new Address(1,"Alibeyköy", Address.AddressType.HOME);
		Address address2 = new Address(1,"DavutPaşa", Address.AddressType.BUSINESS);
		Subscription subscription1 = new Subscription(1,customer,LocalDate.now(),packages2,LocalDate.now(),address1);
		Subscription subscription2 = new Subscription(2,customer2,LocalDate.now(),packages,LocalDate.of(2023,9,16),address2);
		Invoice invoice = new Invoice(1,subscription1,LocalDate.now(),LocalDate.of(2022,8,20),false);
		Invoice invoice2 = new Invoice(2,subscription2,LocalDate.now(),LocalDate.of(2022,8,10),true);
		PaymentMethod paymentMethod = new PaymentMethod(1,"CreditC");
		PaymentMethod paymentMethod2 = new PaymentMethod(1,"Cash");
		invoice2 = new PaidInvoice(invoice2,LocalDate.of(2022,7,26),paymentMethod);
		Cable cable = new Cable(1,"Cat6",1.3f);
		Cable cable2 = new Cable(1,"Cat5",1.3f);
		Modem modem = new Modem(1,service,"M15255","xyzel","superspeed11",cable);
		Decoder decoder = new Decoder(1,service,"D2115526","TiviTv", "TiviSpeed",cable2);
		System.out.println(invoice2.getId());
		customer.getSubscriptions().add(subscription1);
		customer.getSubscriptions().stream()
				.map(subscription -> subscription.getCustomer().getCustomerNumber())
				.forEach(System.out::println);




		}


	}
	


