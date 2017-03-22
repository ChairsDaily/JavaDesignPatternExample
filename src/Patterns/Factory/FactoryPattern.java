package Patterns.Factory;

import Common.Pattern;
import Patterns.Factory.Impl.HpPotion;
import Patterns.Factory.Impl.HpPotionCreator;
import Patterns.Factory.Impl.MpPotion;
import Patterns.Factory.Impl.MpPotionCreator;

/**
 * FactoryPattern
 * @author Lain
 * ! FactoryPattern�� TemplateMethod ������ �����Ѵ�.
 * ! TemplateMethod = Ư�� �˰����� ������ �������� ĸ��ȭ ��Ű�°�
 *
 * ���� : �ݺ����� ��ü�� �����Ҷ� �ʿ��� �˰����� �⺻�����ϰ�, Factory Class���� ����Ͽ� ���� �ν��Ͻ��� ����
 * 		   �� �� �ְ� �����Ѵ�. ������ �Ҹ�������̳� DB Data�� �ݺ������� �����;� �ϴ� ���,
 * 		   �ٸ� �ҽ��� ���� ���� creator �Լ��� �����ϴ� ������ ��� �ν��Ͻ��� ������ �� �� �ִ�.
 * 		   ��� ������ �ڵ��� ������ ���� ������ �и��� ������ǥ�� �Ѵ�.
 * 		   (���� �����ѹ����� ���� ������ �ϴ� ��� �ʿ��� �κп� ������ �� �� �ִ�.)
 * 
 * ���� : �⺻ ������ ������ ������ ����.
 *   
 */
public class FactoryPattern implements Pattern{
	/**
	 * Factory ������ ������ ������ �Ѵ�.
	 * �ó������� �Ʒ��� ����.
	 * ������ �����ϴ� Creator�� �����Ѵ�.
	 * ������ ������ �����ͺ��̽����� ������ �ҷ�����, ���縦 �����ϱ� ���� �α׸� �����.
	 * ������ Item �̶�� Interface�� ������, Item Interface�� use() �� ������.
	 */

	@Override
	public void run() {
		// TODO Auto-generated method stub
		HpPotionCreator hpPotionCreator = new HpPotionCreator();
		MpPotionCreator mpPotionCreator = new MpPotionCreator();
		
		HpPotion hpPotion = (HpPotion) hpPotionCreator.create();
		MpPotion mpPotion = (MpPotion) mpPotionCreator.create();
		
		hpPotion.use();
		mpPotion.use();
		
	}

}
