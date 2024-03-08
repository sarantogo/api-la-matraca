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

//		ApplicationContext context = SpringApplication.run(ApilamatracaApplication.class, args);
//		CowRepository cowRepository = context.getBean(CowRepository.class);
//		PurchaseRepository purchaseRepository = context.getBean(PurchaseRepository.class);
//
//		Cow cow = new Cow();
//		cow.setName("Lola");
//		cow.setAge(5);
//		cow.setBreed("Casta blanca");
//		cow.setSold(false);
//		cow.setWasBought(true);
//		cow.setWeight(BigDecimal.valueOf(110.5));
//		cow.setCreatedAt(Date.valueOf(LocalDate.now()));
//		cow.setLastUpdate(Date.valueOf(LocalDate.now()));
//
//		System.out.println("VACA INSERTADA: " + cowRepository.save(cow));
//
////		List<Cow> cows = cowRepository.findAll();
////
////		System.out.println("Num of cows in database: " + cows.size());
//
//		Purchase purchase = new Purchase();
//
//		purchase.setPurchaseDate(Date.valueOf(LocalDate.parse("02-05-2019", DateTimeFormatter.ofPattern("dd-MM-yyyy"))));
//		purchase.setPrice(BigDecimal.valueOf(1200000.00));
//		purchase.setSeller("Jose Manuel Alvarez");
//		purchase.setCow(cow);
//
//		System.out.println("COMPRA INSERTADA: " + purchaseRepository.save(purchase));
	}

}
