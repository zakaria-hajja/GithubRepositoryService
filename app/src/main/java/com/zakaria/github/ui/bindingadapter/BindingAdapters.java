package com.zakaria.github.ui.bindingadapter;

import android.databinding.BindingAdapter;
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
        Log.e("URL",imageUrl);

    }
}
