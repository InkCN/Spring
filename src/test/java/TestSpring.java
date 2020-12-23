import com.spring.Client;
import com.spring.MyConfig;
import com.spring.Person;
import com.spring.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 使用xml文件进行依赖注入，需要有xml配置文件
     */
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = context.getBean("testIOC", User.class);
        System.out.println(user);
    }

    /**
     * 使用注解进行依赖注入，需要有配置类
     */
    @Test
    public void test02(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("getPerson", Person.class);
        System.out.println(person);
    }

    /**
     * test AOP
     * 同时使用了注解以及xml文件，所以打印出来内容有的多(ps：xml前置比注解快，xml后置比注解慢)
     */
    @Test
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Client client = context.getBean("client", Client.class);
        client.test();
    }
}
