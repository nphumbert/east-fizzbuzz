package com.nrhumla.east

class FizzBuzz(private val output: Output, private val analyzers: List<Analyzer>) : Controller {

    override fun print(value: String) {
        output.print(value)
    }

    fun display(number: Int) {
        analyzers.forEach { it.analyze(number, this) }
    }
}
