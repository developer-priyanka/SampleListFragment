package my.assignment.samplelistfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TitleFragment.onItemSelectedListener {

    private TitleFragment tf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public void onListItemSelected(String txt) {

        FragmentManager fm =getFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        LayoutOne layone;
        Layouttwo laytwo;
        Layoutthree laythree;
        LayoutFour layFour;
        Log.i("Main Activity","entered on Listitemselected "+txt);
        if(txt.equals("Layout1")){
            layone=new LayoutOne();
            ft.replace(R.id.frame,layone);
            ft.commit();
        }
        if(txt.equals("Layout2")){
            laytwo=new Layouttwo();
            ft.replace(R.id.frame,laytwo);
            ft.commit();
        }
        if(txt.equals("Layout3")){
            laythree=new Layoutthree();
            ft.replace(R.id.frame,laythree);
            ft.commit();
        }
        if(txt.equals("Layout4")){
            layFour=new LayoutFour();
            ft.replace(R.id.frame,layFour);
            ft.commit();
        }
    }
}
