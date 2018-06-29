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
 * @date 2018-06-29 01:05
 */
@Component
public class TopicListener implements MessageListener {

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



