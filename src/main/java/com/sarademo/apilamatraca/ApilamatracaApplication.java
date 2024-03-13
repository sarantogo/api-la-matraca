package com.sarademo.apilamatraca;

import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.entities.Purchase;
import com.sarademo.apilamatraca.repositories.CowRepository;
import com.sarademo.apilamatraca.repositories.PurchaseRepository;
import com.sarademo.apilamatraca.services.CowService;
import com.sarademo.apilamatraca.services.impl.CowServiceIplm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootApplication
public class ApilamatracaApplication {



	public static void main(String[] args) {

		SpringApplication.run(ApilamatracaApplication.class, args);

	}

}
