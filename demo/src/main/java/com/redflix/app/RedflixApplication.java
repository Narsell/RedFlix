package com.redflix.app;

import com.redflix.app.vista.Ventana;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.redflix.app")
public class RedflixApplication {

	public static void main(String[] args) {
                new Ventana().setVisible(true);
	}

    public static void runSpringServer(String[] args) {
       SpringApplication.run(RedflixApplication.class, args);
    }

}
