package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.AchatRepository;
import org.sid.dao.ContactRepository;
import org.sid.entities.Achat;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterBourseApplication implements CommandLineRunner {
	@Autowired
	private ContactRepository contactRepository;
	@Autowired
	private AchatRepository achatRepository;
	public static void main(String[] args) {
		SpringApplication.run(InterBourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
	}
}