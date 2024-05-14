package com.bantheus.emailservice.application;

import org.springframework.stereotype.Service;

import com.bantheus.emailservice.adapters.EmailSenderGateway;
import com.bantheus.emailservice.core.EmailSenderUseCase;

@Service
public class EmailSenderService implements EmailSenderUseCase {

  private final EmailSenderGateway emailSenderGateway;

  public EmailSenderService(EmailSenderGateway emailGateway){
    this.emailSenderGateway = emailGateway;
  }

  @Override
  public void sendEmail(String to, String subject, String body) {
    this.emailSenderGateway.sendEmail(to, subject, body);
  }
  
}
