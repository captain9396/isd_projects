package com.tolet.interfacejava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newButton1 = (Button)findViewById(R.id.diptosButton1);
        newButton1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView myText = (TextView)findViewById(R.id.diptosText);
                        myText.setText("Button 1 Clicked");
                    }
                }
        );

        Button newButton2 = (Button)findViewById(R.id.diptosButton2);
        newButton2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView myText = (TextView)findViewById(R.id.diptosText);
                        myText.setText("Button 2 Clicked");
                    }
                }
        );
    }
}









//        RelativeLayout diptosLayout = new RelativeLayout(this);
//        diptosLayout.setBackgroundColor(Color.GREEN);
//
//
//
//        Button redButton = new Button(this);
//        redButton.setText("Log In");
//        redButton.setBackgroundColor(Color.RED );
//
//        EditText username = new EditText(this);
//
//
//        redButton.setId(1);
//        username.setId(2);
//
//        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
//        );
//
//        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
//        );
//
//        usernameDetails.addRule(RelativeLayout.ABOVE , redButton.getId());
//        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        usernameDetails.setMargins(0,0,0,50);
//
//
//        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
//
//        Resources r = getResources();
//        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,
//                r.getDisplayMetrics()
//                );
//
//        username.setWidth(px);
//
//        diptosLayout.addView(redButton , buttonDetails);
//        diptosLayout.addView(username , usernameDetails);
//        setContentView(diptosLayout);