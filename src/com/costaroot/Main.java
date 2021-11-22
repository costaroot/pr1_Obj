package com.costaroot;
import com.costaroot.cla.*;

public class Main {

    public static void main(String[] args) {
	    String line = new String("This is Java!");
        System.out.println("Class: "+line.getClass());
        new Executor().run();
    }
}
