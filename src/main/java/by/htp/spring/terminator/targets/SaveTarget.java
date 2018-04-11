package by.htp.spring.terminator.targets;

public class SaveTarget extends AbstractTarget {

	public SaveTarget(String value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		System.out.println("Save "+value);
	}
}
