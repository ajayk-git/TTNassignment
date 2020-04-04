package com.ajaykumar.RestfullWebServices;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//configuration
@Configuration
//enable Swagger
@EnableSwagger2
public class SwaggerConfig {

    public static final Contact DEFAULT_CONTACT = new Contact("Ajay Kumar", "", "ajay.kumar1@tothenew.com");
    public static final ApiInfo DEFAULT = new ApiInfo("Employee Api  ", "Employee Api Documentation",
            "1.0", "urn:tos",
            DEFAULT_CONTACT, "Apache 2.0",
            "http://www.apache.org/licenses/LICENSE-2.0",
            new ArrayList<VendorExtension>());

       //bean-docket
    private Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(ApiInfo.DEFAULT);

    }
}
