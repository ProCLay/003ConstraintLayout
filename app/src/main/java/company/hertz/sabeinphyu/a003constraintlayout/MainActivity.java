package company.hertz.sabeinphyu.a003constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {

   // SliderView sliderView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // ImageView cardView = findViewById(R.id.imageView11);
        final CardView cardView = findViewById(R.id.cardview_orphan);
        // ImageView imageView = findViewById(R.id.imageView14);

      //  TextView textView = findViewById(R.id.totalorphan_textView);
       // workingWithImageSlider();

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"E",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,OrphanActivity.class));


            }
        });





    }


}
