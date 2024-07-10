import com.encore.hms.domain.StudentDto;
import com.encore.hms.domain.sup.Person;

import java.util.StringTokenizer;

public class StringTokenMain {
    public static void main(String[] args) {
        String data = "임정섭:20:서울:1992";
        StringTokenizer token = new StringTokenizer(data, ":");

        /*
        StudentDto stu = new StudentDto(
                token.nextToken(),
                Integer.parseInt(token.nextToken()),
                token.nextToken(),
                token.nextToken());
*/
        String[] ary = data.split(":");
        StudentDto stu = new StudentDto(ary[0], Integer.parseInt(ary[1]) , ary[2], ary[3]);
        System.out.println(stu.printInfo());

    }
}
