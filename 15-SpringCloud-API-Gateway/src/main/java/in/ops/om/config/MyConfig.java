package in.ops.om.config;

import java.util.UUID;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MyConfig {


    @Bean
    RouteLocator configureRoutes(RouteLocatorBuilder builder) {
		return builder
				.routes()
				
				.route("CartDetail", r->r.path("/v1/api/product/**")
						.filters(f-> f.addRequestHeader("TOKENUUID", UUID.randomUUID().toString()).addResponseHeader("RESPONSE-HEADER", "ACTIVE"))
						.uri("lb://02-EurekaClient-CART-SERVICE"))
				.route("ProductDetail", r->r.path("/v1/api/order/**").uri("lb://ORDER-SERVICE"))
				.build();
	}

}
