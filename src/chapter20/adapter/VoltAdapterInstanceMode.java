package chapter20.adapter;

/**
 * 
 * @ClassName: VoltAdapterInstanceMode
 * @Description: Adapter类。完成了从220V到5V的转换。
 * @author zzp
 * @date 2018年8月28日 下午9:22:54
 *
 *       对象适配器模式，主要是通过implements以及对Adaptee的引用实现。
 */
public class VoltAdapterInstanceMode implements FiveVolt {

	// 引用对象
	Volt220V mVolt220V;

	// 引用对象初始化
	public VoltAdapterInstanceMode(Volt220V mVolt220V) {
		this.mVolt220V = mVolt220V;
	}

	@Override
	public int getVolt5V() {
		// 首先获得220V电压
		int before = mVolt220V.getVolt220V();
		// 然后转换，具体逻辑根据实际业务实现
		int after = before / 44;
		// 将转换后的电压返回即可
		return after;
	}

}
