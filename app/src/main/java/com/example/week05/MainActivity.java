package com.example.week05;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    // Not needed here anymore
//    private ImageView bookmarkButton1;
//    private ImageView bookmarkButton2;
//    private ImageView shareButton1;
//    private ImageView shareButton2;
//    private TextView headline1;
//    private TextView headline2;
//    private TextView details1;
//    private TextView details2;
//    boolean button1State = false;
//    boolean button2State = false;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new FragmentArticle();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.mainFragment, fragment);
        fragmentTransaction.commit();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Fragment currentFragment = new BlankFragment();
                switch (item.getItemId()) {
                    case R.id.navigation_article:
                        Toast.makeText(MainActivity.this, "Articles", Toast.LENGTH_SHORT).show();
                        currentFragment = new FragmentArticle();
                        break;
                    case R.id.navigation_book:
                        Toast.makeText(MainActivity.this, "Books", Toast.LENGTH_SHORT).show();
                        currentFragment = new FragmentBook();
                        break;
                    case R.id.navigation_profile:
                        Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        currentFragment = new FragmentProfile();
                        break;
                }
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.mainFragment, currentFragment);
                fragmentTransaction.commit();
                return true;
            }
        });


        /*
        recyclerView = findViewById(R.id.rv_main);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArticleAdapter articleAdapter = new ArticleAdapter(FakeDatabase.getAllArticles());

        // We wrote our setData method to be like a setter, so we give our ArrayList from
        // FakeDatabase to the Adapter.
        recyclerView.setAdapter(articleAdapter);

         */


        // We don't need any of this stuff below here anymore
        // We've automated it by writing our custom Adapter
        // Look at the code in ArticleAdapter onBindViewHolder, and compare it what we used to have
        // here.

//        ConstraintLayout article1 = findViewById(R.id.article1);
//        ConstraintLayout article2 = findViewById(R.id.article2);
//
//        headline1 = article1.findViewById(R.id.newsHeadline);
//        headline2 = article2.findViewById(R.id.newsHeadline);
//        details1 = article1.findViewById(R.id.newsDetails);
//        details2 = article2.findViewById(R.id.newsDetails);
//
//        bookmarkButton1 = article1.findViewById(R.id.newsSaveButton);
//        bookmarkButton2 = article2.findViewById(R.id.newsSaveButton);
//
//        shareButton1 = article1.findViewById(R.id.newsShareButton);
//        shareButton2 = article2.findViewById(R.id.newsShareButton);
//
//
//        // Getting objects from the FakeDatabase and filling in the TextViews with data
//        final Article articleObject1 = FakeDatabase.getArticleById(4);
//        final Article articleObject2 = FakeDatabase.getArticleById(3);
//        articleObject1.setImageDrawableId(R.drawable.news_headline_photo); // don't worry about images for now
//        articleObject2.setImageDrawableId(R.drawable.news_headline_photo);
//
//        headline1.setText(articleObject1.getHeadline());
//        headline2.setText(articleObject2.getHeadline());
//
//        details1.setText(articleObject1.getSummary());
//        details2.setText(articleObject2.getSummary());
//
//        // Clicking on the article to go to detail activity
//        article1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ArticleDetailActivity.class);
//                intent.putExtra("ArticleID", articleObject1.getArticleID());
//                startActivity(intent);
//            }
//        });
//
//        article2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ArticleDetailActivity.class);
//                intent.putExtra("ArticleID", articleObject2.getArticleID());
//                startActivity(intent);
//            }
//        });
//
//        // Bookmark buttons
//        bookmarkButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Click1 Registered", Toast.LENGTH_SHORT).show();
//                if(!button1State) {
//                    bookmarkButton1.setImageResource(R.drawable.ic_bookmark_black_24dp);
//                } else {
//                    bookmarkButton1.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
//                }
//
//                button1State = !button1State;
//            }
//        });
//
//        bookmarkButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Click2 Registered", Toast.LENGTH_SHORT).show();
//                if(!button2State) {
//                    bookmarkButton2.setImageResource(R.drawable.ic_bookmark_black_24dp);
//                } else {
//                    bookmarkButton2.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
//                }
//
//                button2State = !button2State;
//            }
//        });
//
//        // Share button implicit intents
//        shareButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_SEND);
//
//                intent.putExtra(Intent.EXTRA_TEXT, articleObject1.getHeadline());
//                intent.setType("text/plain");
//                startActivity(intent);
//            }
//        });
//
//        shareButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_SEND);
//
//                intent.putExtra(Intent.EXTRA_TEXT, articleObject2.getHeadline());
//                intent.setType("text/plain");
//                startActivity(intent);
//            }
//        });

    }
}
