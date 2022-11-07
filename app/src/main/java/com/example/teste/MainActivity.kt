package com.example.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.teste.model.Category
import com.example.teste.model.Movie


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categories = mutableListOf<Category>()
        for (i in 0 until 10){
            val movies = mutableListOf<Movie>()
            for (l in 0 until 20){
                val movie = Movie(R.drawable.coringa2)
                movies.add(movie)
            }
            val category = Category("Session $i", movies)
            categories.add(category)
        }

        val rv: RecyclerView = findViewById(R.id.rv_main)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = CategoryAdapter(categories)

    }

}

