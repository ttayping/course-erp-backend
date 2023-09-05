package com.webperside.courseerpbackend;

//import com.webperside.courseerpbackend.models.mybatis.user.User;
//import com.webperside.courseerpbackend.models.properties.security.SecurityProperties;
//import com.webperside.courseerpbackend.services.security.AccessTokenManager;
import com.webperside.courseerpbackend.models.mybatis.user.User;
import com.webperside.courseerpbackend.services.security.AccessTokenManager;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

@SpringBootApplication
@RequiredArgsConstructor
public class CourseErpBackendApplication implements CommandLineRunner{
	private final AccessTokenManager accessTokenManager;

	public static void main(String[] args) {
		SpringApplication.run(CourseErpBackendApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		User user = User.builder().email("email@email.com").build();
		user.setId(1L);
		System.out.println(accessTokenManager.generate(user));

	}
	private static String convertToPrivateKey(String key) {
		StringBuilder result = new StringBuilder();
		result.append("-----BEGIN PRIVATE KEY-----\n");
		result.append(key);
		result.append("\n-----END PRIVATE KEY-----");
		return result.toString();
	}

	private static String convertToPublicKey(String key) {
		StringBuilder result = new StringBuilder();
		result.append("-----BEGIN PUBLIC KEY-----\n");
		result.append(key);
		result.append("\n-----END PUBLIC KEY-----");
		return result.toString();
	}


}
