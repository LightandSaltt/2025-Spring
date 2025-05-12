package regxp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;

public class RegExpTest {

    // 정규 표현식 : 패턴에 일치하는 문자열을 검색, 치환, 추출하는데 사용하는 표현식

    @Test
    void testBasic(){

        String str = "spring java javascript html";
        Pattern regExp = Pattern.compile("script");
        Matcher matcher = regExp.matcher(str);

        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
