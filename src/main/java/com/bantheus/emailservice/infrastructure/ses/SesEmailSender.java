package com.bantheus.emailservice.infrastructure.ses;

import org.springframework.stereotype.Service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;
import com.bantheus.emailservice.adapters.EmailSenderGateway;

@Service
public class SesEmailSender implements EmailSenderGateway {

  private final AmazonSimpleEmailService amazonSimpleEmailService;
  private final String sourceEmail;

  public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService){
    this.amazonSimpleEmailService = amazonSimpleEmailService;
    this.sourceEmail = System.getenv("SOURCE_EMAIL");
  }

  @Override
  public void sendEmail(String to, String subject, String body) {
    SendEmailRequest request = new SendEmailRequest()
      .withSource(sourceEmail)
      .withDestination(new Destination().withToAddresses(to))
      .withMessage(new Message()
        .withSubject(new Content(subject))
        .withBody(new Body().withText(new Content(body)))
      );

      try {
        this.amazonSimpleEmailService.sendEmail(request);
      } catch (AmazonServiceException exception) {
        throw new EmailServiceException("Error sending email", exception);
      }
  }

}