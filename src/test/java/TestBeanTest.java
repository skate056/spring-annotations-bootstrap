import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: saket
 * Date: 23/07/2014
 * Time: 12:41
 * To change this template use File | Settings | File Templates.
 */
@RunWith(MockitoJUnitRunner.class)
public class TestBeanTest {
    @Test
    public void shouldInvoke() throws Exception {
        TestBean testBean = new TestBean();

        assertThat(testBean.invoke(""), is(true));
    }
}
