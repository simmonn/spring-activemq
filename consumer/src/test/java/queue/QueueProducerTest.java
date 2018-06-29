package queue;

import com.simmon.producer.QueueProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author simmon
 * @description
 * @date 2018-06-28 21:00
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-jms.xml"})
public class QueueProducerTest {
    @Autowired
    private QueueProducer queueProducer;
    @Test
    public void testQueueProducer(){

        queueProducer.sendTextMessage("哈哈哈哈");
    }

}
