package wcm.jcrogar.fca.wcm;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link paso1Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link paso1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class paso1Fragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_paso1, container, false);
    }
}