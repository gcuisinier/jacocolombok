package com.hahnekamp.jacocolombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
  private String firstname;
  private String lastname;

  public void test(){
    System.out.println(firstname);
    if(true) 
    {return;}
        else 
    {    System.out.println("tetes");

      return;}
  }
}
