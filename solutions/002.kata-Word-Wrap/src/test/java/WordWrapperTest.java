import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * If the row-length is 60, and the input string is 30, the result is just the input string
 * If the row-length is 3, and the input string is "abc def" the result is "abc", "def"
 * If the row-length is 3, and the input string is "abcdef" the result is "abc", "def"
 * If the row-length is 3, and the input string is "abcdef abc" the result is "abc", "def", "abc"
 * With row length 3 and "a b c d e f" the result is "a b", "c d", "e f"
 */
public class WordWrapperTest {

    @Test
    public void wrapStringShorterThanRowLengthShouldNotWrap() {
        final String input = "foo";
        final String expected = sep("foo");
        WordWrapper wordWrapper = new WordWrapper();
        assertEquals(expected, wordWrapper.wrap(input, 4));
    }

    @Test
    public void wrapStringLongerThanRowLengthShouldWrap() {
        final String input = "food";
        final String expected = sep("foo:d");
        WordWrapper wordWrapper = new WordWrapper();
        assertEquals(expected, wordWrapper.wrap(input, 3));
    }

    @Test
    public void wrapLongString() {
        final String input = "foobarbaz";
        final String expected = sep("foo:bar:baz");
        WordWrapper wordWrapper = new WordWrapper();
        assertEquals(expected, wordWrapper.wrap(input, 3));
    }

    @Test
    public void wrapLoremIpsumThreeWidthString() {
        final String input = "1234567890123456789";
        final String expected = sep("123:456:789:012:345:678:9");
        WordWrapper wordWrapper = new WordWrapper();
        assertEquals(expected, wordWrapper.wrap(input, 3));
    }

    @Test
    public void wrapLoremIpsumFourWidthString() {
        final String input = "1234567890123456789";
        final String expected = sep("1234:5678:9012:3456:789");
        WordWrapper wordWrapper = new WordWrapper();
        assertEquals(expected, wordWrapper.wrap(input, 4));
    }

    @Test
    public void emptyString() {
        WordWrapper wordWrapper = new WordWrapper();
        final String input = "";
        final String expected = sep("");
        assertEquals(expected, wordWrapper.wrap(input, 3));
    }

    @Test
    public void wrapThreeWidthTrimLeadingWhitespace() {
        final String input = " ab";
        final String expected = sep("ab");
        WordWrapper wordWrapper = new WordWrapper();
        assertEquals(expected, wordWrapper.wrap(input, 3));
    }

    @Test
    public void shouldSqueezeRepeatingWhiteSpaces() {
        final String input = "ab        de";
        final String expected = sep("ab de");
        WordWrapper wordWrapper = new WordWrapper();
        assertEquals(expected, wordWrapper.wrap(input, 5));
    }

    @Test
    public void shouldTrimWhiteSpaceBeforeWrapping() {
        final String input = "a b c d e f";
        final String expected = sep("a b:c d:e f");
        WordWrapper wordWrapper = new WordWrapper();
        assertEquals(expected, wordWrapper.wrap(input, 3));
    }

    @Test
    public void shouldTrimWhiteSpaceAfterWrapping() {
        final String input = "ab ab";
        final String expected = sep("ab:ab");
        WordWrapper wordWrapper = new WordWrapper();
        assertEquals(expected, wordWrapper.wrap(input, 3));
    }

    private String sep(final String s) {
        return s.replace(":", System.lineSeparator());
    }
}