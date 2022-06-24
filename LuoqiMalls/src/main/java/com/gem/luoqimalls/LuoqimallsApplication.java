package com.gem.luoqimalls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gem.luoqimalls.mapper")
public class LuoqimallsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuoqimallsApplication.class, args);
	}
}
