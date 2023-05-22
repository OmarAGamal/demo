package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {



		String str = "my first addon";
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("skarpt.txt");
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		byte[] strToBytes = str.getBytes();
		try {
			outputStream.write(strToBytes);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		try {
			outputStream.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		SpringApplication.run(DemoApplication.class, args);
	}

}
