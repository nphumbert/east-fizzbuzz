package com.nrhumla.east

class ModuloAnalyzer(private val modulo: Int, private val outputString: String) : Analyzer {

    override fun analyze(number: Int, controller: Controller) {
        if (number % modulo == 0) {
            controller.print(outputString)
        }
    }
}
