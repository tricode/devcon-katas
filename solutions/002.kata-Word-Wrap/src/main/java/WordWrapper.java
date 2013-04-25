public class WordWrapper {

    public String wrap(final String value, final int width) {
        String text = value.trim();
        text = text.replaceAll("\\s+", " ");
        if (text.length() <= width) {
            return text;
        }
        final String wrapped = text.substring(0, width).trim();
        final String stillToWrap = text.substring(width);
        return wrapped + System.lineSeparator() + wrap(stillToWrap, width);
    }

}
