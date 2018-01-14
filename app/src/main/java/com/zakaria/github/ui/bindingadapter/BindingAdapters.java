package com.zakaria.github.ui.bindingadapter;

import android.databinding.BindingAdapter;
import android.icu.text.DecimalFormat;
import android.support.v7.widget.AppCompatTextView;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.zakaria.github.R;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class BindingAdapters {

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String imageUrl) {
        Picasso.with(imageView.getContext())
                .load(imageUrl)
                .placeholder(R.drawable.ic_photo_size_select_actual_black_24px)
                .error(R.drawable.ic_photo_size_select_actual_black_24px)
                .into(imageView);
    }
    @BindingAdapter("textStars")
    public static void setTextStars(AppCompatTextView textView, Integer nbStars) {
        String numberText =nbStars.toString();
        Double d = nbStars/1000.0;
        if(d >=1){
            numberText = round(d,1)+"K";
        }
        textView.setText(numberText);
    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
