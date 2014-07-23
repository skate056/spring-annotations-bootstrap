import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: saket
 * Date: 23/07/2014
 * Time: 12:22
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class ApplicationConfiguration {

    @Bean
    public TestInterface testBean(){
        return new TestBean();
    }
}
