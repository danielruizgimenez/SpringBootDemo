/**
 * @author druiz
 */

package com.druiz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ScopedProxyMode;

@SpringBootApplication
@ComponentScan(basePackages = { "com.druiz.demo" }, scopedProxy = ScopedProxyMode.TARGET_CLASS)
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
