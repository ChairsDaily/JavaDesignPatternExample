package Patterns.Factory.Impl;

import java.sql.Date;

import Patterns.Factory.abstracts.Item;
import Patterns.Factory.abstracts.ItemCreator;

public class HpPotionCreator extends  ItemCreator{

	@Override
	protected void getDatabaseInfo() {
		System.out.println("HP���� ������ �����ͺ��̽����� �����ɴϴ�.");
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void logItemCreateInfo() {
		System.out.println("HP���� ��������� �����ͺ��̽��� ����մϴ�. " + new Date(System.currentTimeMillis()));
		// TODO Auto-generated method stub
	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new HpPotion();
	}

}
