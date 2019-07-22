package com.segundoservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@RibbonClient(name="BoodCam")
@EnableFeignClients
public class SegundoServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegundoServicioApplication.class, args);
	}

}
