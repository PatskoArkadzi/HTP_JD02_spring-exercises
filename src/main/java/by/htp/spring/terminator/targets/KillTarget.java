package by.htp.spring.terminator.targets;

public class KillTarget extends AbstractTarget{

	public KillTarget(String value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		System.out.println("Kill "+value);
	}
}
