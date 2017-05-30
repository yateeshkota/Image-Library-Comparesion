package yateesh.sharma.imagelibrarycompersion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_url, btn_gif, btn_drawable, btn_error, btn_resize, btn_rotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_url = (Button) findViewById(R.id.btn_url);
        btn_gif = (Button) findViewById(R.id.btn_gif);
        btn_drawable = (Button) findViewById(R.id.btn_drawable);
        btn_error = (Button) findViewById(R.id.btn_error);
        btn_resize = (Button) findViewById(R.id.btn_resize);
        btn_rotate = (Button) findViewById(R.id.btn_rotate);

        btn_url.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), UrlActivity.class);
                startActivity(intent);
            }

        });

        btn_gif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplication(), GifActivity.class);


                startActivity(intent);
            }


        });

        btn_drawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplication(), DrawableActivity.class);


                startActivity(intent);
            }


        });

        btn_error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplication(), ErrorActivity.class);


                startActivity(intent);
            }


        });


        btn_resize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplication(), ResizeActivity.class);


                startActivity(intent);
            }


        });


        btn_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplication(), RotateActivity.class);


                startActivity(intent);
            }


        });





    }
}

