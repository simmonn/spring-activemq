import com.simmon.QueueListener;
import com.simmon.TopicListener;
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
public class TopicConsumerTest {

    @Autowired
    private TopicListener topicListener;
    @Test
    public void testQueueConsumer(){
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
