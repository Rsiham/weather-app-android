package com.example.weatherapp

data class WeatherModel(
    val city: String,
    val temperature: Double,
    val humidity: Int,
    val windSpeed: Double,
    val description: String
)
