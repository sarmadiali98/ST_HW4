package ir.ramtung.impl2;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.returnDocument("", "hi!");
        java.lang.Class<?> wildcardClass5 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        java.lang.Class<?> wildcardClass8 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addReference("hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.returnDocument("", "");
        library0.borrow("hi!", "");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "");
        library0.extend("hi!", "");
        library0.extend("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        library0.extend("", "");
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        library0.returnDocument("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "");
        library0.extend("hi!", "");
        library0.timePass(10);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addReference("hi!", (int) (byte) 10);
        library0.addProfMember("");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.addMagazine("hi!", (int) '#', 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addProfMember("");
        java.util.List<java.lang.String> strList9 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.addReference("hi!", 0);
        library0.addReference("", (int) (short) 0);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        library0.extend("", "");
        library0.addReference("hi!", (int) (byte) 100);
        java.util.List<java.lang.String> strList16 = library0.availableTitles();
        library0.addReference("", (int) (short) 1);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.timePass(100);
        library0.returnDocument("", "hi!");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
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
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        library0.borrow("hi!", "");
        library0.returnDocument("hi!", "");
        java.util.List<java.lang.String> strList14 = library0.availableTitles();
        library0.borrow("", "");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "");
        library0.addProfMember("");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("hi!", (int) (byte) 0, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: magazine`s year is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addProfMember("");
        java.util.List<java.lang.String> strList9 = library0.availableTitles();
        library0.addMagazine("", 10, (int) (byte) 1, 1);
        library0.borrow("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.returnDocument("", "");
        library0.addMagazine("hi!", (int) (short) 10, (int) 'a', (int) (short) 100);
        library0.borrow("hi!", "");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addProfMember("");
        java.util.List<java.lang.String> strList9 = library0.availableTitles();
        library0.extend("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("hi!", (int) '4', 0, 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: magazine`s number is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: student id is empty");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.timePass(100);
        library0.addReference("", (int) (short) -1);
        library0.timePass(100);
        library0.returnDocument("hi!", "");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.extend("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addProfMember("hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the member has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        library0.timePass((int) (short) 0);
        java.util.List<java.lang.String> strList3 = library0.availableTitles();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.returnDocument("", "hi!");
        library0.extend("hi!", "");
        library0.returnDocument("hi!", "");
        library0.timePass((int) (short) 100);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.returnDocument("", "");
        library0.addMagazine("hi!", 10, (int) 'a', (-1));
        library0.extend("hi!", "");
        library0.timePass((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "");
        library0.borrow("", "hi!");
        library0.addProfMember("");
        java.util.List<java.lang.String> strList10 = library0.availableTitles();
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        library0.extend("", "");
        library0.returnDocument("", "hi!");
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        library0.borrow("", "");
        library0.borrow("hi!", "");
        library0.addMagazine("hi!", (int) (short) 100, (int) (byte) 100, (int) '4');
        int int19 = library0.getTotalPenalty("");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "");
        library0.extend("hi!", "");
        library0.extend("hi!", "hi!");
        library0.borrow("", "");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addReference("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("hi!", (int) (short) 1, 10, 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the magazine has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "");
        library0.borrow("", "hi!");
        library0.borrow("hi!", "hi!");
        library0.addReference("hi!", (int) (short) 0);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addBook("", (int) (byte) 0);
        library0.addBook("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: this book doesnt exist");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        library0.returnDocument("", "");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        library0.addBook("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("hi!", (int) (byte) 0, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: magazine`s year is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "");
        library0.extend("hi!", "");
        library0.extend("hi!", "hi!");
        library0.addReference("hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) (byte) 0, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the magazine has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addProfMember("hi!");
        library0.addBook("hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: student id is empty");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        library0.addBook("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("", 10);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the book has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.returnDocument("", "");
        library0.addMagazine("hi!", 10, (int) 'a', (-1));
        library0.addProfMember("");
        // The following exception was thrown during execution in test generation
        try {
            library0.addProfMember("");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the member has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.returnDocument("", "hi!");
        library0.extend("hi!", "");
        library0.returnDocument("hi!", "");
        java.util.List<java.lang.String> strList11 = library0.availableTitles();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.addReference("hi!", 10);
        library0.addProfMember("");
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: student id is empty");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addReference("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: this book doesnt exist");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "");
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: student id is empty");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addReference("hi!", (int) (short) 0);
        library0.addProfMember("hi!");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "");
        java.util.List<java.lang.String> strList12 = library0.availableTitles();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addProfMember("");
        java.util.List<java.lang.String> strList9 = library0.availableTitles();
        library0.extend("", "");
        library0.timePass((int) '#');
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        library0.addBook("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("", 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the reference has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        int int10 = library0.getTotalPenalty("");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.timePass(100);
        library0.addReference("", (int) (short) -1);
        library0.addBook("hi!", (int) '4');
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "");
        library0.borrow("", "hi!");
        library0.borrow("hi!", "hi!");
        library0.extend("", "hi!");
        library0.addBook("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "");
        library0.borrow("", "hi!");
        library0.addProfMember("");
        java.util.List<java.lang.String> strList10 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        java.util.List<java.lang.String> strList14 = library0.availableTitles();
        library0.addMagazine("", (int) (byte) 10, (int) '#', (int) (short) 100);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        library0.borrow("", "hi!");
        library0.timePass((int) (short) 100);
        java.util.List<java.lang.String> strList6 = library0.availableTitles();
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "hi!");
        library0.extend("", "");
        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the reference has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "");
        library0.extend("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) '4', (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the magazine has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addProfMember("hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the member has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addProfMember("");
        java.util.List<java.lang.String> strList9 = library0.availableTitles();
        library0.extend("", "");
        library0.addMagazine("", (int) (byte) 1, (int) '#', (int) (short) -1);
        library0.extend("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: this book doesnt exist");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addProfMember("");
        java.util.List<java.lang.String> strList9 = library0.availableTitles();
        library0.addMagazine("", 10, (int) (byte) 1, 1);
        int int16 = library0.getTotalPenalty("hi!");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "hi!");
        library0.addStudentMember("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        library0.borrow("hi!", "");
        java.util.List<java.lang.String> strList11 = library0.availableTitles();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        library0.borrow("", "hi!");
        library0.returnDocument("hi!", "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.timePass(100);
        library0.returnDocument("", "");
        int int11 = library0.getTotalPenalty("");
        library0.borrow("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.timePass((int) (byte) 10);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.returnDocument("", "");
        library0.addProfMember("hi!");
        library0.timePass((int) '#');
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "");
        library0.borrow("", "hi!");
        library0.borrow("hi!", "hi!");
        library0.extend("", "hi!");
        library0.timePass(0);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        library0.extend("", "");
        library0.returnDocument("", "hi!");
        java.lang.Class<?> wildcardClass16 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addProfMember("");
        java.util.List<java.lang.String> strList9 = library0.availableTitles();
        library0.extend("hi!", "hi!");
        library0.timePass(1);
        library0.extend("hi!", "hi!");
        library0.addReference("hi!", (int) '#');
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.returnDocument("", "hi!");
        library0.extend("hi!", "");
        library0.addBook("hi!", (int) (short) -1);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "");
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.borrow("", "hi!");
        java.util.List<java.lang.String> strList7 = library0.availableTitles();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "");
        library0.borrow("", "hi!");
        library0.borrow("hi!", "hi!");
        library0.extend("", "hi!");
        library0.addReference("", (-1));
        library0.returnDocument("", "hi!");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addBook("", (int) (byte) 0);
        library0.returnDocument("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) (byte) 0, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the magazine has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        library0.extend("", "");
        library0.addReference("hi!", (int) (byte) 100);
        library0.timePass(0);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        java.lang.Class<?> wildcardClass5 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.returnDocument("", "hi!");
        library0.extend("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("hi!", (int) (short) 1, 0, 1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: magazine`s number is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.timePass((int) '#');
        library0.returnDocument("hi!", "hi!");
        library0.addBook("hi!", (int) (byte) 10);
        library0.addBook("", 0);
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.timePass(100);
        library0.timePass(1);
        library0.extend("hi!", "");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.timePass(100);
        library0.returnDocument("", "");
        int int11 = library0.getTotalPenalty("");
        library0.addBook("", (int) (short) -1);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addReference("hi!", 1);
        library0.extend("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the reference has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.returnDocument("hi!", "");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.extend("hi!", "hi!");
        library0.returnDocument("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) ' ', (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: magazine`s number is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.timePass(100);
        library0.addMagazine("", (int) ' ', (int) (byte) 1, 0);
        library0.extend("hi!", "");
        library0.returnDocument("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addMagazine("hi!", (int) (byte) 10, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.returnDocument("", "");
        library0.addMagazine("hi!", (int) (short) 10, (int) 'a', (int) (short) 100);
        library0.addReference("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        library0.borrow("", "");
        library0.borrow("hi!", "");
        library0.addMagazine("hi!", (int) (short) 100, (int) (byte) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the book has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addProfMember("hi!");
        java.util.List<java.lang.String> strList6 = library0.availableTitles();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addProfMember("hi!");
        library0.addBook("hi!", (int) (byte) 100);
        int int10 = library0.getTotalPenalty("hi!");
        library0.borrow("", "");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        library0.borrow("hi!", "");
        library0.borrow("", "");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "hi!");
        library0.extend("", "");
        library0.borrow("hi!", "");
        library0.addBook("hi!", (int) '#');
        library0.extend("hi!", "");
        int int25 = library0.getTotalPenalty("");
        java.lang.Class<?> wildcardClass26 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "hi!");
        library0.extend("", "");
        library0.borrow("hi!", "");
        library0.addBook("hi!", (int) '#');
        int int22 = library0.getTotalPenalty("hi!");
        library0.timePass((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        library0.borrow("", "");
        library0.borrow("hi!", "");
        library0.addMagazine("hi!", (int) (short) 100, (int) (byte) 100, (int) '4');
        library0.addProfMember("hi!");
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
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "");
        library0.borrow("", "hi!");
        library0.borrow("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = library0.availableTitles();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.returnDocument("", "");
        library0.addMagazine("hi!", 10, (int) 'a', (-1));
        library0.extend("hi!", "");
        library0.borrow("", "");
        library0.returnDocument("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the reference has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.addReference("hi!", 0);
        library0.returnDocument("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("hi!", (int) ' ', (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the magazine has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "");
        library0.borrow("", "hi!");
        library0.addProfMember("");
        java.util.List<java.lang.String> strList10 = library0.availableTitles();
        java.util.List<java.lang.String> strList11 = library0.availableTitles();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.timePass(100);
        library0.timePass(1);
        int int10 = library0.getTotalPenalty("");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.timePass(100);
        library0.addMagazine("", (int) ' ', (int) (byte) 1, 0);
        library0.addProfMember("");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.returnDocument("", "");
        library0.addMagazine("hi!", 10, (int) 'a', (-1));
        library0.extend("hi!", "");
        library0.addBook("", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("", 1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the book has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        java.util.List<java.lang.String> strList7 = library0.availableTitles();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.returnDocument("", "");
        library0.addMagazine("hi!", 10, (int) 'a', (-1));
        library0.addProfMember("");
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
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        library0.addBook("", (int) 'a');
        java.util.List<java.lang.String> strList8 = library0.availableTitles();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("hi!", (int) (short) -1, 0, 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: magazine`s year is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.addProfMember("");
        java.util.List<java.lang.String> strList9 = library0.availableTitles();
        library0.extend("", "");
        library0.addMagazine("", (int) (byte) 1, (int) '#', (int) (short) -1);
        library0.extend("hi!", "hi!");
        int int22 = library0.getTotalPenalty("");
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: this book doesnt exist");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "hi!");
        library0.extend("", "");
        library0.borrow("hi!", "");
        library0.addBook("hi!", (int) '#');
        int int22 = library0.getTotalPenalty("hi!");
        java.lang.Class<?> wildcardClass23 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.addReference("hi!", 10);
        java.util.List<java.lang.String> strList8 = library0.availableTitles();
        library0.timePass(10);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.extend("", "");
        library0.borrow("", "hi!");
        library0.borrow("hi!", "hi!");
        library0.addReference("hi!", 0);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("", "hi!");
        library0.returnDocument("", "");
        library0.addMagazine("hi!", 10, (int) 'a', (-1));
        library0.extend("hi!", "");
        library0.borrow("", "");
        int int20 = library0.getTotalPenalty("");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.timePass((int) '#');
        library0.returnDocument("hi!", "hi!");
        int int13 = library0.getTotalPenalty("hi!");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.timePass(100);
        library0.addReference("", (int) (short) -1);
        int int11 = library0.getTotalPenalty("hi!");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        library0.borrow("", "");
        library0.borrow("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the book has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.extend("hi!", "hi!");
        library0.timePass((int) (short) 1);
        library0.addProfMember("");
        org.junit.Assert.assertNotNull(strList1);
    }
}

