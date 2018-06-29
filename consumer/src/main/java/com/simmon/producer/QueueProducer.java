package com.simmon.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.*;

/**
 * @author simmon
 * @description
 * @date 2018-06-28 19:27
 */

@Component
public class QueueProducer {
    @Autowired
    private Destination queueSolrDestination;

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendTextMessage(final String text) {
        jmsTemplate.send(queueSolrDestination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                MessageProducer producer = session.createProducer(queueSolrDestination);
                producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
                return session.createTextMessage(text);
            }
        });
    }

    public void sendTextMessageWithLambda(final String text) {
        jmsTemplate.send(queueSolrDestination,session -> session.createTextMessage(text));

    }

}
