package com.example.leechungwan.newslive;

import java.io.Serializable;

/**
 * Created by leechungwan on 2017-08-09.
 */

public class NewsItem implements Serializable {
    String title;
    String dateTime;
    String imageLink;
    String newsLink;

    @Override
    public String toString() {
        return title;
    }
}
