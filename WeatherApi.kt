package com.example.weatherapp

interface WeatherApi {
    fun getWeather(city: String): WeatherModel
}
