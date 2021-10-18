/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtraining.ejb.da;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

/**
 *
 * @author PANDIT
 */
@MessageDriven(mappedName = "jms/demo", activationConfig = {
    //    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/demo")
    //    ,
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")
    ,
    @ActivationConfigProperty(propertyName = "subscriptionDurability", propertyValue = "NonDurable")
    ,
     @ActivationConfigProperty(propertyName = "subscriptionName", propertyValue = "MyBean")
})
public class MyBean implements MessageListener {

    public MyBean() {
    }

    @Override
    public void onMessage(Message message) {
//        TextMessage msg = (TextMessage) message;
        if (message instanceof ObjectMessage) {
            ObjectMessage msg = (ObjectMessage) message;
            try {
                System.out.println(msg.getObject().toString());
            } catch (JMSException ex) {
                Logger.getLogger(MyBean.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
