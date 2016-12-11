package bicoccalab.apephotoeditor;

import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class DisplayActivity extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        imageView = (ImageView) findViewById(R.id.imageViewDisplay);

        byte[] bytes = getIntent().getByteArrayExtra("bitmapbytes");
        Bitmap bmp = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);

        imageView.setImageBitmap(bmp);
    }
}
