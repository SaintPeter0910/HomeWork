package com.sapo.edu.demo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.Scanner;
import java.lang.*;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What your name?");
		String name=null;
		if (scanner.hasNext()) {
			name = scanner.nextLine();
		}

		System.out.print("Say something");
		String Quotes=scanner.nextLine();
		String yourQuotes=StringUtils.capitalize(Quotes);
		System.out.println(yourQuotes);

		Boolean filter= StringUtils.containsAny(name,'c');
		if(filter) System.out.println("FilterTest1");
		else System.out.println("FilterTest2");

		Boolean filter2=StringUtils.containsIgnoreCase(name,"phong");
		if(filter2)System.out.println("IgnoreCaseTest1");
		else System.out.println("IgnoreCaseTest2");

		int charNum = StringUtils.countMatches(name, "n");
		if(charNum > 5) System.out.println("Ten ban co nhieu chu n qua");
		else System.out.println("Ten ban co it chu n qua");

		Random rand = new Random();
		int randomNumber=rand.nextInt(1000);
		String name2 = name.replaceAll("\\s+","");

		String email = StringUtils.appendIfMissing(name2, randomNumber +"@gmail.com");
		System.out.print("Youremail address is: ");
		System.out.println(StringUtils.lowerCase(email));

		String emailHead = StringUtils.prependIfMissing(name2, "www") + randomNumber;
		String address = StringUtils.appendIfMissing(emailHead, ".com");
		System.out.print("Your website address is: ");
		System.out.println(address);
		System.out.println("Hello "+ name);
	}

}
