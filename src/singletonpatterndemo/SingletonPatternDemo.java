/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonpatterndemo;

/**
 *
 * @author sujiitramurukeshan
 */
public class SingletonPatternDemo {

    /**
     * @param args the command line arguments
     */
    //Singleton Pattern Demo
    public static void main(String[] args) {
        // TODO code application logic here
        SingleObject object= SingleObject.getInstance(); // Single Instance
        object.sqr(5);
    }
    
}
