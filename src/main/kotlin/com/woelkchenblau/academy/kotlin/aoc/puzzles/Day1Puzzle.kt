package com.woelkchenblau.academy.kotlin.aoc.puzzles

import com.woelkchenblau.academy.kotlin.aoc.common.PuzzleSolver
import com.woelkchenblau.academy.kotlin.aoc.common.getInput
import java.nio.file.Paths
import kotlin.math.abs

class Day1Puzzle(private val inputFile: String) : PuzzleSolver {

    override fun solve() {
        val input = getInput(Paths.get(inputFile)).toList()
        val paired = parseToPairs(input)
        val result = calculateTotalDifferences(paired)
        println("The result of day 1's puzzle is $result")
    }

    private fun splitIntPair(input: String): Pair<Int, Int> {
        val pair = input.split(Regex("\\s+")).map { it.toInt() }
        require(pair.size == 2) { "Pair size should have been 2, found ${pair.size} items instead" }
        return Pair(pair[0], pair[1])
    }

    private fun parseToPairs(input: List<String>): List<Pair<Int, Int>> {
        return input.map { splitIntPair(it) }
    }

    private fun calculateTotalDifferences(pairs: List<Pair<Int, Int>>): Int {
        val col1 = pairs.map { it.first }.sorted()
        val col2 = pairs.map { it.second }.sorted()
        require(col1.size == col2.size)

        var sum = 0
        for (i in col1.indices) {
            sum += abs(col1[i] - col2[i])
        }

        return sum
    }
}
