package ir.ramtung.impl1;

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
        // The following exception was thrown during execution in test generation
        try {
            library0.returnDocument("", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = library0.getTotalPenalty("");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot find member");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Library library0 = new Library();
        // The following exception was thrown during execution in test generation
        try {
            library0.extend("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Library library0 = new Library();
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("", 100);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Documents with empty title are not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = library0.getTotalPenalty("hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot find member");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Documents with empty title are not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Library library0 = new Library();
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot find document to borrow");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        Class<?> wildcardClass3 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Library library0 = new Library();
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) 'a', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Documents with empty title are not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.extend("", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Documents with empty title are not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot find document to borrow");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.returnDocument("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.extend("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot find document to borrow");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot find document to borrow");
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
        library0.addProfMember("hi!");
        library0.timePass(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addProfMember("");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Empty member name not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        Class<?> wildcardClass2 = strList1.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Library library0 = new Library();
        // The following exception was thrown during execution in test generation
        try {
            library0.addProfMember("");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Empty member name not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        library0.addReference("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addProfMember("");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Empty member name not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Library library0 = new Library();
        library0.timePass((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.extend("", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        Class<?> wildcardClass2 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Library library0 = new Library();
        library0.timePass((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.addProfMember("");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Empty member name not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.extend("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot find document to borrow");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.extend("", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.timePass((-1));
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot go back in time");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        library0.addReference("hi!", (int) 'a');
        library0.timePass((int) (byte) 100);
        java.util.List<String> strList12 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.returnDocument("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        library0.addReference("hi!", (int) 'a');
        library0.timePass((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addProfMember("");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Empty member name not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        library0.addReference("hi!", (int) 'a');
        library0.timePass((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Empty member name not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        library0.addReference("hi!", (int) 'a');
        library0.timePass((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Negative or zero copies of a document cannot be added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        Class<?> wildcardClass5 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.extend("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Empty member name not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        library0.addReference("hi!", (int) 'a');
        library0.timePass((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("hi!", 10);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.DuplicateDocumentEx; message: Document with the same title exists");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Library library0 = new Library();
        library0.timePass((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.extend("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Documents with empty title are not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.returnDocument("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        library0.addReference("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.DuplicateMemberEx; message: Member with the same name exists");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        library0.addReference("hi!", (int) 'a');
        library0.timePass((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.DuplicateDocumentEx; message: Document with the same title exists");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Library library0 = new Library();
        library0.addBook("hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Empty student ID is not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Library library0 = new Library();
        java.util.List<String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot find document to borrow");
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
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.addReference("hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addProfMember("hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.DuplicateMemberEx; message: Member with the same name exists");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.DuplicateMemberEx; message: Member with the same name exists");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.addReference("hi!", (int) (byte) 10);
        Class<?> wildcardClass8 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Library library0 = new Library();
        // The following exception was thrown during execution in test generation
        try {
            library0.returnDocument("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.extend("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) ' ', (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Documents with empty title are not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.addMagazine("hi!", (int) (byte) 100, (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Negative or zero copies of a document cannot be added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Library library0 = new Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        library0.addReference("hi!", (int) 'a');
        library0.timePass((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Documents with empty title are not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }
}

