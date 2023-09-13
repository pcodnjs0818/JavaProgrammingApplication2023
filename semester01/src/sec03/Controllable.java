package sec03;

public interface Controllable {
	default void repair() {
		show("��� �����Ѵ�.");
	}

	static void reset() {
		System.out.println("��� �ʱ�ȭ�Ѵ�.");
	}

	private void show(String s) {
		System.out.println(s);
	}

	void turnOn();
	void turnOff();
}