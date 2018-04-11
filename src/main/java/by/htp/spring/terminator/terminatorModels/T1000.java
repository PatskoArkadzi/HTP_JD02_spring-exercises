package by.htp.spring.terminator.terminatorModels;

import by.htp.spring.terminator.targets.Target;

public class T1000 extends Terminator {

	public T1000(Target target) {
		super(target);
	}
	
	@Override
	public void showTarget() {
		System.out.println(T1000.class.getSimpleName()+" target: ");
		super.showTarget();
	}
}
