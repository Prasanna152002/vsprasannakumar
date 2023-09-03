package Demo;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Logitics {
	public static void main(String[] args) throws IllegalAccessException {
//		String str=LocalDateTime.now().getMonth().toString();
//		System.out.println(str);
		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();
		System.out.print("Enter the number of Destinations : ");
		int n = sc.nextInt();
		op.add(n);
//		System.out.println("Enter the Date(yyyy:MM:dd:HH:mm)::");
//		String[] dat = sc.next().split(":");
//		int year = Integer.parseInt(dat[0]);
//		int month = Integer.parseInt(dat[1]);
//		int dayOfMonth = Integer.parseInt(dat[2]);
//		int hour = Integer.parseInt(dat[3]);
//		int minute = Integer.parseInt(dat[4]);
//		LocalDateTime lc = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
//
		LocalDateTime lc=LocalDateTime.now();
		lc=op.deliverytime(lc);
		System.out.println("The delivery time is "+lc.getDayOfMonth()+"-"+lc.getMonth()+"-"+lc.getYear()+" at "+lc.format(DateTimeFormatter
                .ofPattern("hh:mm:ss a")));
		//op.show();
	}
}

