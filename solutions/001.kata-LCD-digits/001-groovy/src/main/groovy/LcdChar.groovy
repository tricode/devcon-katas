enum LcdChar {
    ZERO(0, """\
._.
|.|
|_|\
"""),

    ONE(1, """\
...
..|
..|\
"""),
    TWO(2, """\
._.
._|
|_.\
"""),

    THREE(3, """\
._.
._|
._|\
"""),
    FOUR(4, """\
...
|_|
..|\
"""),

    FIVE(5, """\
._.
|_.
._|\
"""),

    SIX(6, """\
._.
|_.
|_|\
"""),

    SEVEN(7, """\
._.
..|
..|\
"""),

    EIGHT(8, """\
._.
|_|
|_|\
"""),

    NINE(9, """\
._.
|_|
..|\
""");

    def output
    def number

    LcdChar(number, output) {
        this.number = number
        this.output = output
    }


    static def render(no) {
        if (no > 9) {
            new IllegalArgumentException("unknown number [${no}]")
        }
        values().find { it.number == no }.output
    }


}
