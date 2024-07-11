package ir.ramtung.impl2;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0Revised {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the reference has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addProfMember("hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) 'a', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: magazine`s number is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.returnDocument("", "hi!");
        Class<?> wildcardClass5 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", 1, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the magazine has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the book has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addProfMember("hi!");
        library0.addProfMember("");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", 0, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: magazine`s year is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: student name is empty");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        Class<?> wildcardClass8 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        int int11 = library0.getTotalPenalty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: student id is empty");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addReference("hi!", (int) (byte) 10);
        Class<?> wildcardClass8 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addProfMember("hi!");
        library0.addReference("hi!", 0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.returnDocument("", "");
        library0.borrow("hi!", "");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "");
        library0.extend("hi!", "");
        library0.extend("hi!", "hi!");
        Class<?> wildcardClass18 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addProfMember("hi!");
        library0.addProfMember("");
        // The following exception was thrown during execution in test generation
        try {
            library0.addProfMember("hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the member has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        library0.addReference("hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) (byte) 10, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the magazine has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        library0.addReference("hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the book has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.returnDocument("", "");
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: student id is empty");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        library0.borrow("hi!", "");
        library0.returnDocument("hi!", "");
        library0.addReference("hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        library0.borrow("hi!", "");
        library0.returnDocument("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) 'a', (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the magazine has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        library0.extend("", "");
        library0.addReference("hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the book has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        library0.extend("", "");
        Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addReference("hi!", 1);
        library0.addBook("", (int) '#');
        library0.returnDocument("", "hi!");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        library0.returnDocument("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "");
        library0.extend("hi!", "");
        library0.timePass(10);
        Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addProfMember("");
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: student name is empty");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        library0.addReference("hi!", (int) (short) 0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) (short) 0, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: magazine`s year is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addReference("hi!", (int) (byte) 10);
        library0.addProfMember("");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.timePass(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("hi!", (int) (short) -1, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: magazine`s year is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addProfMember("hi!");
        library0.addBook("hi!", (int) (byte) 100);
        library0.returnDocument("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.addMagazine("hi!", (int) '#', 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        int int10 = library0.getTotalPenalty("hi!");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addBook("", (int) (byte) 0);
        library0.addBook("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: this book doesnt exist");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addReference("hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the reference has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addProfMember("");
        java.util.List<String> strList9 = library0.availableTitles();
        library0.addMagazine("", 10, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addProfMember("");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the member has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.addReference("hi!", 0);
        library0.addReference("", (int) (short) 0);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        library0.extend("", "");
        library0.addReference("hi!", (int) (byte) 100);
        java.util.List<String> strList16 = library0.availableTitles();
        library0.addReference("", (int) (short) 1);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addBook("", (int) (byte) 0);
        library0.addBook("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("hi!", (int) (short) 10, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the magazine has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) ' ', 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the magazine has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.addReference("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: this book doesnt exist");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.returnDocument("", "");
        library0.addMagazine("hi!", 10, (int) 'a', (-1));
        library0.addProfMember("");
        int int16 = library0.getTotalPenalty("");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.extend("", "");
        library0.borrow("", "hi!");
        library0.addProfMember("");
        library0.timePass(0);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addReference("hi!", 1);
        library0.extend("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("hi!", (-1), 0, 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the magazine has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.timePass(100);
        library0.returnDocument("", "");
        int int11 = library0.getTotalPenalty("");
        library0.addReference("hi!", 100);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "");
        library0.extend("hi!", "");
        library0.extend("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: student name is empty");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.timePass(100);
        library0.returnDocument("", "hi!");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        library0.borrow("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) 'a', (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the magazine has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        library0.borrow("hi!", "");
        library0.returnDocument("hi!", "");
        java.util.List<String> strList14 = library0.availableTitles();
        library0.borrow("", "");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList14);
    }
}

