public class App {
    public static void main(String[] args) throws Exception {
        WordCount wc = new WordCount("this this this this and and test test test");
        wc.output();
        wc.startOver();
        wc.output();

    }
}
