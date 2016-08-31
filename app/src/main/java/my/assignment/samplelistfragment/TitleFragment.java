package my.assignment.samplelistfragment;

import android.app.Fragment;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by root on 8/30/16.
 */

public class TitleFragment extends Fragment {

    private onItemSelectedListener listener;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.title_fragment,container,false);

       final Button b1=(Button)view.findViewById(R.id.button);
       final Button  b2=(Button)view.findViewById(R.id.button2);
       final Button b3=(Button)view.findViewById(R.id.button3);
      final Button b4=(Button)view.findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Button Caption:",b1.getText().toString());
                updateFrame(b1.getText().toString());


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateFrame(b2.getText().toString());


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateFrame(b3.getText().toString());


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateFrame(b4.getText().toString());


            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

        @Override
    public void onAttach(Context context) {
            super.onAttach(context);
            try {

                listener = (onItemSelectedListener) context;

            } catch (ClassCastException e) {
                throw new ClassCastException(context.toString()
                        + " must implement SelectionListener");
            }

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    public interface onItemSelectedListener{
        public void onListItemSelected(String txt) ;
    }

    public void updateFrame(String s){
        listener.onListItemSelected(s);
    }
}
