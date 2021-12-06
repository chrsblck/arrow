// This file was automatically generated from Ior.kt by Knit tool. Do not edit.
package arrow.core.examples.exampleIor09

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

import arrow.core.Ior

fun main() {
  Ior.Right(12).toEither() // Result: Either.Right(12)
  Ior.Left(12).toEither()  // Result: Either.Left(12)
  Ior.Both("power", 12).toEither()  // Result: Either.Right(12)
}