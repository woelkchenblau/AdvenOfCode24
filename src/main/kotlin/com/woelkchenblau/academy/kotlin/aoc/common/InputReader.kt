package com.woelkchenblau.academy.kotlin.aoc.common

import java.nio.file.Path
import kotlin.io.path.readLines

fun getInput(input: Path): List<String> {
    return input.readLines().filter { it.isNotEmpty() }.toList()
}