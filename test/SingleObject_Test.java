/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import singletonpatterndemo.SingleObject;

/**
 *
 * @author sujiitramurukeshan
 * Single Object Test class is created,
 * sqr test method is created,
 * assert equals 4 when the sqr method with 2 as a parameter is called
 * 
 */
public class SingleObject_Test {
    
    public SingleObject_Test() {
    }
SingleObject s=new SingleObject();
    
     @Test
    public void sqr_Test(){
        assertEquals(4,s.sqr(2));
       
    }
}
