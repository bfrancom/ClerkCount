package com.benfrancom.clerkcount;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button buttonres;
    EditText txtbox1,txtbox2,txtbox3,txtbox4,txtbox5;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/


        txtbox1 =(EditText) findViewById(R.id.editText);
        txtbox2 =(EditText) findViewById(R.id.editText2);
        txtbox3 =(EditText) findViewById(R.id.editText3);
        txtbox4 =(EditText) findViewById(R.id.editText4);
        txtbox5 =(EditText) findViewById(R.id.editText5);
        tv = (TextView) findViewById(R.id.textView2);
        buttonres = (Button) findViewById(R.id.button);
        buttonres.setOnClickListener(new clicker());
    }

    class  clicker implements Button.OnClickListener
    {

        @Override
        public void onClick(View v) {

            String a,b,c,d,e;
            Integer vis;
            a = txtbox1.getText().toString();
            b = txtbox2.getText().toString();
            c = txtbox3.getText().toString();
            d = txtbox4.getText().toString();
            e = txtbox5.getText().toString();
            vis=Integer.parseInt(a)+Integer.parseInt(b)+Integer.parseInt(c)+Integer.parseInt(d)+Integer.parseInt(e);
            tv.setText(vis.toString());
            Toast.makeText(getApplicationContext(), "Total sacrament meeting count is :"+vis.toString(),Toast.LENGTH_LONG).show();

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
