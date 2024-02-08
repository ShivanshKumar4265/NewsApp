package com.zenspace.news_app.modalData

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)