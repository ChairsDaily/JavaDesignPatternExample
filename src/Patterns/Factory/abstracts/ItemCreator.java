package Patterns.Factory.abstracts;

/**
 * Item Factory
 * @author Lain
 *
 * ItemCreator�� Ÿ Item Factory�� �����̴�.
 * �������� �����ϱ����ؼ��� �Ϸ��� �˰����� �����ϴµ�,
 * TemplateMethod Pattern�� ���� ���� ������ create,
 * ���� �˰����� abstract�� ���� ������ ������ ���� �ڽ� Ŭ�������� �ñ��.
 */
public abstract class ItemCreator {
	protected abstract void getDatabaseInfo();
	protected abstract void logItemCreateInfo();
	protected abstract Item createItem();
	
	public Item create(){
		getDatabaseInfo();
		Item item = createItem();
		logItemCreateInfo();
		return item;
	}
}
