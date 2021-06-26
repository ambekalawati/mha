package com.maternalhealth.mail;

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

	public void sendMail() {
		log.info("Hi User, your password is:");
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setTo("");

	}

}
