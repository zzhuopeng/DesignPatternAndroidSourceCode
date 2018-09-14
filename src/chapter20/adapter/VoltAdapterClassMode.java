package chapter20.adapter;

/**
 * 
 * @ClassName: VoltAdapter
 * @Description: Adapter�ࡣ����˴�220V��5V��ת����
 * @author zzp
 * @date 2018��8��28�� ����9:01:02
 *
 * ��������ģʽ����Ҫ��ͨ��extends Adaptee��implements Targetʵ�֡�
 */
public class VoltAdapterClassMode extends Volt220V implements FiveVolt {

	@Override
	public int getVolt5V() {
		// ���Ȼ��220V��ѹ
		int before = getVolt220V();
		// Ȼ��ת���������߼�����ʵ��ҵ��ʵ��
		int after = before / 44;
		// ��ת����ĵ�ѹ���ؼ���
		return after;
	}

}
