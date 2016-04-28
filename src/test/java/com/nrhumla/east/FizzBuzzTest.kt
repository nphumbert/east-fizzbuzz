package com.nrhumla.east

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.util.Arrays.asList

class FizzBuzzTest {

    class FakeOutput : Output {
        var receivedOutput: String = ""
        override fun print(value: String) {
            receivedOutput += value;
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

    @Test
    fun should_output_bang_when_multiple_of_7() {
        val output = FakeOutput()
        val analyzers = asList(ModuloAnalyzer(7, "Bang"))
        val fizzBuzz = FizzBuzz(output, analyzers)

        fizzBuzz.display(7)

        assertThat(output.receivedOutput).isEqualTo("Bang")
    }

    @Test
    fun should_output_only_fizzbuzz_when_multiple_of_3_and_5() {
        val output = FakeOutput()
        val analyzers = asList(ModuloAnalyzer(15, "FizzBuzz"), ModuloAnalyzer(3, "Fizz"), ModuloAnalyzer(5, "Buzz"))
        val fizzBuzz = FizzBuzz(output, analyzers)

        fizzBuzz.display(15)

        assertThat(output.receivedOutput).isEqualTo("FizzBuzz")
    }

}
