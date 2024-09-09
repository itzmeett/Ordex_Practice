package comSpring.Stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("stereo_config.xml");
		Student s1 = (Student) context.getBean("student");
		Student s2 = (Student) context.getBean("student");
		System.out.println(s1);
		System.out.println("student-1 hashcode : " + s1.hashCode());
		System.out.println("student-2 hashcode : " + s2.hashCode());
	}
}
