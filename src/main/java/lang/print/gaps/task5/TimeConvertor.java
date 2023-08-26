package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        float seconds = minutes * 60; // 1 minute = 60 seconds
        System.out.println(seconds);
    }

    public static void main(String[] args) {
        TimeConvertor converter = new TimeConvertor();
        float minutesToConvert = 5.5f;
        converter.convert(minutesToConvert);
    }
}
