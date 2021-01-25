

   import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

    public class NextDayCalculator {
        //    public static String findAbsolute(int number) throws ParseException {
        public static String getNextDate (String  curDate) throws ParseException {
            final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            final java.util.Date date = format.parse(curDate);
            final Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            return format.format(calendar.getTime());
        }


    }


