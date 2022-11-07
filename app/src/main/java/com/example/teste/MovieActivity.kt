package com.example.teste

import android.graphics.drawable.LayerDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.teste.model.Movie

class MovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        val txtTitle: TextView = findViewById(R.id.txt_title_movie)
        val txtDesc: TextView = findViewById(R.id.txt_movie_desc)
        val txtCast: TextView = findViewById(R.id.txt_movie_cast)
        val rv: RecyclerView = findViewById(R.id.rv_similar)


        txtTitle.text = "Coringa"
        txtDesc.text =
            "Isolado, intimidado e desconsiderado pela sociedade, o fracassado comediante Arthur Fleck inicia seu caminho como uma mente criminosa após assassinar três homens em pleno metrô. Sua ação inicia um movimento popular contra a elite de Gotham City, da qual Thomas Wayne é seu maior representante."
        txtCast.text = getString(R.string.cast, "Ator A, Ator B, Atriz A, Atriz B")

        val movies = mutableListOf<Movie>()
        for (u in 0 until 15) {
            val movie = Movie(R.drawable.movies_radius)
            movies.add(movie)
        }

        rv.layoutManager = GridLayoutManager(this, 3)
        rv.adapter = MovieAdapter(movies, R.layout.movie_item_similar)

        val toolBar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolBar)

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = null


//        val layerDrawable: LayerDrawable =
//            ContextCompat.getDrawable(this, R.drawable.shadows) as LayerDrawable
//
//
//        val movieCover = ContextCompat.getDrawable(this, R.drawable.coringa2)
//        layerDrawable.setDrawableByLayerId(R.id.img_movie, movieCover)
//
//        val imgCover: ImageView = findViewById(R.id.movie_image)
//        imgCover.setImageDrawable(layerDrawable)
    }
}