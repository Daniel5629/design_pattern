package strategy;

public class StrategyMain {
    public static void main(String[] args) {
        /**
         * <전략패턴>
         * 전략 패턴으로 불리며, 객체지향의 꽃이다.
         * 유사한 행위들을 캡슐화하여, 객체의 행위를 바꾸고 싶은 경우 직접 변경하는 것이 아닌 전략만 변경하여,
         * 유연하게 확장 하는 패턴
         *
         * <SOLID Principle>
         * 개방 폐쇄 원칙(Open-Close Principle)
         * 의존 역전 원칙(Dependency Inversion Principle)
         */

        Encoder encoder = new Encoder();

        // Base64
        EncodingStrategy base64 = new Base64Strategy();

        // Normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello world";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println("base64 result: " + base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println("normal result: " + normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println("append result: " + appendResult);
    }
}
