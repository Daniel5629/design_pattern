package adapter;

public class AdapterMain {

    public static void main(String[] args) {
        /**
         * <어댑터 패턴>
         * 호환성이 없는 기존 클래스의 인터페이스를 변환하여
         * 재사용 할 수 있도록 한다.
         *
         * SOLID PRINCIPLE
         * 개방 폐쇄 원칙(open-closed principle) 을 따른다.
         */


        Electronic220V galaxyCharger = new GalaxyCharger220V();
        turnOn(galaxyCharger);

        Electronic110V electronic110V = new IphoneCharger110V();

        // 에러 발생
        // turnOn(electronic110V);

        // 110V -> 220V로 변환해주는 어댑터
        // 돼지코라고 이해하면 된다.
        turnOn(new ChargerAdapter(electronic110V));
    }

    public static void turnOn(Electronic220V electronic220V) {
        electronic220V.work220v();
    }
}
