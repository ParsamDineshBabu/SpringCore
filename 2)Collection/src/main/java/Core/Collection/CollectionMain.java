package Core.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      Collection jc=(Collection)context.getBean("collection");

      jc.getAddressList();
      jc.getAddressSet();
      jc.getAddressMap();
   }
}
