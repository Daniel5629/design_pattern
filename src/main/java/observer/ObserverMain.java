package observer;

public class ObserverMain {
    public static void main(String[] args) {
        /**
         * <옵저버 패턴>
         * 관찰자 패턴은 변화가 일어 났을 때,
         * 미리 등록된 다른 클래스에 통보해주는 패턴을 구현한 것이다.
         * 많이 보이는 곳은 event listener 에서 해당 패턴을 사용 하고 있다.
         *
         */

        Button button = new Button("버튼");

        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click("메세지 전달 : click1");
        button.click("메세지 전달 : click2");
        button.click("메세지 전달 : click3");
        button.click("메세지 전달 : click4");
        button.click("메세지 전달 : click5");
    }
}
