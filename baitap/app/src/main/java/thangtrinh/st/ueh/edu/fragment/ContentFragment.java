package thangtrinh.st.ueh.edu.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ContentFragment extends Fragment {

    ListView listView;
    String[] imagesLst;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rowView = inflater.inflate(R.layout.fragment_list, container, false);

        listView = rowView.findViewById(R.id.lvItem);
        String[] images = getResources().getStringArray(R.array.images);

        ListView listView = rowView.findViewById(R.id.lvItem);
        setImage(0);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(getActivity(), ImageActivity.class);
            intent.putExtra("image", imagesLst[i]);
            startActivity(intent);
        });
        return rowView;
    }

    void setImage(int selectedMenu){
        @SuppressLint("Recycle") TypedArray images = getResources().obtainTypedArray(R.array.images);
        int contentId = images.getResourceId(selectedMenu, R.array.flowers);
        imagesLst = getResources().getStringArray(contentId);
        listView.setAdapter(new thangtrinh.st.ueh.edu.fragment.ImageAdapter(getActivity(), imagesLst));
    }
}