import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: saket
 * Date: 23/07/2014
 * Time: 12:23
 * To change this template use File | Settings | File Templates.
 */
public class TestBean implements TestInterface {

    private Logger LOGGER = LoggerFactory.getLogger(TestBean.class);
    public boolean invoke(String param) {
        LOGGER.info("Invoked bean... {}", param);
        return true;
    }
}
