package facade;

public class FacadeMain {
    public static void main(String[] args) {
        /**
         * <파사드 패턴>
         * Facade는 건물의 앞쪽 정면 이라는 뜻을 가진다.
         * 여러개의 객체와 실제 사용하는 서브 객체의 사이에 복잡한 의존관계가 있을때,
         * 중간에 Facade라는 객체를 두고, 여기에 제공하는 interface만을 활용하여 기능을 사용하는 방식이다.
         * Facade는 자신이 가지고 있는 각 클래스의 기능을 명확히 알아야 한다.
         *
         */


        // 파사드 적용전
        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();

        // 파사드 적용후
        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();


    }
}
