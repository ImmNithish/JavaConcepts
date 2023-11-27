package Datetime;
	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.LocalTime;
	import java.time.ZoneId;
	import java.time.format.DateTimeFormatter;
	import java.util.TimeZone;
public class Date {
		public static void main(String[] args) {
			LocalDate oDate1 = LocalDate.now();
			System.out.println("Current Date is : "+oDate1);
			System.out.println("Current date of month is : "+oDate1.getDayOfMonth());
			System.out.println("Current Day of year is : "+oDate1.getDayOfYear());
			System.out.println("Current Day of Week is : "+oDate1.getDayOfWeek());
			System.out.println("Get Current Month Value : "+oDate1.getMonthValue());
			System.out.println("Length of the year : "+oDate1.lengthOfYear());
			System.out.println("Length of the Month : "+oDate1.lengthOfMonth());
			System.out.println("Yesturday Date is : "+oDate1.minusDays(1));
			System.out.println("Next Date is : "+oDate1.plusDays(1));
			System.out.println("*************************");
			LocalDate oDate2 = LocalDate.of(1947, 8, 15);
			System.out.println("Current Date is : "+oDate2);
			System.out.println("Current date of month is : "+oDate2.getDayOfMonth());
			System.out.println("Current Day of year is : "+oDate2.getDayOfYear());
			System.out.println("Current Day of Week is : "+oDate2.getDayOfWeek());
			System.out.println("Get Current Month Value : "+oDate2.getMonthValue());
			System.out.println("Length of the year : "+oDate2.lengthOfYear());
			System.out.println("Length of the Month : "+oDate2.lengthOfMonth());
			System.out.println("Yesturday Date is : "+oDate2.minusDays(1));
			System.out.println("Next Date is : "+oDate2.plusDays(1));
			System.out.println("************TimeZone***********");
			String[] zoneIDs = TimeZone.getAvailableIDs();
			System.out.println(zoneIDs.length);
			for (String id : zoneIDs) {
				System.out.println(id);
			}
			System.out.println("Default Zone : "+TimeZone.getDefault());
			LocalDate oDate3 = LocalDate.now(ZoneId.of("Canada/Eastern"));
			System.out.println("Current Date is : "+oDate3);
			System.out.println("Current date of month is : "+oDate3.getDayOfMonth());
			System.out.println("Current Day of year is : "+oDate3.getDayOfYear());
			System.out.println("Current Day of Week is : "+oDate3.getDayOfWeek());
			System.out.println("Get Current Month Value : "+oDate3.getMonthValue());
			System.out.println("Length of the year : "+oDate3.lengthOfYear());
			System.out.println("Length of the Month : "+oDate3.lengthOfMonth());
			System.out.println("*****************************");
			LocalTime oTime1 = LocalTime.now();
			System.out.println("Time is : "+oTime1);
			
			LocalTime oTime2 = LocalTime.now(ZoneId.of("Canada/Eastern"));
			System.out.println("Time is : "+oTime2);
			
			LocalDateTime oDTime1 = LocalDateTime.now();
			System.out.println("Date and Time : "+oDTime1);
			
			DateTimeFormatter formatting = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss");
			System.out.println("Customized Date and Time format is : "+oDTime1.format(formatting));

	}
	}

