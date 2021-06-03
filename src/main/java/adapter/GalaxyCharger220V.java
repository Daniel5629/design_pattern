package adapter;

public class GalaxyCharger220V implements Electronic220V {

    @Override
    public void work220v() {
        System.out.println("220V 갤럭시 충전기로 충전을 시작합니다.");
    }
}
