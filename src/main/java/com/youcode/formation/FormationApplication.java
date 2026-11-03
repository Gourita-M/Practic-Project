package com.youcode.formation;

import com.youcode.externe.AuditExterne;
import com.youcode.formation.config.PrimaryConfig;
import com.youcode.formation.exo2.CommandeService;
import com.youcode.formation.exo2.Consommateur;
import com.youcode.formation.exo5.ServiceCycleDevie;
import com.youcode.formation.runner.DemoRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FormationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FormationApplication.class, args);

		AnnotationConfigApplicationContext app =
				new AnnotationConfigApplicationContext(PrimaryConfig.class);

//		Consommateur consommateur = app.getBean(Consommateur.class);
//		AuditExterne ap = app.getBean(AuditExterne.class);
//		System.out.println(ap.info());

		DemoRunner demo = app.getBean(DemoRunner.class);

		demo.run();

		ServiceCycleDevie cycledevie = app.getBean(ServiceCycleDevie.class);

		app.close();

	}
}
