import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pipilong
 * @createTime 2022/10/21
 * @description
 */
public class Demo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
        MyInterface12 student = (MyInterface12) c.getBean("student");

        student.say();

        student.see();
    }
}
