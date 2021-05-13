package Core.Collection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {

	@Test
	void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Collection jc=(Collection)context.getBean("collection");

		assertAll(
				()->assertEquals(jc.getAddressList(),"[INDIA, Pakistan, USA, USA]" )
			);
	}

}
