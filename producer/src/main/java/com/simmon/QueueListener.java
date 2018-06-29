package com.simmon;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.io.IOException;

/**
 * @author simmon
 * @description
 * @date 2018-06-28 21:07
 */
@Component
public class QueueListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("textMessage = " + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }
}
