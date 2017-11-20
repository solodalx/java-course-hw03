package sgu;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class SolutionTest {

    class TestEntry {
        final String input;
        final String output;

        TestEntry(String input, String output) {
            this.input = input;
            this.output = output;
        }
    }

    @Test
    public void runTests() throws Exception {
        List<TestEntry> tests = new ArrayList<>();
        setTests(tests);

        for (TestEntry test : tests) {
            runTest(test.input, test.output);
        }
    }

    private void runTest(String input, String output) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Solution.main(null);
        assertEquals(output, outContent.toString());

        System.setOut(null);
    }

    private void setTests(List<TestEntry> tests) {
        tests.add(new TestEntry(
                "6\n" +
                       "1 3\n" +
                       "1 2\n" +
                       "1 1\n" +
                       "2\n" +
                       "2\n" +
                       "2\n",
                "1\r\n" +
                        "2\r\n" +
                        "3\r\n")
                );
        tests.add(new TestEntry(
                "8\n" +
                       "1 1\n" +
                       "1 1\n" +
                       "2\n" +
                       "1 1\n" +
                       "1 2\n" +
                       "2\n" +
                       "2\n" +
                       "2\n",
                "1\r\n" +
                        "1\r\n" +
                        "1\r\n" +
                        "2\r\n")
                );
    }
}
