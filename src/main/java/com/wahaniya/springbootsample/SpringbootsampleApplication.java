package com.wahaniya.springbootsample;

import java.util.Base64;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenRequestContext;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;

@SpringBootApplication
public class SpringbootsampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsampleApplication.class, args);
		// DefaultAzureCredential defaultCredential = new DefaultAzureCredentialBuilder().build();
		// TokenRequestContext tokenRequestContext = new TokenRequestContext().addScopes("https://management.azure.com/.default");
		// String accessToken = defaultCredential.getToken(tokenRequestContext).map(AccessToken::getToken).block();
		// System.out.println(accessToken);

		// Base64.Decoder decoder = Base64.getUrlDecoder();
		// String encodedBody = accessToken.split("\\.")[1];
		// String body = new String(decoder.decode(encodedBody));
		// System.out.println(body);
	}

}
