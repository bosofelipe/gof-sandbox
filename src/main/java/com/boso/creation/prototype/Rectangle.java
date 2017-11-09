package com.boso.creation.prototype;

public class Rectangle extends Shape{

	 public Rectangle(){
	     type = "Rectangle";
	   }

	   @Override
	   public String draw() {
	      return "Inside Rectangle::draw() method.";
	   }

}
