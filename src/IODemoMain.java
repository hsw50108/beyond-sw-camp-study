import com.encore.IODemo.IODemo;
import com.encore.stream.EncoreException;

import java.io.IOException;
import java.util.Arrays;

public class IODemoMain {
    public static void main(String[] args) throws EncoreException {
        IODemo demo = new IODemo();

        /*String msg = null;
        try {
            msg = demo.inputStr();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(msg);
        String[] strArray = msg.split(" ");

        int sum = 0;
        for (String s : strArray) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);

        System.out.println(Arrays.toString(strArray));*/


        // case02
//        int data = demo.inputInt();
//        System.out.println(data);
//        System.out.println();
//        System.out.println(">>> main finito <<<");

        // case03
//        demo.first(0);

        // case05
//        boolean flag = demo.outputFile();
//        String msg = (flag) ? "저장 성공" : "저장실패";
//        System.out.println(msg);

        // case06
        /*boolean flag = demo.outputObjFile();
        String msg = (flag) ? "저장 성공" : "저장실패";
        System.out.println(msg);
*/

        // case 07
//        demo.outputSerializable();
        demo.inputSerializable();

    }
}
