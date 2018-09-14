package chapter20.adapter;

/**
 * 
 * @ClassName: VoltAdapterInstanceMode
 * @Description: Adapter�ࡣ����˴�220V��5V��ת����
 * @author zzp
 * @date 2018��8��28�� ����9:22:54
 *
 *       ����������ģʽ����Ҫ��ͨ��implements�Լ���Adaptee������ʵ�֡�
 */
public class VoltAdapterInstanceMode implements FiveVolt {

	// ���ö���
	Volt220V mVolt220V;

	// ���ö����ʼ��
	public VoltAdapterInstanceMode(Volt220V mVolt220V) {
		this.mVolt220V = mVolt220V;
	}

	@Override
	public int getVolt5V() {
		// ���Ȼ��220V��ѹ
		int before = mVolt220V.getVolt220V();
		// Ȼ��ת���������߼�����ʵ��ҵ��ʵ��
		int after = before / 44;
		// ��ת����ĵ�ѹ���ؼ���
		return after;
	}

}
