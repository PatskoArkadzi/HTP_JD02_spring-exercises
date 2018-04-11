package by.htp.spring.terminator.targets;

public abstract class AbstractTarget implements Target{
	protected String value;

	public AbstractTarget(String value) {
		this.value = value;
	}
}
