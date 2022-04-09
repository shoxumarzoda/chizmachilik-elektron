package com.htmlwebyaratish.chizmachilikfanidanelektrondarslik;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

class ModelAdapterElementarySwimmers extends PagerAdapter {
    private List<ModelElementarySwimmers> modelElementarySwimmers;
    private LayoutInflater layoutInflater;
    private Context context;

    public ModelAdapterElementarySwimmers(List<ModelElementarySwimmers> modelElementarySwimmers, Context context) {
        this.modelElementarySwimmers = modelElementarySwimmers;
        this.context = context;
    }

    @Override
    public int getCount() {
        return modelElementarySwimmers.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {

        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item,container,false);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView title = view.findViewById(R.id.title);
        TextView desc = view.findViewById(R.id.desc);

        imageView.setImageResource(modelElementarySwimmers.get(position).getWebViewImage());
        title.setText(modelElementarySwimmers.get(position).getWebViewtitle());
        desc.setText(modelElementarySwimmers.get(position).getWebViewdesc());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (modelElementarySwimmers.get(position).getWebViewtitle().toString().startsWith("Kirisiw")  ||
                        modelElementarySwimmers.get(position).getWebViewtitle().toString().startsWith("Pay") ||
                        modelElementarySwimmers.get(position).getWebViewtitle().toString().startsWith("Muallif")
                         ){

                    if(modelElementarySwimmers.get(position).getWebViewtitle().toString().startsWith("Muallif")){
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://t.me/MaksetbayTorebekovich"));
                        context.startActivity(intent);
                    }
                    else {


                    Intent intent = new Intent(context, MainActivity3.class);
                    intent.putExtra("data", modelElementarySwimmers.get(position).getWebViewurl());

                    context.startActivity(intent);
                    }


                }
                else {

                    Intent intent = new Intent(context, MainActivity2.class);
                    intent.putExtra("swimmers", position);

                    context.startActivity(intent);
                }



            }
        });

        container.addView(view,0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

}
