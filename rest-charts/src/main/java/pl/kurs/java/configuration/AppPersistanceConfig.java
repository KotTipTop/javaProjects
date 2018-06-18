package pl.kurs.java.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "pl.kurs.java.repository")
@EntityScan(basePackages = "pl.kurs.java.model")
@EnableTransactionManagement
public class AppPersistanceConfig {

}
