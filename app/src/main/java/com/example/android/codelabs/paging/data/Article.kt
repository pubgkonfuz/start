
package com.example.android.codelabs.paging.data

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class Article(
    val id: Int,
    val title: String,
    val description: String,
    val created: LocalDateTime,
)

val Article.createdText: String get() = articleDateFormatter.format(created)

private val articleDateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy")
