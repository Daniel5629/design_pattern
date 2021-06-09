package strategy;

/**
 * 전략객체
 */
public class NormalStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return text;
    }
}
