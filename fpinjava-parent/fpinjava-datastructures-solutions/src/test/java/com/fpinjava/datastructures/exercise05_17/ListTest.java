package com.fpinjava.datastructures.exercise05_17;

import static org.junit.Assert.*;
import static com.fpinjava.datastructures.exercise05_17.List.*;
import org.junit.Test;

public class ListTest {

  @Test
  public void testConcat() {
    assertEquals("[4, 5, 6, NIL]", List.concat(list(), list(4, 5, 6)).toString());
    assertEquals("[1, 2, 3, NIL]", List.concat(list(1, 2, 3), list()).toString());
    assertEquals("[1, 2, 3, 4, 5, 6, NIL]", List.concat(list(1, 2, 3), list(4, 5, 6)).toString());
  }

}
