package com.practicePackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonData {

	public static void main(String[] args) throws Throwable, Throwable, ParseException {
		

		JSONParser p=new JSONParser();
		Object obj = p.parse(new FileReader(".\\src\\test\\resources\\json.json"));
		
		 JSONObject map = (JSONObject)obj;
		
		System.out.println(map.get("browser"));
		System.out.println(map.get("url"));
		System.out.println(map.get("username"));
		System.out.println("password");
	}

}
