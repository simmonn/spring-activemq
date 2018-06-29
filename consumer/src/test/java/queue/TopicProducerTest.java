package queue;

import com.simmon.producer.TopicProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author simmon
 * @description
 * @date 2018-06-29 01:06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-jms.xml"})
public class TopicProducerTest {

    @Autowired
    private TopicProducer topicProducer;

    @Test
    public void testTopicProducer(){
        topicProducer.sendTextMessageWithLambda("发布订阅测试");
    }
}
