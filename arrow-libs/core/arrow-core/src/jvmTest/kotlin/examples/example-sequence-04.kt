// This file was automatically generated from Sequence.kt by Knit tool. Do not edit.
package arrow.core.examples.exampleSequence04

import arrow.*
import arrow.core.*
import arrow.core.coroutines.*
import kotlinx.coroutines.*
import io.kotest.matchers.collections.*
import io.kotest.assertions.*
import io.kotest.matchers.*
import io.kotest.matchers.types.*
import kotlin.coroutines.cancellation.CancellationException
import io.kotest.property.*
import io.kotest.property.arbitrary.*
import arrow.core.test.generators.*

import arrow.core.interleave

fun main(args: Array<String>) {
  //sampleStart
  val tags = generateSequence { "#" }.take(10)
  val result =
   tags.interleave(sequenceOf("A", "B", "C"))
  //sampleEnd
  println(result.toList())
}