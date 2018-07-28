package in.codingninjas.envision.motionandgestures;

import android.gesture.GestureOverlayView;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ViewGroup rootLayout;
    //View pointer;

    HashMap<Integer, View> map = new HashMap<>();

    VelocityTracker velocityTracker;

    GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gestureDetector = new GestureDetector(this,new GestureDetector.SimpleOnGestureListener(){


            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                Log.d("MainActivity","fling");
                return  true;
            }
        });

        CustomImageView imageView = findViewById(R.id.imageview);
        imageView.setMessage("ABC");

        rootLayout = findViewById(R.id.rootLayout);
//        rootLayout.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//
//                gestureDetector.onTouchEvent(motionEvent);
//
//                int action = motionEvent.getActionMasked();
////                switch (action){
////
////                    case MotionEvent.ACTION_DOWN:
////                            Toast.makeText(MainActivity.this,"Action Down",Toast.LENGTH_LONG).show();
////                            return true;
////
////
////                            case MotionEvent.ACTION_UP:
////                                Toast.makeText(MainActivity.this,"Action Up",Toast.LENGTH_LONG).show();
////                                return true;
////
////
////                }
//
//
//                int index = motionEvent.getActionIndex();
//                int id = motionEvent.getPointerId(index);
//
//                float x = motionEvent.getX(index);
//                float y = motionEvent.getY(index);
//
//                View pointer;
//
//                if(action == MotionEvent.ACTION_DOWN || action == MotionEvent.ACTION_POINTER_DOWN){
//
//                    velocityTracker = VelocityTracker.obtain();
//                    velocityTracker.addMovement(motionEvent);
//                    //Toast.makeText(MainActivity.this,"Action Down",Toast.LENGTH_LONG).show();
//                    pointer = new View(MainActivity.this);
//                    map.put(id,pointer);
//                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(100,100);
//                    pointer.setBackgroundColor(Color.BLACK);
//                    pointer.setX(x - 50);
//                    pointer.setLayoutParams(layoutParams);
//                    pointer.setY(y - 50);
//                    rootLayout.addView(pointer);
//
//                    return true;
//                }
//                else if(action == MotionEvent.ACTION_UP || action == MotionEvent.ACTION_POINTER_UP){
//                    velocityTracker.addMovement(motionEvent);
//                    pointer = map.get(id);
//                    Toast.makeText(MainActivity.this,"Action uP",Toast.LENGTH_LONG).show();
//                    rootLayout.removeView(pointer);
//
//                    return true;
//                }
//                else if(action == MotionEvent.ACTION_MOVE){
//                    velocityTracker.addMovement(motionEvent);
//
//                    for(int i=0;i<motionEvent.getPointerCount();i++){
//                        View mPointer = map.get(i);
//                        float mX = motionEvent.getX(i);
//                        float mY = motionEvent.getY(i);
//                        mPointer.setX(mX - 50);
//                        mPointer.setY(mY - 50);
//                    }
////
////                    velocityTracker.computeCurrentVelocity(100000);
////                    float xV = velocityTracker.getXVelocity();
////                    float yV = velocityTracker.getYVelocity();
////
////
////                    Log.d("MainActivity","X:" + xV + " Y: " + yV);
//
//                    return true;
//                }
//
//                return false;
//            }
//        });
    }

//    @Override
//    public boolean onDown(MotionEvent motionEvent) {
//        Log.d("MainActivity","ON DOWN");
//        return true;
//    }
//
//    @Override
//    public void onShowPress(MotionEvent motionEvent) {
//        Log.d("MainActivity","SHOW PRESS");
//    }
//
//    @Override
//    public boolean onSingleTapUp(MotionEvent motionEvent) {
//        Log.d("MainActivity","SINGLE TAP UP");
//        return true;
//    }
//
//    @Override
//    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
//        Log.d("MainActivity","SCROLL");
//        return true;
//    }
//
//    @Override
//    public void onLongPress(MotionEvent motionEvent) {
//        Log.d("MainActivity","long press");
//    }
//
//    @Override
//    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
//        Log.d("MainActivity","fling");
//        return true;
//    }
}
