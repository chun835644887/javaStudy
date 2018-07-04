import java.time.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1);
        DayOfWeek weekend = date.getDayOfWeek();
        int value = weekend.getValue();
        System.out.println(" 一 二 三 四 五 六 日");
        for(int i = 1; i < value; i ++){
            while (date.getMonthValue() == month){
                System.out.printf("%3d",date.getDayOfMonth());
                if(date.getDayOfMonth() == today){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                date = date.plusDays(1);
                if(date.getDayOfWeek().getValue() == 1){
                    System.out.println();
                }
            }
            if(date.getDayOfWeek().getValue() != 1){
                System.out.println();
            }
        }
    }
}
