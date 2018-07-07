package com.git.main;

import org.apache.log4j.Logger;


public class GitCalculator {
	static final Logger Log = Logger.getLogger(GitCalculator.class);
 public static void main(String[] args) {
	 Log.info("main method started");
	GitCalculator calc = new GitCalculator();
	int result = calc.add(15, 20);
	Log.info("Result is  : "+result);
	Log.info("main method ends");
}
 
 public int add(int a, int b){
	 return a+b;
 }
 
 public int sub(int a, int b){
	 return a-b;
 }
 
 public int mul(int a, int b){
	 return a*b;
 }
 
 public int div(int a, int b){
	 return a/b;
 }
 
}
