package Patterns.Adapter;

/**
 * ���̺귯�� ���·� ������ Math �Լ���� �����Ѵ�.
 * Math�� int�� �����͸� �ι�� ��ȯ�ϰų� �������� ��ȯ�ϴ� �Լ��� �����Ѵ�.
 */
public class Math {
	public int doubleValue(int value){ return value * 2; }
	public int halfValue(int value){ return value / 2; }
	//divide by 0 exception ó���� ���� �ʾ���
}
