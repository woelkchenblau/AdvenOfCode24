package com.woelkchenblau.academy.kotlin.aoc

import com.woelkchenblau.academy.kotlin.aoc.common.PuzzleSolver
import com.woelkchenblau.academy.kotlin.aoc.puzzles.Day1Puzzle

const val basePath = "src/main/resources/aoc_input/"

fun main() {
    val puzzles = puzzlesToSolve()
    puzzles.forEach { it.solve() }
}

fun puzzlesToSolve(): List<PuzzleSolver> {
    return listOf(
        Day1Puzzle(basePath + "day1.txt")
    )
}