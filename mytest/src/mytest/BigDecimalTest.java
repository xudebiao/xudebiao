package mytest;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

//		BigDecimal b = new BigDecimal(0.0001);
//		b.setScale(4, BigDecimal.ROUND_HALF_UP);
//		System.out.println(b.toEngineeringString());
		String a = "1.00012123142523465265";
		BigDecimal b = new BigDecimal(a);
		if(a.compareTo("0.001") < 0){
			b = new BigDecimal(a,new MathContext(1, RoundingMode.HALF_UP));
			System.out.println(1);
		}else if(a.compareTo("0.01") < 0){
			b = new BigDecimal(a,new MathContext(2, RoundingMode.HALF_UP));
			System.out.println(2);
		}else if(a.compareTo("0.1") < 0){
			b = new BigDecimal(a,new MathContext(3, RoundingMode.HALF_UP));
			System.out.println(3);
		}else if(a.compareTo("1") < 0){
			b = new BigDecimal(a,new MathContext(4, RoundingMode.HALF_UP));
			System.out.println(4);
		}else{
			b = new BigDecimal(a,new MathContext(5, RoundingMode.HALF_UP));
			System.out.println(4);
		}
		System.out.println(b.toEngineeringString());
	}

}
