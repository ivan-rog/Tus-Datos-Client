package com.tusdatos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
@Slf4j
public class TusDatosClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(TusDatosClientApplication.class, args);
        log.info("TusDatosClientApplication started successfully. {}", Runtime.getRuntime().availableProcessors());
    }

}
