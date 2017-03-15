package Patterns.TemplateMethod;

import Common.Pattern;
import Patterns.TemplateMethod.GameConnection.AbsGameConnectHelper;
import Patterns.TemplateMethod.GameConnection.DefaultGameConnectHelper;


/**
 * Template Method Pattern
 * @author admin
 * ���� : �˰����� ������ �޼ҵ忡 �����ϰ�, ���� Ŭ�������� �˰��� ������ �������
 * 		�˰����� ������ �ϴ� ����..?
 * 		- �����˰����� ���μ����� ���������� ��� (�ܰ躰�� ���� ����)
 * 		- ���� �˰����� ���� ���ɼ��� Ŭ ���
 * 
 * 		�˰����� �ܰ踦 ������, �ܰ踦 �޼ҵ�� �����Ѵ�.
 * 		ex) android�� AsyncTask �� ����,
 * 		preExecute -> doInBackground -> poastExecute ������ ����Ǵµ�,
 * 		����ڴ� �� ������ ���� ���� �ڵ带 �ۼ��Ѵ�.
 * 
 * ���� : ���� �˰����� ����Ҷ�, ������� �䱸������ ����Ǿ����� �ش� �κи� ����ϰ� �����ص� �ٸ� �κп� ������ ���� �ʴ´�.
 * 
 */
public class TemplateMethodPattern implements Pattern{

	@Override
	public void run() {
		AbsGameConnectHelper helper = new DefaultGameConnectHelper();
		helper.requestConnection("��ȣȭ����������");
	}

}
