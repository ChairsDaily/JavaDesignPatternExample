package Patterns.TemplateMethod.GameConnection;

/**
 * 
 * @author admin
 * ������ ���� ����� ���� ���� Ŭ�����̴�.
 * ������
 * ���ȴܰ� -> �����ܰ� -> �����Ǳ��� üũ�ܰ� -> ���Ӵܰ� ������ ����ȴ�.
 * �˰����� �ܺγ����� ���� ���� protected�� �����Ǿ�� �Ѵ�.
 * (abstract �̱� ������ �����ǰ� �� �ʿ��ѵ�, private�� ����Ŭ������ ��ӹ��� ���Ѵ�)
 *
 */
public abstract class AbsGameConnectHelper {
	protected abstract String[] doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);

	public String requestConnection(String encodedInfo){
		String[] decodedInfo = doSecurity(encodedInfo); // ���ڿ� ��ȣȭ����
		
		//�����ϴ� ����� �������� Ȯ��
		String id = decodedInfo[0];
		String password = decodedInfo[1];
		if(authentication(id, password)){
			//����ڰ� ������ ���, ������ Ȯ��
			int userClass = authorization(id); 
			
			//����
			if(userClass == 1){
				return connection("connected");
			}			
		}
		return "not connected";
	}
}
