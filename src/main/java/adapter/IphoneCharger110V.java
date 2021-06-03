package adapter;

public class IphoneCharger110V implements Electronic110V {

    @Override
    public void work110v() {
        System.out.println("110V 아이폰 충전기로 충전을 시작합니다.");
    }
}
