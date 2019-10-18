package com.example.week05;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// We need to give a type in angle brackets <> when we extend RecyclerView.Adapter
// It's saying that we want an adapter that adapts to ArticleViewHolder (our custom ViewHolder)
public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    // class variable that holds the data that we want to adapt
    private ArrayList<Book> booksToAdapt;

    public BookAdapter(ArrayList<Book> booksToAdapt) {
        // This is basically a Setter that we use to give data to the adapter
        this.booksToAdapt = booksToAdapt;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // First create a View from the layout file. It'll probably be a ViewGroup like
        // ConstraintLayout that contains more Views inside it.
        // This view now represents your entire one item.
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.article, parent, false);

        // Then create an instance of your custom ViewHolder with the View you got from inflating
        // the layout.
        BookViewHolder bookViewHolder = new BookViewHolder(view);
        return bookViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final BookViewHolder holder, int position) {
        // Compare what we have in this method, to what we used to have in MainActivity

        // 'position' is the index of the ViewHolder currently being bound (note VIEWHOLDER). So
        // if position is 0, then we are binding the first ViewHolder in the list. This means the
        // corresponding data object will be at index 0 of our data ArrayList.
        final Book bookAtPosition = booksToAdapt.get(position);

        holder.headlineTextView.setText(bookAtPosition.getHeadline());
        holder.summaryTextView.setText(bookAtPosition.getSummary());


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, ArticleDetailActivity.class);
                intent.putExtra("bookID", bookAtPosition.getBookId());
                context.startActivity(intent);
            }
        });

        holder.saveImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!holder.btnSaveState) {
                    holder.saveImageView.setImageResource(R.drawable.ic_bookmark_black_24dp);
                    Toast.makeText(view.getContext().getApplicationContext(), "Saved.", Toast.LENGTH_SHORT).show();
                } else {
                    holder.saveImageView.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
                    Toast.makeText(view.getContext().getApplicationContext(), "Unsaved.", Toast.LENGTH_SHORT).show();
                }

                holder.btnSaveState = !holder.btnSaveState;
            }
        });

        holder.shareImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.putExtra(Intent.EXTRA_TEXT, bookAtPosition.getHeadline());
                intent.setType("text/plain");
                context.startActivity(intent);
            }
        });

        holder.itemImageView.setImageResource(bookAtPosition.getImageDrawableId());
    }

    @Override
    public int getItemCount() {
        return booksToAdapt.size();
    }

    // ViewHolder represents one item, but doesn't have data when it's first constructed.
    // We assign the data in onBindViewHolder.
    public static class BookViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView headlineTextView;
        public TextView summaryTextView;
        public ImageView shareImageView;
        public ImageView itemImageView;
        public ImageView saveImageView;
        public boolean btnSaveState = false;

        // This constructor is used in onCreateViewHolder
        public BookViewHolder(View v) {
            super(v);  // runs the constructor for the ViewHolder superclass
            view = v;
            headlineTextView = v.findViewById(R.id.newsHeadline);
            summaryTextView = v.findViewById(R.id.newsDetails);
            shareImageView = v.findViewById(R.id.newsShareButton);
            itemImageView = v.findViewById(R.id.newsPhoto);
            saveImageView = v.findViewById(R.id.newsSaveButton);
        }
    }
}
