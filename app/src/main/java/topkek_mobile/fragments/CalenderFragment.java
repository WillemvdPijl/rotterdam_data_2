package topkek_mobile.fragments;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v7.app.ActionBarActivity;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;

        import topkek_mobile.fragments1.R;


public class CalenderFragment extends Fragment {
    public  CalenderFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calender, container, false);






    }
}