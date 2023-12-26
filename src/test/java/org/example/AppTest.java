package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AppTest {
  @Test
  void t1() {
    assertThat(new App().plus(a:10, b:20)).isEqualTo(expected:30);
  }
}

