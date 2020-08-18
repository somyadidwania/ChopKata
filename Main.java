import java.util.List;
import org.testng.Assert;
import java.util.Arrays;

class Main {
  
/*
INSTRUCTIONS:

Write a binary Chop method (below, named `Chop`) that 
  - takes an integer search target and a sorted array of integers. 
  - returns the integer index of the target in the array, 
  - or returns  -1 if the target is not in the array. 

*/

// Function under test

  public static int Chop(int needle, int[] haystack) {
    return 0;
  }

// Tests

// add a new test for each new test condition and call it below
  public static void TestChop() {
    ItemFoundInArray();
    //ItemNotFoundInArray();
  }

  public static void ItemNotFoundInArray() {
    // ARRANGE
    int needle = 5;
    int[] haystack = { 1, 2, 3 };
    int expected = -1;

    // ACT
    int actual = Chop(needle, haystack);

    // ASSERT
    Assert.assertEquals(actual , expected, "ItemNotFoundInArray");
  }

  public static void ItemFoundInArray() {
    // ARRANGE
    int needle = 1;
    int[] haystack = { 1, 2, 3 };
    int expected = 0;

    // ACT
    int actual = Chop(needle, haystack);

    // ASSERT
    Assert.assertEquals(actual , expected, "ItemFoundInArray");
  }


//TEST RUNNER - PLEASE IGNORE
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static void main(String[] args) {
    System.out.println("Running Java Tests");
    try {
      TestChop();
    } catch (AssertionError error) {
      System.out.println(ANSI_RED + "Oops!  We have a problem" + ANSI_RED);
      System.out.println(error);
      
      System.exit(1);
    }

    System.out.println(ANSI_GREEN + "Everything looks good!" + ANSI_GREEN);
  }

}

