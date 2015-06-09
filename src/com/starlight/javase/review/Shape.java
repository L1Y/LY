package com.starlight.javase.review;

public abstract class Shape {
      private double width = 0 ;
      private double heigh = 0 ;
      private String name = "0" ;
      
      public double getWidth() {
            return width;
      }
      public void setWidth(double width) {
            this.width = width;
      }
      public double getHeigh() {
            return heigh;
      }
      public void setHeigh(double heigh) {
            this.heigh = heigh;
      }
      public String getName() {
            return name;
      }
      public void setName(String name) {
            this.name = name;
      }
      
      Shape(){
            
      }
      
      Shape(double w , double h){
            this.width = w;
            this.heigh = h;
      }
      
      Shape(String str ,double w , double h){
            this.width = w;
            this.heigh = h;
            this.name = str;
      }
      
      public abstract double getArea();
      public abstract double getArea(double w , double h);
      


}
