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
 */
public class SingleObject_Test {
    
    public SingleObject_Test() {
    }
SingleObject s=new SingleObject();
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void sqr_Test(){
        assertEquals(4,s.sqr(2));
       
    }
}
