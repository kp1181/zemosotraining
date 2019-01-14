package demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac =new ClassPathXmlApplicationContext("/demo/pointBean.xml"); 
		Square s = (Square)ac.getBean("square");
		s.draw();

	}

}
