package Demo;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Operation {
	Scanner sc = new Scanner(System.in);
	Map<String, LocalTime> mp = new HashMap<>();
	String st = null;

	public void add(int n) {
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				System.out.print("Enter the Destination-" + i + " : ");
				String str = sc.next();
				st = str;
				mp.put(str, LocalTime.of(0, 0));
			} else {
				System.out.print("Enter the Destination-" + i + " : ");
				String str = sc.next();
				System.out
						.print("Enter the Time taken from " + st + " to " + str + " (Enter time in Hours:Minutes) : ");
				String[] b = sc.next().split(":");
				LocalTime lt = LocalTime.of(Integer.parseInt(b[0]), Integer.parseInt(b[1]));
				mp.put(str, lt);
				st = str;
			}
		}
	}

	public void show() {
		for (Map.Entry<String, LocalTime> lt : mp.entrySet()) {
			System.out.println("Destination : " + lt.getKey() + " Time : " + lt.getValue());
		}
	}

	public LocalDateTime deliverytime(LocalDateTime lc) throws IllegalAccessException {
		for (Map.Entry<String, LocalTime> lt : mp.entrySet()) {
			lc = lc.plusHours(lt.getValue().getHour()).plusMinutes(lt.getValue().getMinute());
			Leave l;
			try {
				l = (Leave) Class.forName("Demo." + lc.getDayOfWeek().toString()).newInstance();
				lc = l.Days(lc);
			} catch (Exception e) {
				//System.out.println("Oopsday");
				lc = lc;
			}
			try {
				l = (Leave) Class.forName("Demo." + lc.getMonth().toString()).newInstance();
				lc = l.Days(lc);
			} catch (Exception e) {
				//System.out.println("OopsMonth");
				lc = lc;
			}
		}
		return lc;
	}

}

abstract class Leave {
	abstract LocalDateTime Days(LocalDateTime lc);
}

class SUNDAY extends Leave {
	@Override
	LocalDateTime Days(LocalDateTime lc) {
		return lc.plusHours(24).plusMinutes(0);
	}
}

class SATURDAY extends Leave {
	@Override
	LocalDateTime Days(LocalDateTime lc) {
		lc = lc.plusHours(24).plusMinutes(0);
		if (lc.getDayOfWeek() == DayOfWeek.SUNDAY) {
			lc = new SUNDAY().Days(lc);
		}
		return lc;
	}
}

class JANUARY extends Leave {
	@Override
	LocalDateTime Days(LocalDateTime lc) {
		Days d;
		try {
			d = (Days) Class.forName("Demo.DayJ_" + Integer.toString(lc.getDayOfMonth())).newInstance();
			return d.holy(lc);
		} catch (Exception e) {
			return lc;
		}

	}

}

class AUGUST extends Leave {
	@Override
	LocalDateTime Days(LocalDateTime lc) {
		Days d;
		try {
			d = (Days) Class.forName("Demo.DayA_" + Integer.toString(lc.getDayOfMonth())).newInstance();
			return d.holy(lc);
		} catch (Exception e) {
			return lc;
		}

	}
}

class FEBRUARY extends Leave {
	@Override
	LocalDateTime Days(LocalDateTime lc) {
		Days d;
		try {
			d = (Days) Class.forName("Demo.DayF_" + Integer.toString(lc.getDayOfMonth())).newInstance();
			return d.holy(lc);
		} catch (Exception e) {
			return lc;
		}

	}
}

abstract class Days {
	abstract LocalDateTime holy(LocalDateTime lc);
}

class DayJ_1 extends Days {
	@Override
	LocalDateTime holy(LocalDateTime lc) {
		return lc.plusHours(24).plusMinutes(0);
	}
}

class DayJ_26 extends Days {
	@Override
	LocalDateTime holy(LocalDateTime lc) {
		return lc.plusHours(24).plusMinutes(0);
	}
}

class DayA_15 extends Days {
	@Override
	LocalDateTime holy(LocalDateTime lc) {
		return lc.plusHours(24).plusMinutes(0);
	}
}

class DayF_29 extends Days {
	@Override
	LocalDateTime holy(LocalDateTime lc) {
		return lc.plusHours(24).plusMinutes(0);
	}
}
