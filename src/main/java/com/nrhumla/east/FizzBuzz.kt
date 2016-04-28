package com.nrhumla.east

class FizzBuzz(private val output: Output, private val analyzers: List<Analyzer>) : Controller {

    private var alreadyCalled: Boolean = false;

    override fun print(value: String) {
        if (!alreadyCalled) {
            output.print(value)
        }
        alreadyCalled = true
    }

    fun display(number: Int) {
        alreadyCalled = false
        analyzers.forEach { it.analyze(number, this) }
    }
}
