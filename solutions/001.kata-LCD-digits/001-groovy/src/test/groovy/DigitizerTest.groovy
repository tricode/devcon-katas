import org.testng.annotations.Test

import static org.testng.Assert.assertEquals

class DigitizerTest {

    def digitizer = new Digitizer()

    @Test
    public void shouldRenderOneDigit() {
        assertEquals(digitizer.renderDigit(1), """\
...
..|
..|\
""");
    }

    @Test
    public void shouldRenderTwoDigit() {
        assertEquals(digitizer.renderDigit(2), """\
._.
._|
|_.\
""");
    }

    @Test
    public void shouldRenderOneTwo() {
        assertEquals(digitizer.renderDigit(12), """\
... ._.
..| ._|
..| |_.\
""");
    }

    @Test
    public void shouldRenderOneTwoOne() {
        assertEquals(digitizer.renderDigit(121), """\
... ._. ...
..| ._| ..|
..| |_. ..|\
""");
    }


    @Test
    public void shouldRenderAll() {
        assertEquals(digitizer.renderDigit(1234567890), """\
... ._. ._. ... ._. ._. ._. ._. ._. ._.
..| ._| ._| |_| |_. |_. ..| |_| |_| |.|
..| |_. ._| ..| ._| |_| ..| |_| ..| |_|\
""");
    }

    @Test
    public void shouldRenderNineOneZero() {
        assertEquals(digitizer.renderDigit(910), """\
._. ... ._.
|_| ..| |.|
..| ..| |_|\
""");
    }
}
