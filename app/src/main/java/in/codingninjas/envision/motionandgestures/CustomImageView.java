package in.codingninjas.envision.motionandgestures;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CustomImageView extends AppCompatImageView {

    private String message;

    public CustomImageView(Context context) {
        super(context);
    }



    public CustomImageView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public CustomImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(message != null){
            Paint paint = new Paint();
            paint.setTextSize(100);
            paint.setColor(Color.BLACK);
            canvas.drawText(message,100,100,paint);
        }

    }
}
