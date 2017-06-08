package org.foobarspam.examenJunio.box.mrmeeseks;

import java.util.ArrayList;

public class ProxyMrMeeseeks {
	
	private MrMeeseeks mrmeeseek;
	
	public ProxyMrMeeseeks () {
	}
	
	public MrMeeseeks getMrMeeseek() {
		return mrmeeseek;
	}

	public void createMrMeeseeks(ArrayList<MrMeeseeks> mrMeeseeksList) {
		
		mrmeeseek = new MrMeeseeks();
		mrMeeseeksList.add(mrmeeseek);
		
	}

	public void pushButton(ArrayList<MrMeeseeks> mrMeList) {
		
		createMrMeeseeks(mrMeList);
		mrmeeseek.sayMessageOnCreate();
	}

	public MrMeeseeks getMrMe() {
		
		return mrmeeseek;
	}

}
