    package com.example.android.navigationview;

    import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
    import android.widget.ImageView;
    import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        private TextView textView,textView2;
        private ImageView imageView;
        private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView =  (BottomNavigationView) findViewById(R.id.bottonNavigationView);
        textView = (TextView) findViewById(R.id.texto);
        textView2 = (TextView) findViewById(R.id.texto2);
        imageView = (ImageView) findViewById(R.id.img);

        //Dentro del parentesis escribir new luego alt + enter y auto generar el metodo
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                //Para cada item se crea un if para igualar los Id
                if(item.getItemId() == R.id.inicioItem){
                    textView.setText(item.getTitle());
                    imageView.setImageResource(R.drawable.ic_home);
                }else if(item.getItemId() == R.id.buscarItem){
                    textView.setText(item.getTitle());
                    imageView.setImageResource(R.drawable.ic_search);
                }else if(item.getItemId() == R.id.camaraItem){
                    textView.setText(item.getTitle());
                    imageView.setImageResource(R.drawable.ic_camera_alt);
                }else if(item.getItemId() == R.id.favoritosItem){
                    textView.setText(item.getTitle());
                    imageView.setImageResource(R.drawable.ic_favorite);
                }else if(item.getItemId() == R.id.perfilItem){
                    textView.setText(item.getTitle());
                    imageView.setImageResource(R.drawable.ic_person);
                }
                return false;
            }
        });
    }
}
