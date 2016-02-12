package com.example.company.areal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.List;
import java.util.Objects;

public class DATALIST extends AppCompatActivity {
    public static final String COURSE_TITLE = "COURSE TITLE";
    public static final String NEW_CONTENT = "New contetn";
    public static final int Detail_code = 10100;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    protected List<course> data;
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("new", "tag");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datalist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        data = ListViewTopics.getData();
        final ArrayAdapter<course> MyCustomAdapter = new MyCustomAdapter(this, 0, data);
        ListView listView = (ListView) findViewById(R.id.listViewLIST);
        listView.setAdapter(MyCustomAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                course Course = data.get(position);
                Displaydetail(Course);

            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void Displaydetail(course course) {
        Intent intent = new Intent(this, Main2Activity.class);
       intent.putExtra(COURSE_TITLE, course.getTitle());
        intent.putExtra(NEW_CONTENT, (CharSequence) course.getContent());
       startActivityForResult(intent, Detail_code);
    }

//    private void Displaydeail(course course) {
//        Intent intent = new Intent(this, Main2Activity.class);
//        intent.putExtra(COURSE_TITLE, course.getTitle());
//        intent.putExtra(NEW_CONTENT, (CharSequence) course.getContent());
//        startActivityForResult(intent, Detail_code);
//
//
//    }
    class MyCustomAdapter extends ArrayAdapter<course> {
    Context mycontext;
    List<course> myobjects;


    public MyCustomAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.mycontext= context;
        this.myobjects= objects;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        course Course= myobjects.get(position);
        LayoutInflater inflater= (LayoutInflater) mycontext.getSystemService(LAYOUT_INFLATER_SERVICE);
        View view= inflater.inflate(R.layout.pateekh,null);
       TextView tv= (TextView) view.findViewById(R.id.TvList);
        tv.setText(Course.getTitle());
        ImageView iv= (ImageView) view.findViewById(R.id.imageViewLIST);
        int resvalue= mycontext.getResources().getIdentifier("image_"+Course.getCourseNo(),"drawable",mycontext.getPackageName());
        iv.setImageResource(resvalue);
                return view;

    }

}

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "DATALIST Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.company.areal/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "DATALIST Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.company.areal/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);

        client.disconnect();
    }
}
