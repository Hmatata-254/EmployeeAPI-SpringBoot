package com.example.springServer

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = "com.example.springServer")
class SpringServerApplication {

	static void main(String[] args) {
		SpringApplication.run(SpringServerApplication, args)
	}

}
