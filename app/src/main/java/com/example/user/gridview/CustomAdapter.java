package com.example.user.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by User on 12/20/2017.
 */

class CustomAdapter extends BaseAdapter {

    int[] letter;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter(Context context,int[] letter){
        this.context=context;
        this.letter=letter;

    }
    @Override
    public int getCount() {

        return letter.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           view= inflater.inflate(R.layout.sample_view,viewGroup,false);

        }
        ImageView imageView=(ImageView)view.findViewById(R.id.imageviewid);
        imageView.setImageResource(letter[i]);


        return view;
    }
}
