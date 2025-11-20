public class TestCapital {
    public static void main(String[] args) {
        testCanada();
        testDenmark();
        testUnsupported();
    }

    private static void testCanada() {
        String expected = "Ottawa";
        String actual = CapitalFinder.getCapital("Canada");

        if (expected.equals(actual)) {
            System.out.println("testCanada: PASS");
        } else {
            System.out.println("testCanada: FAIL (Expected " + expected + ", got " + actual + ")");
        }
    }

    private static void testDenmark() {
        String expected = "Copenhagen";
        String actual = CapitalFinder.getCapital("Denmark");

        if (expected.equals(actual)) {
            System.out.println("testDenmark: PASS");
        } else {
            System.out.println("testDenmark: FAIL (Expected " + expected + ", got " + actual + ")");
        }
    }

    private static void testUnsupported() {
        String expected = "Unsupported country";
        String actual = CapitalFinder.getCapital("Argentina");

        if (expected.equals(actual)) {
            System.out.println("testUnknown: PASS");
        } else {
            System.out.println("testUnknown: FAIL (Expected " + expected + ", got " + actual + ")");
        }
    }
}
