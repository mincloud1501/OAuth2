package com.elevenst.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer
public class OAuth2AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients
            .inMemory()
            .withClient("client")
            .secret("{noop}secret") // secret
            .redirectUris("http://localhost:8769/callback") // callback address 지정, MSA project의 display 지정
            //.authorizedGrantTypes("authorization_code") // Authorization Code Grant Type
            //.authorizedGrantTypes("authorization_code", "implicit") // Implicit Grant Type
            //.authorizedGrantTypes("authorization_code", "implicit", "password") // Resource Owner Password Credentials Grant Type
            .authorizedGrantTypes("authorization_code", "implicit", "password", "client_credentials") // Client Credentials Grant Type
            .accessTokenValiditySeconds(120)
            .refreshTokenValiditySeconds(240)
            .scopes("read_profile");
    }
}