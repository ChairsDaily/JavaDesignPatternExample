package Patterns.TemplateMethod.GameConnection;

/**
 * AbsGameConnectHelper 
 * @author admin
 *
 * AbsGameConnectHelper �� ����Ŭ������ �޾� ���������� ���Ǵ� �ڵ�.
 * �Ʒ��� override �� �ڵ�� ���� requestConnection�� ���� ���Ǵ� ���� �����̴�.
 */
public class DefaultGameConnectHelper extends AbsGameConnectHelper {

	@Override
	protected String[] doSecurity(String string) {
		// ��ȣȭ ������ ��ģ�ٰ� �����Ѵ�.
		String[] result = new String[2];
		result[0] = "123";
		result[1] = "password";
		System.out.println("��ȣȭ ����");
		return result;
	}

	@Override
	protected boolean authentication(String id, String password) {
		// id�� password�� ������ �����ϴ��� Ȯ���Ѵٰ� �����Ѵ�.
		// ������� �����ͺ��̽� ����.
		System.out.println("Ȯ�ΰ���");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// ������ ������ Ȯ���Ѵٰ� �����Ѵ�. ���, ���� ���� ���� ���̴�.
		System.out.println("���� Ȯ�� ����");
		return 1;
	}

	@Override
	protected String connection(String info) {
		// ���� ������ ����Ѵ�. �����ȯ�̳� Ư�� ó���� ����� ���̴�.
		System.out.println("����Ȯ��");
		return info;
	}

}
