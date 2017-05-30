package yateesh.sharma.imagelibrarycompersion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;

public class DrawableActivity extends AppCompatActivity {

    Button btn_piccsao, btn_glide, btn_fresco, btn_uil;
    ImageView imageView;
    SimpleDraweeView draweeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable);


        draweeView = (SimpleDraweeView) findViewById(R.id.sdvImage);

        draweeView.setImageResource(R.drawable.img);

        imageView = (ImageView) findViewById(R.id.imageView);


        btn_piccsao = (Button) findViewById(R.id.btn_piccsao);
        btn_glide = (Button) findViewById(R.id.btn_glide);
        btn_fresco = (Button) findViewById(R.id.btn_fresco);
        btn_uil = (Button) findViewById(R.id.btn_uil);

        btn_piccsao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                draweeView.setVisibility(View.GONE);
                Picasso.with(getApplicationContext()).load(R.drawable.img).into(imageView);
            }

        });
        btn_glide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                draweeView.setVisibility(View.GONE);
                Glide.with(getApplicationContext()).load(R.drawable.img).into(imageView);
            }

        });
        btn_fresco.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                draweeView.setVisibility(View.VISIBLE);
            }

        });
        btn_uil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }

        });

    }
}
