package com.example.springplayground;

import com.example.springplayground.domain.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringplaygroundApplication {
    private static final Logger log = LoggerFactory.getLogger(SpringplaygroundApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringplaygroundApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            Quote quote = restTemplate.getForObject(
                    "https://quoters.apps.pcfone.io/api/random", Quote.class);
            if (quote != null) {
                log.info(quote.toString());
            }
        };
    }
}
