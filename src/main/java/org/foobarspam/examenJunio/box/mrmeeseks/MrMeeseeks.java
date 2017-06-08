package org.foobarspam.examenJunio.box.mrmeeseks;

import java.util.concurrent.atomic.AtomicInteger;

import org.foobarspam.examenJunio.interfaces.Doable;

public class MrMeeseeks implements Doable{
	
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
			
	public MrMeeseeks() {
		this.id = ID_GENERATOR.incrementAndGet();
	}
	
	public Integer getId() {
		return id;
	}

	public String doRequest(String accion, String objeto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void sayMessageOnCreate() {
		System.out.println("Im Mr Meeseeks " + id + ". Look at meeee!");
	}

	public void formulateRequest(String string, String string2) {
		
	}
	



}
