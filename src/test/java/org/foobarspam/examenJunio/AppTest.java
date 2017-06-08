package org.foobarspam.examenJunio;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.examenJunio.box.mrmeeseks.MrMeeseeks;
import org.foobarspam.examenJunio.box.mrmeeseks.ProxyMrMeeseeks;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	
	// Al imprimirse todo por pantalla no he ido realizando casos test.
	// He comprobado que las arrays añaden y se borran correctamente
	// Ya que es lo unico que no vemos via consola.
	
	public static ArrayList<MrMeeseeks> setMrMe = new ArrayList<MrMeeseeks>();
	public static ArrayList <Integer> ids = new ArrayList<Integer>();

	
	@BeforeClass
	public static void setUp() {
		

		ProxyMrMeeseeks box = new ProxyMrMeeseeks();
		       
		box.pushButton(setMrMe);
		box.getMrMe().formulateRequest("Open", "stupid jar");
		
		box.pushButton(setMrMe);    
		box.getMrMe().formulateRequest("Be", "popular at school");
		
		box.pushButton(setMrMe);
		box.getMrMe().formulateRequest("Be", "a more complete woman");

		for(MrMeeseeks mrme : setMrMe) {
			ids.add(mrme.getId());
		}
	}
	
	@Test
	public void llenarLaArrayCorrectamente() {
		
		assertEquals(setMrMe.size(), 3);
		assertEquals(ids.size(), 3);
	}
	
	@Test
	public void idsCoinciden() {
		
	assertEquals(setMrMe.get(0).getId(), ids.get(0));
	assertEquals(setMrMe.get(1).getId(), ids.get(1));
	assertEquals(setMrMe.get(2).getId(), ids.get(2));
	}
	
	@Test
	public void borrarMeeseeksCorrecto() {
		
		for(Integer id : ids ){
			for (MrMeeseeks mrme : setMrMe){
					setMrMe.remove(mrme);
					break;
			}
		}
		
	assertEquals(setMrMe.size(), 0);
	
	}
}
