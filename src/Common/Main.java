package Common;

import Patterns.Adapter.AdapterPattern;
import Patterns.Factory.FactoryPattern;
import Patterns.Strategy.StrategyPattern;
import Patterns.TemplateMethod.TemplateMethodPattern;

public class Main {	
	public static void main(String args[]){
		/**
		 * Pattern ���
		 * - Strategy ���� ) Inteface�� Delegation�Ѵ�.
		 * - Adapter ���� ) Adapter�� ���� ���� ��ü�� ��ȯ���� �䱸���׿� ���� ��ȯ���� �����ų �� �ִ�.
		 * - TemplateMethod ���� ) Ư�� �˰����� ������ ���� method�� �ɰ�, ����� �ش� �κи� �ٲ� �� �ֵ��� ���� �� �ִ�.
		 * 						 (���������� ������, ���ȿ䱸���װ��� ���� �ٲ� �� �ִ� ���)
		 * - Factory ���� ) Ư����ü�� �����ϱ������ �˰����� ���ø��޼ҵ��������� �������ϰ�, ������ ��ü�� ��� ������
		 */
		
		//new StrategyPattern().run();
		//new AdapterPattern().run();
		//new TemplateMethodPattern().run();
		new FactoryPattern().run();
	}
}
