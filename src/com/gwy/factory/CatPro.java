package com.gwy.factory;


/**
 * ������
 * ���󹤳�ģʽ��
 * ������������࣬�������ܿ�ֱ�������µĹ����࣬����Ҫ�ı�ԭ���Ĵ���
 * @author Administrator
 *
 */
public class CatPro implements AnimalFactoryInter {

	@Override
	public Animal procedure() {
		return new Cat();
	}

}
