package com.sarademo.apilamatraca;

import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.repositories.CowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ApilamatracaApplication {



	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ApilamatracaApplication.class, args);
		CowRepository cowRepository = context.getBean(CowRepository.class);

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
//		System.out.println("Before insert");
//		cowRepository.save(cow);

		List<Cow> cows = cowRepository.findAll();

		System.out.println("Num of cows in database: " + cows.size());
	}

}
