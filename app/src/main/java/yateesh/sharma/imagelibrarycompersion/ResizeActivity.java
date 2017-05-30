package yateesh.sharma.imagelibrarycompersion;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class ResizeActivity extends AppCompatActivity {
    Button btn_piccsao,btn_glide,btn_fresco,btn_uil;
    ImageView imageView;
    Activity activity;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resize);

        activity=this;
        context=this;

        imageView = (ImageView) findViewById(R.id.imageView);


        btn_piccsao = (Button) findViewById(R.id.btn_piccsao);
        btn_glide = (Button) findViewById(R.id.btn_glide);
        btn_fresco = (Button) findViewById(R.id.btn_fresco);
        btn_uil = (Button) findViewById(R.id.btn_uil);


        btn_piccsao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Picasso.with(getApplicationContext()).load(R.drawable.img).resize(600,600).centerCrop().into(imageView);
            }

        });
        btn_glide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Glide.with(getApplicationContext()).load(R.drawable.img).override(600,600).centerCrop().into(imageView);
               // Glide.with(context).load("http://cdn.journaldev.com/wp-content/uploads/2017/01/android-constraint-layout-sdk-tool-install.png").override(140,140)
            }

        });
        btn_fresco.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }

        });
        btn_uil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }

        });
    }
}
