package thangtrinh.st.ueh.edu.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Intent intent = getIntent();

        String imageName = intent.getStringExtra("image");

        ImageView imageView = findViewById(R.id.ivImage);

        Context context = imageView.getContext();
        int id = context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());
        imageView.setImageResource(id);
    }
}