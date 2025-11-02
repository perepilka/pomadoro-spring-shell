package com.perepilka.pomadoro_spring_shell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.CommandScan;

@SpringBootApplication
@CommandScan
public class PomadoroSpringShellApplication {

	public static void main(String[] args) {
		SpringApplication.run(PomadoroSpringShellApplication.class, args);
	}

}
