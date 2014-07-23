import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: saket
 * Date: 23/07/2014
 * Time: 12:21
 * To change this template use File | Settings | File Templates.
 */
public class AnnotationBasedSpringStarter {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ApplicationConfiguration.class);
        context.refresh();

        TestInterface test = context.getBean(TestInterface.class);
        test.invoke("Hello!");

    }
}
