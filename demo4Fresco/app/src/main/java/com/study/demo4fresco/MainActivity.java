package com.study.demo4fresco;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        setupView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupView() {
        SimpleDraweeView simpleDraweeView1 = (SimpleDraweeView) findViewById(R.id.image1);
        Uri logoUri = Uri.parse("https://raw.githubusercontent.com/liaohuqiu/fresco-docs-cn/docs/static/fresco-logo.png");
        simpleDraweeView1.setImageURI(logoUri);

        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) findViewById(R.id.image2);
        Uri aniImageUri = Uri.parse("https://camo.githubusercontent.com/588a2ef2cdcfb6c71e88437df486226dd15605b3/687474703a2f2f737261696e2d6769746875622e71696e6975646e2e636f6d2f756c7472612d7074722f73746f72652d686f7573652d737472696e672d61727261792e676966");
        ImageRequest request = ImageRequestBuilder.newBuilderWithSource(aniImageUri)
                .build();

        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setImageRequest(request)
                .setAutoPlayAnimations(true)
                .build();
        simpleDraweeView2.setController(controller);
    }
}
