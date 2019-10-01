package com.hcl.decodejson;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.Annotation;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.hcl.model.Employee;

public class MainMethod {
public static void main(String[] args) throws IOException {
FileReader ob = new FileReader("C:\\Users\\Coalesce\\Desktop\\employee.json");
BufferedReader br = new BufferedReader(ob);
int i;
StringBuilder sb = new StringBuilder();
while((i=br.read())!=-1){
    sb.append((char)i);
     }
JSONArray arr = (JSONArray)((JSONObject) JSONValue.parse(sb.toString())).get("Players");

org.hibernate.cfg.Configuration cfg = new AnnotationConfiguration();
cfg.configure("hibernate.cfg.xml");
SessionFactory sf = cfg.buildSessionFactory();
Session session = sf.openSession();


 for(int e = 0 ; e<arr.size() ; e++){
Employee emp = new Employee();
 JSONObject jsonObject = (JSONObject) arr.get(e);  
 emp.setEmpname((String)jsonObject.get("empname"));
 emp.setEmpno((Integer)jsonObject.get("empno"));
 emp.setBand((String)jsonObject.get("band"));
 emp.setDateofjoin(Date.valueOf((String) jsonObject.get("dateofjoin")));
 emp.setSalary((Double)jsonObject.get("salary"));
 Transaction t = session.beginTransaction();

 session.saveOrUpdate(emp);
 t.commit();
// System.out.println(jsonObject);
}
}
}


