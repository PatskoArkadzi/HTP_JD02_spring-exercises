package by.htp.spring.terminator.runners;

import by.htp.spring.terminator.targets.KillTarget;
import by.htp.spring.terminator.targets.SaveTarget;
import by.htp.spring.terminator.terminatorModels.T800;
import by.htp.spring.terminator.terminatorModels.Terminator;

public class MainSimple {
	public static void main(String[] args) {
		Terminator t800=new T800(new SaveTarget("John Connor"));
		t800.showTarget();
		Terminator t1000=new T800(new KillTarget("Sarah Connor"));
		t1000.showTarget();
	}
	

}
