package com.example.criminalintent;

import android.view.View;
import android.widget.ImageView;

public class ListRow extends RecyclerView.ViewHolder {
    public ImageView mThumbnail;

    public ListRow(View view){
        super(View);

        mThumbnail = (ImageView) View.findViewById(R.id.thumbnail);
    }
}
