package com.bridgelabz.sendemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SendEmailApplication {
    final EmailService emailService;

    public SendEmailApplication(EmailService emailService) {
        this.emailService = emailService;
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SendEmailApplication.class, args);
        SendEmailApplication app = context.getBean(SendEmailApplication.class);
        app.Run();
    }

    private void Run() {
        emailService.sendEmail("shrivastavaaryaman0702@gmail.com", "Email from JavaSpringBoot", "Hi There, this is an email from JavaSpringBoot");
    }

}
