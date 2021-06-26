package com.healthbooth.mailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MailUtil {
	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail() {
		log.info("Preparing Simple Message");
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("anjalijatav28@gmail.com", "anushaludubey@gmail.com", "kalawati.ambe12@gmail.com");
		msg.setSubject("Greeting From MHA");
		msg.setText("Hi\n now you are registerd with MHA");
		mailSender.send(msg);
		log.info("Mail has been sent");
	}
}