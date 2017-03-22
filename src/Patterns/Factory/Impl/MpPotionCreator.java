package Patterns.Factory.Impl;

import java.sql.Date;

import Patterns.Factory.abstracts.Item;
import Patterns.Factory.abstracts.ItemCreator;

public class MpPotionCreator extends ItemCreator {

	@Override
	protected void getDatabaseInfo() {
		// TODO Auto-generated method stub
		System.out.println("Mp���� ������ �����ͺ��̽����� �����ɴϴ�.");
	}

	@Override
	protected void logItemCreateInfo() {
		System.out.println("MP���� ��������� �����ͺ��̽��� ����մϴ�. " + new Date(System.currentTimeMillis()));
		// TODO Auto-generated method stub
	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new MpPotion();
	}

}
