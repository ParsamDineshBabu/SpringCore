package address.customer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

class TestDriver {

	@Test
	void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer cust=(Customer) context.getBean("customer");
		assertAll(
		()->assertEquals(cust.getCustomername(),"Dinesh"),
		()->assertEquals(cust.getCustomerid(),2122),
		()->assertEquals(cust.getCustomernumber(),99492),
		()->assertEquals(cust.getCustomerAddress().getStreet(),"RaniNagar"),
		()->assertEquals(cust.getCustomerAddress().getCity(),"Ananthapur"),
		()->assertEquals(cust.getCustomerAddress().getZip(),515001)
	);
	}

}
