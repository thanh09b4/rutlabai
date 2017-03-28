package thanh.com.rutlabai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button btnchon;
    ImageView hinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Xin chao Thanh",Toast.LENGTH_SHORT).show();
        btnchon = (Button) findViewById(R.id.chon);
        hinh = (ImageView) findViewById(R.id.imgbai);
        btnchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Integer> chonbai = new ArrayList<Integer>();
                chonbai.add(R.drawable.b1);
                chonbai.add(R.drawable.b2);
                chonbai.add(R.drawable.b3);
                chonbai.add(R.drawable.b4);
                chonbai.add(R.drawable.b5);
                chonbai.add(R.drawable.b6);
                chonbai.add(R.drawable.b7);
                chonbai.add(R.drawable.b8);
                chonbai.add(R.drawable.b9);
                chonbai.add(R.drawable.b10);
                chonbai.add(R.drawable.b11);

                Random r = new Random();
                int n = r.nextInt(11);
                hinh.setImageResource(chonbai.get(n));

            }
        });
    }
}
