class Digitizer {

    def renderDigit(int digit) {
        if (digit > 9) {
            int x = digit / 10
            return combine(
                    renderDigit(x),
                    renderSingleDigit(digit % 10))
        }

        return renderSingleDigit(digit)

    }

    def renderSingleDigit(int digit) {
        LcdChar.render(digit)
    }

    private def combine(String one, String two) {
        String[] onesplit = one.split("\n")
        String[] twosplit = two.split("\n");

        for (int i = 0; i < onesplit.length; i++) {
            onesplit[i] += " " + twosplit[i];
        }

        return onesplit.join("\n");
    }
}

