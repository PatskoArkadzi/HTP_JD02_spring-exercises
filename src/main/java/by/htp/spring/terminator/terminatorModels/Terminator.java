package by.htp.spring.terminator.terminatorModels;

import by.htp.spring.terminator.targets.Target;

public abstract class Terminator {
	private Target target;

	public Terminator(Target target) {
		this.target = target;
	}
	public void showTarget() {
		this.target.show();
	}

}
