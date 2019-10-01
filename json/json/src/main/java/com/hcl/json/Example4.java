package com.hcl.json;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Example4 {

	public static void main(String[] args) {
		JSONObject emp=new JSONObject();
		for (int i = 1; i < 3; i++) {
			JSONArray arr=new JSONArray();
			Scanner sc=new Scanner(System.in);
			String x=sc.nextLine();
			int y=sc.nextInt();
			int z=sc.nextInt();
			
			arr.add(x+i);
			arr.add(y*i);
			arr.add(25+z);
			emp.put(i, arr);
			
		}
		System.out.println(emp);

	}

}
