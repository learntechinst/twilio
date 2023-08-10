package com.learntechinst.twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class TwilioSMS {
	// Find your Account SID and Auth Token at twilio.com/console
	// and set the environment variables. See http://twil.io/secure
	public static final String ACCOUNT_SID = "XXXXXXXXXXXXXXXXXXXXXXXXXXX";
	public static final String AUTH_TOKEN = "XXXXXXXXXXXXXXXXXXXXXXXXXXX";

	public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+91XXXXXXXXX"),
                new com.twilio.type.PhoneNumber("+1XXXXXXXXX"),
                "Welcome Learn Technology Institute!!")
            .create();

        System.out.println(message.getSid());
    }

}
