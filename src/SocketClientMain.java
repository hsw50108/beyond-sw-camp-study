import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClientMain {

    public static void main(String[] args) throws IOException {
        Socket socket = null;
        BufferedWriter bw = null;

        try {
            socket = new Socket("192.168.0.85", 7777);
            System.out.println(socket + "연결됨...");

            // 소켓을 통해서 서버와 연결된 스트림을 만들어 놓는 작업
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            // 클라이언트 메시지를 얻기 위해서 만들어 놓은 스트림
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("send message : ");
                String message = scanner.nextLine();
                bw.write(message);
                bw.newLine();
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }


    }
}
