package spring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context
				= new AnnotationConfigApplicationContext(BeanConfig.class);

		Staff4 staff= context.getBean(Nurse4.class);
		staff.assist();

	}

}
