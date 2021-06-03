package proxy;

public class ProxyMain {
    public static void main(String[] args) {
        /**
         * <프록시 패턴>
         * Proxy(대리인) class를 통해서 대신 전달하는 형태
         * 실제 사용자는 Proxy로부터 결과를 받는다.
         * Cache의 기능으로도 활용이 가능하다.
         *
         * <SOLID Principle>
         * 개방 폐쇄 원칙(Open-Close Principle)
         * 의존 역전 원칙(Dependency Inversion Principle)
         *
         */

        // 매번 로딩이 일어남 (캐싱 기능이 없음)
        IBrowser browser = new Browser("www.naver.com");
        browser.show(); // loading... html from:www.naver.com
        browser.show(); // loading... html from:www.naver.com
        browser.show(); // loading... html from:www.naver.com
        browser.show(); // loading... html from:www.naver.com


        IBrowser browserProxy = new BrowserProxy("www.naver.com");
        browserProxy.show(); // BrowserProxy loading... html from: www.naver.com
        browserProxy.show(); // BrowserProxy use cache html from: www.naver.com
        browserProxy.show(); // BrowserProxy use cache html from: www.naver.com
        browserProxy.show(); // BrowserProxy use cache html from: www.naver.com
    }
}
