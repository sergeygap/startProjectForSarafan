package com.sergey_gap.startprojectforsarafan.models

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)