package chapter20.adapter;

/**
 * 
 * @ClassName: VoltAdapter
 * @Description: Adapter类。完成了从220V到5V的转换。
 * @author zzp
 * @date 2018年8月28日 下午9:01:02
 *
 * 类适配器模式，主要是通过extends Adaptee和implements Target实现。
 */
public class VoltAdapterClassMode extends Volt220V implements FiveVolt {

	@Override
	public int getVolt5V() {
		// 首先获得220V电压
		int before = getVolt220V();
		// 然后转换，具体逻辑根据实际业务实现
		int after = before / 44;
		// 将转换后的电压返回即可
		return after;
	}

}
