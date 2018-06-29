import com.simmon.QueueListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * @author simmon
 * @description
 * @date 2018-06-28 23:31
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-jms.xml"})
public class QueueConsumerTest {

    @Autowired
    private QueueListener queueConsumer;

    @Test
    public void testTopicConsumer() {
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
