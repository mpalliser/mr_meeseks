package org.foobarspam.examenJunio.box.mrmeeseks;

import java.util.ArrayList;

public class ProxyMrMeeseeks {
	
	private ArrayList<MrMeeseeks> mrMeeseeksList;
	
	ProxyMrMeeseeks () {
	}
	
	public ArrayList<MrMeeseeks> getMrMeeseeksList() {
		return mrMeeseeksList;
	}

	public void setMrMeeseeksList(ArrayList<MrMeeseeks> mrMeeseeksList) {
		this.mrMeeseeksList = mrMeeseeksList;
	}

	public void pushButton(ArrayList<MrMeeseeks> mrMeeseeksList) {
		setMrMeeseeksList(mrMeeseeksList);
	}

}
