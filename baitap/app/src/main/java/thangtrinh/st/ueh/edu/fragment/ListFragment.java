package thangtrinh.st.ueh.edu.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rowView = inflater.inflate(R.layout.fragment_list, container, false);

        String[] menu = getResources().getStringArray(R.array.menu);

        ListView listView = rowView.findViewById(R.id.lvItem);
        listView.setAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, menu));
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            ContentFragment contentFragment = (ContentFragment) getParentFragmentManager().findFragmentById(R.id.contentFragment);
            contentFragment.setImage(i);
        });
        return rowView;
    }
}