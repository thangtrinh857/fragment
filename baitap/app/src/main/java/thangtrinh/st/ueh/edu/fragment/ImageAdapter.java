package thangtrinh.st.ueh.edu.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ImageAdapter extends ArrayAdapter<String> {

    private Context context;

    private String[] images;

    public ImageAdapter(@NonNull Context context, @NonNull String[] objects) {
        super(context, R.layout.image_list_item, objects);
        images = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.image_list_item, parent, false);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        Context context = imageView.getContext();
        int id = context.getResources().getIdentifier(images[position], "drawable", context.getPackageName());
        imageView.setImageResource(id);
        return convertView;
    }
}
