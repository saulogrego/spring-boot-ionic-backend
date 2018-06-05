package com.saulogrego.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.saulogrego.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
