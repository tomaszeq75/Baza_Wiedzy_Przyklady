package templatemethod;

public class TemplateMethodUsage {
    public static void main(String[] args) {
        PerformanceTestTemplate testTemplate = new RandomListSortingPerformanceTest();
        testTemplate.run();

        testTemplate = new StringBuilderAppendPerformanceTest();
        testTemplate.run();
    }
}

/* Przykładowy output programu:
Shortest iteration took 17
Longest iteration took 47
All iterations took 1912
Shortest iteration took 15
Longest iteration took 28
All iterations took 1755
*/
