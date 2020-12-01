public class NextDayCaculator {
    public static String nextDayCaculator(String date) {
        String[] dayStr = date.split("/");
        if(dayStr.length != 3)
            return "illegal";
        int day = Integer.parseInt(dayStr[0]);
        int month = Integer.parseInt(dayStr[1]);
        int year = Integer.parseInt(dayStr[2]);

        int maxDay = checkMonth(month, year);

        if(++day > maxDay){
            day = 1;
            if(++month > 12){
              month = 1;
              year++;
            }
        }
        return String.format("%d/%d/%d",day,month,year);

    }

    public static boolean checkYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int checkMonth(int month, int year){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2: return checkYear(year) ? 29 : 28;
            default: return -1;
        }
    }
}
