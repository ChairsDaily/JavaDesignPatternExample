package Patterns.Strategy;

import Patterns.Strategy.Weapons.Weapon;

public class GameCharacter {
	private Weapon equippedWeapon;
	
	public void setWeapon(Weapon weapon){
		equippedWeapon = weapon;
	}
	
	//Interface�� Weapon�� attack() �� ȣ���Ѵ�. (Delegate)
	//�̶�, Weapon�� Sword����, Spear������ ������� ��밡���ϴ� 
	public void attack(){
		System.out.println(equippedWeapon.attack() + "(��)�� �����ߴ�!");
	}
}
