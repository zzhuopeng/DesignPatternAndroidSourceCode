package chapter20.adapter;

/**
 * 
 * @ClassName: Client
 * @Description: 客户端使用展示。
 * @author zzp
 * @date 2018年8月28日 下午9:14:55
 *
 */
public class Client {

	public static void main(String[] args) {
		//新建一个类适配器
		VoltAdapterClassMode mVoltAdapter = new VoltAdapterClassMode();
		System.out.println("类适配器 转换后的电压为" + mVoltAdapter.getVolt5V() + "V");
		
		//新建一个Volt220V对象
		Volt220V mVolt220v = new Volt220V();
		//新建一个对象适配器
		VoltAdapterInstanceMode mAdapterInstanceMode = new VoltAdapterInstanceMode(mVolt220v);
		System.out.println("对象适配器 转换后的电压为" + mAdapterInstanceMode.getVolt5V() + "V");
	}

}
