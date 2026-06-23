package com.example.weatherapp

class WeatherRepository {

    fun getWeather(city: String): WeatherModel {
        return WeatherModel(
            city = city,
            temperature = 22.5,
            humidity = 65,
            windSpeed = 12.0,
            description = "Ensoleillé"
        )
    }
}
