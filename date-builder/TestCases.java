import java.time.LocalDate;
class Main{
    public class DateBuilder{

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
    public static void main(String[] args){
        String finalDate = DateBuilder.getCustomDate("2022-02-22", 2);
        System.out.println(finalDate);

        String finalDate1 = DateBuilder.getCustomDate("2022-02-22", -2);
        System.out.println(finalDate1);
    }
}