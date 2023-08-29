package com.webperside.courseerpbackend.config;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@SecurityScheme(
//        name = "",
//        scheme = "",
//        bearerFormat = "",
//        type = SecuritySchemeType.HTTP,
//        in = SecuritySchemeIn.HEADER
//)
public class SwaggerConfig {
    @Bean
    public OpenAPI myOpenPI(){
        Contact contact = new Contact();
        contact.setEmail("mr.tahirhasanov@gmail.com");
        contact.setName("Tahir");
        contact.setUrl("url.com");

        Info info = new Info()
                .title("Course ERP API")
                .version("1.0")
                .contact(contact)
                .description("This API exposes endpoints to manage tutorials")
                .termsOfService("url.com");

        return new OpenAPI().info(info);
              //  .addSecurityItem(new SecurityRequirement().addList("Authorization"));
    }

}
