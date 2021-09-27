package ru.vlapin.trainings.luxoftspringcourse.config;

import static org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType.HAL;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@Configuration
@EnableHypermediaSupport(type = HAL)
@EnableFeignClients("ru.vlapin.trainings.luxoftspringcourse.service")
public class Feign {
}
