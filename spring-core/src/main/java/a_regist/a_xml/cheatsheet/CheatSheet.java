package a_regist.a_xml.cheatsheet;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CheatSheet {

    private Status status;
    private LocalDate now;

    public CheatSheet(LocalDate now) {
        this.now = now;
        System.out.println("매개변수 있는 생성자 호출 : " + now);
    }

    public void setStatus(Status status) {
        this.status = status;
        System.out.println("setStatus : " + status);
    }

    public void setNumber(int num) {
        System.out.println("setNumber : " + num);
    }

    public void setArray(String[] arr) {
        System.out.println("setArray : " + Arrays.toString(arr));
    }

    public void setList(List<?> list) {
        System.out.println("setList : " + list);
    }

    public void setSet(Set<?> set) {
        System.out.println("setSett : " + set);
    }

    public void setMap(Map<?, ?> map) {
        System.out.println("setMap : " + map);
    }

    public void setProperties(Properties properties) {
        System.out.println("setProperties : " + properties);
    }

    public void setScore(Score score) {
        System.out.println("setScore : " + score);
    }

    public void setScores(List<Score> scores) {
        System.out.println("setScores : " + scores);
    }




}
