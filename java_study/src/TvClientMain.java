import com.encore.tv.domain.LgTV;
import com.encore.tv.factory.TvBeanFactory;
import com.encore.tv.util.TV;

public class TvClientMain {
	public static void main(String[] args) {
		TvBeanFactory factory01 = TvBeanFactory.getInstance();
		System.out.println(factory01);

		TvBeanFactory factory02 = TvBeanFactory.getInstance();
		System.out.println(factory02);

		TV tv = factory01.getBean("samsung");
		tv.turnOn();

		TV tv1 = factory01.getBean("lg");
		tv1.turnOn();
	}


}
