package com.elevenst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Oauth2 application server.
 */

@SpringBootApplication
public class OAuthASApplication {

	private static final Logger log = LoggerFactory.getLogger(OAuthASApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OAuthASApplication.class, args);
    }
}