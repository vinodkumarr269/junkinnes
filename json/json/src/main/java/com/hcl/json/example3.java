package com.hcl.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class example3 {
	public static void main(String[] args) {
		JSONObject ob=new JSONObject();
		JSONArray arr=new JSONArray();
		arr.add("vinod");
	    arr.add(new Integer(1));
	    arr.add(new String("ECE"));
	    
		arr.add("prem");
	    arr.add(new Integer(3));
	    arr.add(new String("CSE"));
	    
		arr.add("sai");
	    arr.add(new Integer(2));
	    arr.add(new String("ECE"));
	    for (Object object : arr) {
			System.out.println(object);
		}
	    
	    
	}

}
