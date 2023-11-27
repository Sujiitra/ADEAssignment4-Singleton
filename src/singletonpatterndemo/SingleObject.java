/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpatterndemo;

/**
 *
 * @author sujiitramurukeshan
 * Single object is created,
 * square is calculated using sqr method,
 * an integer a parameter is passed,
 * prints the square of integer a,
 * returns the square value
 * 
 */
public class SingleObject {
    private static SingleObject instance=new SingleObject();
    public SingleObject(){}
    public static SingleObject getInstance(){
        return instance;
    }
    //Square Method with a parameter "a"
    public int sqr(int a){ 
        int b=a*a;
        System.out.println(b); // prints the square
        return b; // Return value
    }
    
}
