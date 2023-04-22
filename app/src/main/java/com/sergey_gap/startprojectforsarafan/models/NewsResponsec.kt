package com.sergey_gap.startprojectforsarafan.models

data class NewsResponsec(
    val copyright: String,
    val last_updated: String,
    val num_results: Int,
    val results: List<Result>,
    val section: String,
    val status: String
)