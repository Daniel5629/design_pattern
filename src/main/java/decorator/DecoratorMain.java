package decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        /**
         * <데코레이터 패턴>
         * 기존 뼈대(클래스)는 유지하되
         * 이후 필요한 형태로 꾸밀 때 사용한다.
         * 확장이 필요한 경우 상속의 대안으로도 활용한다.
         *
         * <SOLID Principle>
         * 개방 폐쇄 원칙(Open-Close Principle)
         * 의존 역전 원칙(Dependency Inversion Principle)
         */

        ICar audi = new Audi(1000);
        audi.showPrice();

        // a3
        ICar a3 = new A3(audi, "A3");
        a3.showPrice();

        // a4
        ICar a4 = new A4(audi, "A4");
        a4.showPrice();

        // a5
        ICar a5 = new A5(audi, "A5");
        a5.showPrice();
    }
}
