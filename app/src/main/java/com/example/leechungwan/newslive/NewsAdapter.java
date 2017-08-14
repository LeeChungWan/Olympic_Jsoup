package com.example.leechungwan.newslive;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by leechungwan on 2017-08-09.
 */

public class NewsAdapter extends BaseAdapter {

    Context context;
    ArrayList<NewsItem> newsList;

    public NewsAdapter(Context context, ArrayList<NewsItem> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    @Override
    public int getCount() {
        return newsList.size();
    }

    @Override
    public NewsItem getItem(int i) {
        return newsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = View.inflate(context, R.layout.news_list_item_layout, null);
        }

        NewsItem currentNews = newsList.get(i);

        ImageView iv1 = (ImageView) view.findViewById(R.id.imageview_1);
        TextView tvTitle = (TextView) view.findViewById(R.id.textview_title);
        TextView tvDateTime = (TextView) view.findViewById(R.id.textview_dateTime);

        Picasso.with(context).load(currentNews.imageLink).into(iv1);
        tvTitle.setText(currentNews.toString());
        tvDateTime.setText(currentNews.dateTime);

        return view;
    }
}
