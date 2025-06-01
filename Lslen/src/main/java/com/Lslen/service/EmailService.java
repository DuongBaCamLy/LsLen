package com.Lslen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendOrderConfirmation(String toEmail, String customerName, int orderId, double totalPrice) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Order Confirmation - LS Len");
        message.setText(
            "Dear " + customerName + ",\n\n" +
            "Thank you for your order #" + orderId + ".\n" +
            "Total: " + totalPrice + " VND.\n" +
            "Your order is being processed and will be delivered soon.\n\n" +
            "Love,\nLS Len Team"
        );

        mailSender.send(message);
    }
}
