package efood.com.trung.testanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
ImageView img_rotate;
Button btn_rota;
private int rotateID = 0;
private boolean rotateBack = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_rotate = findViewById(R.id.imv_rotate);
        btn_rota = findViewById(R.id.btn_rotate);
        Glide.with(this).load(R.drawable.image_dragon).into(img_rotate);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotation);
        animation.setFillAfter(true);
        btn_rota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* rotateID = rotateID == 0 ? 180 : 0;
                img_rotate.animate().rotation(rotateID).setDuration(1000).start();*/
               if(rotateBack == true){
                   img_rotate.startAnimation(animation);
               }else {
                   rotateID = rotateID == 0 ? 270 : 0;
                   img_rotate.animate().rotation(rotateID).setDuration(1500).start();
               }

            }
        });
    }
}
