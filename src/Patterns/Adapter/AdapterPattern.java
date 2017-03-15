package Patterns.Adapter;

import Common.Pattern;

/**
 * Adapter Pattern
 * @author admin
 *
 * ���� : Ư�� ��ü�� Method�� �ٸ� ���·� ��ȯ�Ͽ� ����ϰ��� �Ҷ�.
 * 		������� A����� ��ȯ�� ���� Double�� ��, Adapter�� ���� � ������ String ������
 * 		��ȯ��ų �� �ְ� �����.
 * 		��ɸ�ô� ������ �پ��� ��ü�鿡�� �ٸ� ����� �䱸�ϴ� ��� ��� �����ϴ�.
 * 		A -> Adapter -> A' ����� �� �� �ִ�
 * 		���� �ʿ��� ������, A�� ���̺귯�����·� �����Ǵ� ���,
 * 		��� ���̿� Log�� ����ϰų� �䱸���׿� ���� ����� �ٲ� �ֱ�����
 * 		(�˰����� ���ϴ� �䱸���׿� �°� ������ �� �ִ�) 
 * 		������ ���ڸ� 110V �ܼ�Ʈ�� 220V ����͸� ����� 220V�� ��µǴ°�.
 * 
 * ���� : ����ϴ� ��ü���� �ڵ带 ������ �ʿ� ���� �䱸���׿� ���� ������ �� �ִ�.
 * (Android RecyclerView �� Adapter�� �����غ���,
 * RecyclerView�� ������ Adapter�� ������ �ڵ忡 ���� �پ��� ���·� ��µǴ� ���̴�.)
 *   
 */
public class AdapterPattern implements Pattern {

	/**
	 * Math�� int ���� adapter�� ���� String�� ��ȯ�Ǵ� ����� �� �� �ִ�.
	 * �ڵ�󿡼��� ��� �� ���� ����...
	 */
	@Override
	public void run() {
		AdapterImpl adapter = new AdapterImpl();
		
		System.out.println(adapter.doubleValue(100));
		System.out.println(adapter.halfValue(50));
	}

}
