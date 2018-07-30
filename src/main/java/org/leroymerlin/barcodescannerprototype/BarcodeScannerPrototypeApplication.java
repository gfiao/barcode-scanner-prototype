package org.leroymerlin.barcodescannerprototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class BarcodeScannerPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarcodeScannerPrototypeApplication.class, args);
	}
}