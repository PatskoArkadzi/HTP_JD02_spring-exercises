package by.htp.spring.terminator.terminatorModels;

import by.htp.spring.terminator.targets.KillTarget;
import by.htp.spring.terminator.targets.SaveTarget;

public class TerminatorFactory {

	public static Terminator getTerminator(String value) {
		if ("T800".equals(value))
			return new T800(new SaveTarget("John Connor"));
		else if ("T1000".equals(value))
			return new T1000(new KillTarget("Sarah Connor"));
		else
			throw new IllegalArgumentException("Bad value: " + value);
	}
}
