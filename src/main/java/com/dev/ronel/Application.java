package com.dev.ronel;

import com.dev.ronel.post.Initializer;
import com.dev.ronel.post.RoleType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.HttpURLConnection;

@SpringBootApplication
public class Application {
	private final Initializer initializer;

    public Application(Initializer initializer) {
        this.initializer = initializer;
    }


    public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		System.out.println(RoleType.isRoleType(RoleType.ROLE_HD_CASE_AGENT.getCode()));


	}

}
