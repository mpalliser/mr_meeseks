package org.foobarspam.examenJunio.box.mrmeeseks;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

import org.foobarspam.examenJunio.interfaces.Doable;

public class MrMeeseeks implements Doable{
	
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
	private String[] messageOnRequest = {"Oooh yeah! Can do!", "Yes sireee!", "Oh, yeah! Yes, ma'am!"};
			
	public MrMeeseeks() {
		this.id = ID_GENERATOR.incrementAndGet();
	}
	
	public Integer getId() {
		return id;
	}

	public String doRequest(String accion, String objeto) {
		return accion + objeto;
	}
	
	
	public void sayMessageOnCreate() {
		System.out.println("Im Mr Meeseeks " + id + ". Look at meeee!");
	}
	
	public void sayMessageOnRequest() {
	
		System.out.println(generateMessageOnRequest());
	}
	
	public void sayMessageOnDone(String string, String string2) {
		System.out.println(string + string2);
	}

	public String generateMessageOnRequest() {
		
		return this.messageOnRequest[ThreadLocalRandom.current().nextInt(0,this.messageOnRequest.length)];
	}

	public void formulateRequest(String string, String string2) {
		
		sayMessageOnRequest();
		
		System.out.println(doRequest(string, string2));
		
		
	}
	
	
}
