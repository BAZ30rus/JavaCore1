import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(RequestSender.getCityIdRequest("Moscow"));
        System.out.println(RequestSender.sentTempRequest("294021"));
    }
}
