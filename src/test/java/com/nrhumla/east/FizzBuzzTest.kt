package com.nrhumla.east

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.util.Arrays.asList

class FizzBuzzTest {

    class FakeOutput : Output {
        var receivedOutput: String = ""
        override fun print(value: String) {
            receivedOutput = value;
        }
    }

    @Test
    fun should_output_fizz_when_multiple_of_3() {
        val output = FakeOutput()
        val analyzers = asList(ModuloAnalyzer(3, "Fizz"))
        val fizzBuzz = FizzBuzz(output, analyzers)

        fizzBuzz.display(3)

        assertThat(output.receivedOutput).isEqualTo("Fizz")
    }

    @Test
    fun should_output_buzz_when_multiple_of_5() {
        val output = FakeOutput()
        val analyzers = asList(ModuloAnalyzer(5, "Buzz"))
        val fizzBuzz = FizzBuzz(output, analyzers)

        fizzBuzz.display(5)

        assertThat(output.receivedOutput).isEqualTo("Buzz")
    }
}
