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
public class TopicProducer {
    @Autowired
    private Destination topicPageDestination;

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendTextMessage(final String text) {

        jmsTemplate.send(topicPageDestination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(text);
            }
        });
    }

    public void sendTextMessageWithLambda(final String text) {
        jmsTemplate.send(topicPageDestination, session -> session.createTextMessage(text));

    }

}
