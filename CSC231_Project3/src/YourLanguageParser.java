public class YourLanguageParser extends LR0Parser {

    public YourLanguageParser() {
        super(); // calls the constructor for LR0Parser

        // TODO
        // add rules
        addRule("R1","Z", "S#");
        addRule("R2", "S", "S+n");
        addRule("R3", "S", "n");

        // state 1 rules
        addAction("1", "n", "S3");
        addAction("1", "S", "G2");

        // state 2 rules
        addAction("2", "+", "S4");
        addAction("2", "#", "Accept");

        // state 3 rules
        addAction("3", "n", "R3");
        addAction("3", "+", "R3");
        addAction("3", "#", "R3");

        // state 4 rules
        addAction("4", "n", "S5");

        // state 5 rules
        addAction("5", "n", "R2");
        addAction("5", "+", "R2");
        addAction("5", "#", "R2");

    }
}
