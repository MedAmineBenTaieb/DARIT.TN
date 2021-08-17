/*

package tn.dari.spring.domain.util;

import java.util.Locale;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;


import tn.dari.spring.domain.Order;
import tn.dari.spring.domain.AppUser;

@Component
public class MailConstructor {
	@Autowired
	private Environment env;
	
	
	String Text;
	
	public MimeMessagePreparator constructOrderConfirmationEmail (AppUser user, Order order, Locale locale) {
		
		
		String text = "orderConfirmationEmailTemplate" + "order : " + order +" user : " + user + "cartItemList" + order.getCartItemList()  ;
		
		MimeMessagePreparator messagePreparator = new MimeMessagePreparator() {
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper email = new MimeMessageHelper(mimeMessage);
				email.setTo(user.getEmail());
				email.setSubject("Order Confirmation - "+order.getId());
				email.setText(text, true);
				email.setFrom(new InternetAddress("daritn2021@gmail.com"));
			}
		};
		
		return messagePreparator;
	}
}



*/