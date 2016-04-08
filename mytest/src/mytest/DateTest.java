package mytest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String defaultDate = sdf.format(cal.getTime());
		System.out.println(defaultDate);
	}

}
