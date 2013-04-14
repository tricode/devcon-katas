# Kata: Word-Wrap

This kata project is set-up with:
- build-system: Gradle
- language:     Groovy & Java
- testing:      TestNG & JUnit (hamcrest available)

## Assignment

Even today, with proportional fonts and complex layouts, there are still cases where you need to wrap text at a specified column. The basic task is to wrap a paragraph of text in a simple way in your language. If there is a way to do this that is built-in, trivial, or provided in a standard library, show that. Otherwise implement the [minimum length greedy algorithm][1] from Wikipedia.

Show your routine working on a sample of text at two different wrap columns.

Examples of behaviour:

- If the row-length is 60, and the input string is 30, the result is just the input string
- If the row-length is 3, and the input string is "abc def" the result is "abc", "def"
- If the row-length is 3, and the input string is "abcdef" the result is "abc", "def"
- If the row-length is 3, and the input string is "abcdef abc" the result is "abc", "def", "abc"
- With row length 3 and "a b c d e f" the result is "a b", "c d", "e f"

## Additional Assignment

Wrap text using a more sophisticated algorithm such as the [Knuth and Plass TeX algorithm][2]. If your language provides this, you must reference documentation indicating that the algorithm is something better than a simple minimimum length algorithm.

Show your routine working on a sample of text at two different wrap columns.

[1]: http://en.wikipedia.org/wiki/Word_wrap#Minimum_length  "minimum length greedy algorithm"
[2]: http://en.wikipedia.org/wiki/Word_wrap#Minimum_raggedness "Knuth & Plass Tex 'minimum raggedness' algorithm"
