package com.example.week05;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ArticleDetailActivity extends AppCompatActivity {
    private TextView headlineTextView;
    private TextView authorTextView;
    private TextView contentTextView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);

        // Get the intent that was used to travel to this activity
        Intent intent = getIntent();

        // Get the extra identified by "ArticleID" that was put into the intent at the origin.
        int articleID = intent.getIntExtra("ArticleID", 0);

        // Now that we were passed the ID of the clicked item, we can get the rest of the data
        // from the "database". Imagine this could be a real SQL database.
        Article article = FakeDatabase.getArticleById(articleID);

        headlineTextView = findViewById(R.id.detailHeadline);
        authorTextView = findViewById(R.id.detailAuthor);
        contentTextView = findViewById(R.id.detailContent);
        imageView = findViewById(R.id.detailImage);

        // Set the views to show the data of our object
        headlineTextView.setText(article.getHeadline());
        authorTextView.setText(article.getAuthor());
        contentTextView.setText(article.getContent());

        // Don't worry too much about images for now (but if you can get something to work then do)
        // Generally you don't want to store image data in your app (too much space required)
        // We'll learn the way to load images from the internet in a later week.

        // BUT we have included a way to show images that works for now.
        imageView.setImageResource(article.getImageDrawableId());
    }
}
