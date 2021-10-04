
package com.practice.rajtraining.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExceptionHelp {
    
    public void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("person not eligible to vote");
        }else{
            System.out.println("person eligible to vote");
        }
    }
    
    public void Reader() throws FileNotFoundException{
        FileReader file=new FileReader("C:\\Users\\PANDIT\\Desktop\\bikesh.jpg");
        BufferedReader br=new BufferedReader(file);
        
        
        throw new FileNotFoundException();
    }
    
    public void found() throws IOException{
        throw new IOException("device error");
    }
    
    public void n()throws IOException{
        found();
    }
    
    public void p(){
        try {
            n();
        } catch (IOException ex) {
            System.out.println(""+ex);
        }
    }
}
