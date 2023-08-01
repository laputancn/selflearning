package com.laputan.configservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigserverGitApplication {

	/**
	 * to access the properties, use the url below as reference
	 * http://localhost:8888/s2rates/qa/main
	 * http://localhost:8888/s1rates/default/main
	 * http://localhost:8888/default/main
	 * for performance config use the url below
	 * http://localhost:8888/s1rates/perf/main
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigserverGitApplication.class, args);
	}

}
