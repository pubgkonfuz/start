
package com.example.android.codelabs.paging.data
import java.time.LocalDateTime

private val firstArticleCreatedTime = LocalDateTime.now()

class ArticleRepository {

    fun articlePagingSource() = ArticlePagingSource()
}