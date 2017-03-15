package Patterns.Adapter;


/**
 * Adapter Interface�� �Լ��� �����ϴ� ��ü��,
 * ������ �ִ� Math Library�� int �� ��ȯ�� �ϴµ� ����,
 * �䱸�����̾��� float�� ��ȯ�� ���� ���� ���������.
 */
public class AdapterImpl implements Adapter {
	private Math math = new Math();

	@Override
	public String doubleValue(int f) {
		String result = String.valueOf(math.doubleValue(f));
		return result;
	}

	@Override
	public String halfValue(int f) {
		String result = String.valueOf(math.halfValue(f));
		return result;
	}
}
