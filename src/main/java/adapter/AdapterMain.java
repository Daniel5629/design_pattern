package adapter;

public class AdapterMain {

    public static void main(String[] args) {
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
