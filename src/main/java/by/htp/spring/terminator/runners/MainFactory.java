package by.htp.spring.terminator.runners;

import by.htp.spring.terminator.terminatorModels.Terminator;
import by.htp.spring.terminator.terminatorModels.TerminatorFactory;

public class MainFactory {

	public static void main(String[] args) {
		Terminator t800=TerminatorFactory.getTerminator("T800");
		t800.showTarget();
		Terminator t1000=TerminatorFactory.getTerminator("T1000");
		t1000.showTarget();
	}
}
