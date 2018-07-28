package in.codingninjas.envision.motionandgestures;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ViewGroup rootLayout;
    View pointer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootLayout = findViewById(R.id.rootLayout);
        rootLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                int action = motionEvent.getActionMasked();
//                switch (action){
//
//                    case MotionEvent.ACTION_DOWN:
//                            Toast.makeText(MainActivity.this,"Action Down",Toast.LENGTH_LONG).show();
//                            return true;
//
//
//                            case MotionEvent.ACTION_UP:
//                                Toast.makeText(MainActivity.this,"Action Up",Toast.LENGTH_LONG).show();
//                                return true;
//
//
//                }

                float x = motionEvent.getX();
                float y = motionEvent.getY();

                if(action == MotionEvent.ACTION_DOWN){
                    //Toast.makeText(MainActivity.this,"Action Down",Toast.LENGTH_LONG).show();
                    pointer = new View(MainActivity.this);
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(100,100);
                    pointer.setBackgroundColor(Color.BLACK);
                    pointer.setX(x - 50);
                    pointer.setLayoutParams(layoutParams);
                    pointer.setY(y - 50);
                    rootLayout.addView(pointer);

                    return true;
                }
                else if(action == MotionEvent.ACTION_UP){
                    Toast.makeText(MainActivity.this,"Action uP",Toast.LENGTH_LONG).show();
                    rootLayout.removeView(pointer);

                    return true;
                }
                else if(action == MotionEvent.ACTION_MOVE){
                    Log.d("MainActivity","Action Move");
                    pointer.setX(x - 50);
                    pointer.setY(y - 50);
                    return true;
                }

                return false;
            }
        });
    }
}
