public class Language2Matcher extends RegularExpressionMatcher {
    public Language2Matcher() {
        // TODO: Add your regular expression for language 2 below
        setRegularExpressionString("(0|1|2|3|4|5|6|7|8|9)(0|1|2|3|4|5|6|7|8|9)(0|1|2|3|4|5|6|7|8|9)(0|1|2|3|4|5|6|7|8|9)(/|-)(0(1|2|3|4|5|6|7|8|9)|(1(0|1|2)))");
    }
}
