package adapter;

/**
 * 110V -> 220V로 변환해주는 어댑터
 */
public class ChargerAdapter implements Electronic220V{

    private final Electronic110V electronic110V;


    public ChargerAdapter(Electronic110V electronic110V) {
        this.electronic110V = electronic110V;
    }

    @Override
    public void work220v() {
        electronic110V.work110v();
    }
}
