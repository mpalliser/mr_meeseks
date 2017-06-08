package org.foobarspam.examenJunio.box.mrmeeseks;

import java.util.ArrayList;

public class ProxyMrMeeseeks {
	
	private MrMeeseeks mrmeeseek;
	
	public ProxyMrMeeseeks () {
	}
	
	public MrMeeseeks getMrMeeseek() {
		return mrmeeseek;
	}

	public void setMrMeeseek(MrMeeseeks mrmeeseek) {
		this.mrmeeseek = mrmeeseek;
	}

	public void pushButton(ArrayList<MrMeeseeks> mrMeeseeksList) {
		setMrMeeseek(mrMeeseeksList.get(0));
		mrmeeseek.sayMessageOnCreate();
	}

	public MrMeeseeks getMrMe() {
		
		return mrmeeseek;
	}

}
