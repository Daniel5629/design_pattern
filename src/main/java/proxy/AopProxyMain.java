package proxy;

import java.util.concurrent.atomic.AtomicLong;

public class AopProxyMain {
    public static void main(String[] args) {

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();


        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );

        aopBrowser.show();
        System.out.println("loading time: " + end.get()); // 1500 이상

        aopBrowser.show();
        System.out.println("loading time: " + end.get()); // 0
    }
}
