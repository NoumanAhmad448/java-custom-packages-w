package DateBuilder;
public class DateBuilder{

    /**
     * @description
     *  getCustomDate gives you next or previous date depending upon the
     *   number of days your want
     *
     * ### @examples
     * getCustomDate("year-month-date",2) returns date that comes after
     *   two days in the format "year-month-date"
     *
     * getCustomDate("year-month-date",-2) returns date that comes before
     *   two days in the format "year-month-date"
     *
     * @return string
     * @author Nouman Ahmad
     */
    public static String getCustomDate(String dateFormator, int days){
        int[] calculatedDate = DateBuilder.dateMaker(dateFormator);
        LocalDate finalDate = LocalDate.of(calculatedDate[0], calculatedDate[1], calculatedDate[2]);
        return (days < 0 ? finalDate.minusDays(days*(-1)) : finalDate.plusDays(days)).toString();
    }


    private static int[] dateMaker(String dateFormator){
        String[] date = dateFormator.split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        int[] finalDate = {year, month, day};
        return finalDate;
    }
}