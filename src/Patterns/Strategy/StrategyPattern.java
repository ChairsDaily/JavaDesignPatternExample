package Patterns.Strategy;

import Common.Pattern;
import Patterns.Strategy.Weapons.Spear;
import Patterns.Strategy.Weapons.Sword;

/**
 * Strategy(����) Pattern
 * @author admin
 *
 * ���� : Interface�� �Լ��� �����ϰ�, �ش� �Լ��� ���� �ٸ� ��ü�� �Լ��� ȣ���ϴ� ���.
 * 		�ܼ��� ���� Interface�� method �μ� set �� ��ü�� �Լ��� �ҷ��´ٰ� �����ϸ� ��.
 * ���� : ���� ����� �����ϴ� ��ü�� ���ο� �߰���, ���ٸ� �ڵ��� �߰� ���� ��ü�� �߰��� �� �ִ�.
 * (��ü�� Dependency�� ���� �� ����)
 *   
 */
public class StrategyPattern implements Pattern{
	@Override
	public void run() {
		/**
		 * ���� �ó�����
		 * class Character�� weapon�� ������.
		 * weapon�� interface��, weapon�� �� �� �ִ� ���� �����̶�� ����� �ִ�.
		 * 
		 * ������� ���� ��ü�� �����ǰ�, ������ �� ������ �ȴ�.
		 * Character�� ���⸦ ������ �� �ְ�(setWeapon)
		 * ������ ���⸦ ����� �� �ִ�.
		 */
		
		System.out.println("���� ĳ���� ����");
		GameCharacter gCharacter = new GameCharacter();
		
		//���� ����
		Sword sword = new Sword();
		Spear spear = new Spear();
		
		//���� ����
		gCharacter.setWeapon(sword);
		
		System.out.println("���� ����");
		gCharacter.attack();
		System.out.println("���� ��ü �� �� ����");
		
		gCharacter.setWeapon(spear);
		gCharacter.attack();
	}

}
