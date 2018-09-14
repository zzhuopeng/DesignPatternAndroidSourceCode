package chapter20.adapter;

/**
 * 
 * @ClassName: Client
 * @Description: �ͻ���ʹ��չʾ��
 * @author zzp
 * @date 2018��8��28�� ����9:14:55
 *
 */
public class Client {

	public static void main(String[] args) {
		//�½�һ����������
		VoltAdapterClassMode mVoltAdapter = new VoltAdapterClassMode();
		System.out.println("�������� ת����ĵ�ѹΪ" + mVoltAdapter.getVolt5V() + "V");
		
		//�½�һ��Volt220V����
		Volt220V mVolt220v = new Volt220V();
		//�½�һ������������
		VoltAdapterInstanceMode mAdapterInstanceMode = new VoltAdapterInstanceMode(mVolt220v);
		System.out.println("���������� ת����ĵ�ѹΪ" + mAdapterInstanceMode.getVolt5V() + "V");
	}

}
